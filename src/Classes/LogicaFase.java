package Classes;

import Frames.Insercao_ScoreJDialog;
import Frames.TelaScoreCubeOfSpace;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LogicaFase extends JPanel implements ActionListener
{

  /*
   * N�o irei descorrer muito nesse peda�o do c�digo, entre as linhas 22 a 39
   * as vari�veis e os objetos necess�rios ser�o criados
   */
  private Image telaInicial, fundo, gameover, comida, itemDourado, itemRoxo,
          itemAnjo, itensVermelhos;
  private QuadradoPrincipal quadradoprincipal;
  private Timer timer;
  private GeradorDeCordenadas aleatorio;
  private PerdeJogo perdejogo;
  public static int[] Y = new int[300];
  public static int[] X = new int[300];
  static float vida = 10;
  private Date dataJogo, dataItemDourado, dataItemRoxo, dataItemBranco;

  /*
   * Note que a vari�veis com adjetivos em seu nome como por exemplo: "XRoxo"
   * (Seu signifcado �: A cordenada X do Item Roxo(O da carinha)) ou
   * "YAnjo"(Seu signicado �: A cordenada Y do item Branco(O item que ajuda o
   * jogador,mas dificilmente aparece))
   */
  public static int quemEstaComAMusica = 0, telaScoreAtivada = 0, validaItemDourado = 0, validaItemRoxo = 0, valorX = 0, valorY = 0, aux = 0, numeroCubosVermelhosTela = 0, defineOFim = 0,
          Xdourado = -31, Ydourado = -31, trapaca, XRoxo = -31, YRoxo = -31,
          localAnteriorX = 0, localAnteriorY = 0, inicio = 0,
          contaPerdePonto, XAnjo = -31, YAnjo = -31, validaItemAnjo = 0,
          quantiQuadradosPegos = 0, iniciaMusica = 0,
          determinaTelaInicial = 0, ajudaScoreNaTela = 0, score = 0, quantiCubosBrancos = 0, quantiCubosDourados = 0, quantiCubosRoxos = 0, quantiCubosAmarelosVermelhos, VerificaSeCampoScoreEstaAberto = 0;

  /*
   * Bom, as vari�veis floats(real) s�o marcadores de tempo e seus nomes s�o
   * auto-explicativos. Quero deixar claro que a vari�vel "float tempo" serve
   * para marcar o tempo do jogo,sendo facilmente entendida executando a
   * aplica��o e reparando no canto superior direito da tela.
   */
  float tempo = 0, tempoParaItemEspecialDourado = 0,
          tempoParaItemEspecialRoxo = 0, tempoParaItemEspecialAnjo = 0;

  /*
   * O m�todo Fase() � um construtor, leia um pouco sobre eles em:
   * http://pt.wikipedia.org/wiki/Construtor
   */
  public ReproduzMusica reproduzMusica;
  public MP3Musica musicaScore;
  public Frame frameJogo;
  public JMenuBar jmb;

  public LogicaFase(Frame frame, JMenuBar jmb)
  {
    this.jmb = jmb;
    jmb.getMenu(0).getItem(3).addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        MP3Musica tocador = new MP3Musica();
        telaScoreAtivada = 1;
        if (reproduzMusica != null)
        {
          reproduzMusica.musica.suspend();
        }

        if (musicaScore != null)
        {
          musicaScore.suspend();
        }

        tocador.mp3 = new File("res\\Musicas\\Megamen X5-OST-Unused Track - Mission Report.mp3");
        tocador.start();
        tocador.situacao = 1;
        new TelaScoreCubeOfSpace(frameJogo, true);
        tocador.stop();
        tocador.situacao = 0;
        System.out.println(reproduzMusica);
        if (reproduzMusica != null && quemEstaComAMusica == 0)
        {
          reproduzMusica.musica.resume();
        }

        if (musicaScore != null && quemEstaComAMusica == 1)
        {
          musicaScore.resume();
        }

        telaScoreAtivada = 0;

      }
    });

    setFocusable(true); // foca na tela, assim , os comandos apertados no
    // teclado s�o compreendidos
    setDoubleBuffered(true); // cria um buffer de mem�ria, assim da menos

    // "leg" na aplica��o
    addKeyListener(new TecladoAdapter()); // Em termos chulos aqui estamos
    // instanciando(criando) um
    // componente que consegui
    // compreender o teclado

    /*
     * Bom, a l�gica entre a linha 78 a 89 se repete ent�o explicarei uma
     * �nica vez: O ImageIcon serve somente para criar um objeto do tipo
     * ImageIcon, que n�o � um componente visual do swing. Depois o objeto
     * do tipo IMAGEM!! recebe realmente uma imagem, repare tamb�m que cada
     * imagem possue um endere�o que nesse caso est� localizada no pr�prio
     * projeto, logo, n�o � necess�rio passar o endere�o completo.
     */
    ImageIcon referencia = new ImageIcon("res\\Imagens\\fundo.jpg");
    fundo = referencia.getImage();
    referencia = new ImageIcon("res\\Imagens\\game-over.png");
    gameover = referencia.getImage();
    referencia = new ImageIcon("res\\Imagens\\QuadradoAmarelo.png");
    comida = referencia.getImage();
    referencia = new ImageIcon("res\\Imagens\\QuadradoDourado.png");
    itemDourado = referencia.getImage();
    referencia = new ImageIcon("res\\Imagens\\QuadradoRoxo.png");
    itemRoxo = referencia.getImage();
    referencia = new ImageIcon("res\\Imagens\\QuadradoBranco.png");
    itemAnjo = referencia.getImage();
    referencia = new ImageIcon("res\\Imagens\\Inicial.png");
    telaInicial = referencia.getImage();
    referencia = new ImageIcon("res\\Imagens\\QuadradoVermelho.png");
    itensVermelhos = referencia.getImage();

    /*
     * Estamos instanciando outras classes que ser�o necess�rias entre as
     * linhas 95 a 97
     */
    quadradoprincipal = new QuadradoPrincipal();
    aleatorio = new GeradorDeCordenadas();
    perdejogo = new PerdeJogo();

    /*
     * O timer � de vital import�ncia na nossa aplica��o, pois com ele
     * estamos definindo em quanto e quanto tempo a tela ser� atualizada.
     */ dataJogo = new Date();
    dataItemDourado = new Date();
    dataItemRoxo = new Date();
    timer = new Timer(5, this); // instanciamos o objeto e definimos o
    // tempo e qual classe ser� atualizada, no
    // caso ser� a mesma(this)
    timer.start(); // invocamos o m�todo start() que � auto-explicativo

  }

  /*
   * A classe public void paint(Graphics g) serve para imprimir as imagens e
   * textos na tela, no entanto, utilizei-a tamb�m para outras opera��es, isso
   * n�o � recomendado. Parti para esse principio l�gico, a partir de um
   * pensamento simples; "essa classe � atualizada toda hora, logo, posso
   * fazer outras opera��es que necessitam ser executadas constantemente na
   * mesma. Obs.: No c�digo a partir da linha 120 vou explicar isso melhor".
   */
  @Override
  public void paint(Graphics g)
  {
    Graphics2D graficos = (Graphics2D) g; // cria um objeto do tipo
    // Graphics2D que recebe as
    // caracteristicas de "g"

    if (determinaTelaInicial == 0)
    {
      graficos.drawImage(telaInicial, 0, 0, null);
    } else
    {
      /*
       * Como esse m�todo(paint()) � inicializado toda hora, temos que ter
       * um sistema l�gico para reproduzir a m�sica uma �nica vez, pois
       * caso contr�rio, a cada 5 milisegundos uma nova m�sica ser�
       * inicializada, criando assim um som um tanto quanto psicod�lico.
       */

      if (iniciaMusica != 1)
      {
        reproduzMusica = new ReproduzMusica(); // um objeto da classe
        // ReproduzMusica()
        // �
        // instanciado
        reproduzMusica.inicializarMusicas(); // o m�todo para reproduzir a m�sica
        // �
        // sumonado.
				/*
         * Obs.: Foi utilizado um sistema de Threads(Habilita a divis�o
         * das opera��es, onde varias opera��es s�o realizadas
         * concorrentemente)
         */
        iniciaMusica = 1;
      }

      defineOFim = 0;
      perdejogo.fazPerder(); // aqui compara se o quadrado principal, est�
      // na
      // mesma posi��o que outro quadrado vermelho
      // no
      // mapa, defineOfim = 1; caso isso tenha
      // ocorrido

      if (defineOFim == 1)
      { // perde pontua��o de acordo com a linha 147
        vida = (float) (vida - 0.07);
      }

      if (vida <= 0)
      { // se a pontua��o for menor que zero o jogador
        // perde e imprime a tela de "game over".

        graficos.drawImage(gameover, 0, 0, null);
        repaint();
        if (VerificaSeCampoScoreEstaAberto == 0 && telaScoreAtivada == 0)
        {
          try
          {
            VerificaSeCampoScoreEstaAberto = 1;

            int guardaMusica = reproduzMusica.iMusicas;
            reproduzMusica.musica.suspend();
            musicaScore = new MP3Musica();
            musicaScore.mp3 = new File(reproduzMusica.musicas[12]);
            musicaScore.situacao = 1;
            musicaScore.start();
            graficos.drawImage(gameover, 0, 0, null);
            quemEstaComAMusica = 1;
            Insercao_ScoreJDialog is = Insercao_ScoreJDialog.getInstance(frameJogo, false);
            is.iniciar(Math.round(tempo), quantiCubosAmarelosVermelhos + quantiCubosBrancos + quantiCubosDourados + quantiCubosRoxos, score - Math.round(tempo), dataJogo);
            is.setVisible(true);

            repaint();
          } catch (Exception ex)
          {
            System.out.println(ex.getCause());
          }
        }
      } else
      {

        graficos.drawImage(fundo, 0, 0, null); // imprime a imagem de
        // fundo

        graficos.drawImage(quadradoprincipal.getImagem(),
                quadradoprincipal.x, quadradoprincipal.y, this); // imprime
        // o
        // quadrado

        /* Aqui imprime os outros quadrados vermelhos */
        for (int i = 0; i < numeroCubosVermelhosTela; i++)
        {
          if (i + 1 == numeroCubosVermelhosTela)
          {
            graficos.drawImage(comida, X[i], Y[i], this);
          } else
          {
            graficos.drawImage(itensVermelhos, X[i],
                    Y[i], this);
          }

        }

        /*
         * GERA O VALOR ALEATORIO E IMPRIME O QUADRADO AMARELO E CONFERE
         * SE O JOGADOR PEGOU O ITEM AMARELO E GERA OUTRO ITEM QUANDO
         * NECESSARIO, ISSO OCORRE ENTRE AS LINHAS 189 a 234.
         */
        if (aux == 0)
        {

          int i = 0, confirma = 0;

          // EVITA QUE UM QUADRADO VERMELHO FIQUE MUITO DENTRO DO
          // OUTRO
          while (true)
          {

            valorX = aleatorio.geradorDeCordenadaX();
            valorY = aleatorio.geradorDeCordenadaY();

            for (i = 0; i <= numeroCubosVermelhosTela; i++)
            {

              if ((valorX + 15 > X[i] && valorX - 15 < X[i])
                      && (valorY + 60 > Y[i] && valorY - 15 < Y[i]))
              {
              } else
              {
                confirma++;
              }
            }

            if (i == confirma || i == 0)
            {

              graficos.drawImage(comida,
                      valorX,
                      valorY, this);
              break;
            }
            confirma = 0;
            i = 0;
          }

          aux = 1;

        } else
        {
          graficos.drawImage(comida, valorX,
                  valorY, this);
          /*
           * CONFERE SE O JOGADOR ACERTOU O ITEM AMARELO E FAZ OUTRAS
           * COISAS QUE S�O OBVIAS
           */
          if ((quadradoprincipal.x + 10 > valorX && quadradoprincipal.x - 10 < valorX)
                  && (quadradoprincipal.y + 10 > valorY && quadradoprincipal.y - 10 < valorY))
          {
            aux = 0;

            X[numeroCubosVermelhosTela] = quadradoprincipal.x;
            Y[numeroCubosVermelhosTela] = quadradoprincipal.y;
            numeroCubosVermelhosTela++;
            quantiCubosAmarelosVermelhos++;
            vida++;
            quantiQuadradosPegos++;
            score += 10;
          }
        }

        graficos.setColor(Color.WHITE); // s� para a letra ficar branca

        /*
         * tem que aumentar o tempo todo instante obviamente
         * !_!(Vinicius)
         */
        tempo = (float) (new Date().getTime() - dataJogo.getTime()) / 1000;

        tempoParaItemEspecialDourado = (int) (new Date().getTime() - dataItemDourado.getTime()) / 1000;
        tempoParaItemEspecialRoxo = (int) (new Date().getTime() - dataItemRoxo.getTime()) / 1000;
        if (dataItemBranco != null)
        {
          tempoParaItemEspecialAnjo = (int) (new Date().getTime() - dataItemBranco.getTime()) / 1000;
        }

        /* gera um objeto da classe Random */
        /* LOGICA ITEM DOURADO */
        if (tempoParaItemEspecialDourado == 60 && validaItemDourado == 0)
        {
          Xdourado = aleatorio.geradorDeCordenadaX();
          Ydourado = aleatorio.geradorDeCordenadaY();
          validaItemDourado = 1;
        } else
        {

          if (tempoParaItemEspecialDourado == 80)
          {
            tempoParaItemEspecialDourado = 0;
            dataItemDourado = new Date();
            Xdourado = -30;
            Ydourado = -31;
            validaItemDourado = 0;
          }
        }

        if (tempoParaItemEspecialDourado > 60)
        {
          graficos.drawImage(itemDourado, Xdourado, Ydourado, this);
        }

        if ((quadradoprincipal.x + 7 > Xdourado && quadradoprincipal.x - 7 < Xdourado)
                && (quadradoprincipal.y + 7 > Ydourado && quadradoprincipal.y - 7 < Ydourado))
        {
          vida += 20;
          tempoParaItemEspecialDourado = 0;
          dataItemDourado = new Date();
          Xdourado = -30;
          Ydourado = -31;
          score += 20;
          quantiCubosDourados++;
          validaItemDourado = 0;

        }
        /* FIM DA L�GICA DO ITEM DOURADO */

        /* LOGICA ITEM ROXO */
        if (tempoParaItemEspecialRoxo == 30 && validaItemRoxo == 0)
        {

          XRoxo = aleatorio.geradorDeCordenadaX();
          YRoxo = aleatorio.geradorDeCordenadaY();
          System.out.println(XRoxo + "*-*" + YRoxo);
          validaItemRoxo = 1;
        } else
        {

          if (tempoParaItemEspecialRoxo == 60)
          {
            tempoParaItemEspecialRoxo = 0;
            dataItemRoxo = new Date();
            XRoxo = -30;
            YRoxo = -31;
            validaItemRoxo = 0;
          }
        }

        if (tempoParaItemEspecialRoxo > 30)
        {
          graficos.drawImage(itemRoxo, XRoxo, YRoxo, this);
        }

        if ((quadradoprincipal.x + 15 > XRoxo && quadradoprincipal.x - 15 < XRoxo)
                && (quadradoprincipal.y + 15 > YRoxo && quadradoprincipal.y - 15 < YRoxo))
        {
          vida -= 5;
          tempoParaItemEspecialRoxo = 0;
          dataItemRoxo = new Date();
          XRoxo = -31;
          YRoxo = -31;
          quantiCubosRoxos++;
          validaItemRoxo = 0;
        }
        /* FIM DA L�GICA DO ITEM ROXO */

        /* LOGICA ITEM BRANCO */
        if (aleatorio.geradorDeNumero(150000) == 1 && validaItemAnjo != 1)
        {
          XAnjo = aleatorio.geradorDeCordenadaX();
          YAnjo = aleatorio.geradorDeCordenadaY();
          validaItemAnjo = 1;
          dataItemBranco = new Date();
        } else
        {

          if (validaItemAnjo == 1 && tempoParaItemEspecialAnjo > 20)
          {
            tempoParaItemEspecialAnjo = 0;
            XAnjo = 0;
            YAnjo = 0;
          }

        }

        if (tempoParaItemEspecialAnjo < 20 && validaItemAnjo == 1)
        {
          graficos.drawImage(itemAnjo, XAnjo, YAnjo, this);
        }

        if ((quadradoprincipal.x + 10 > XAnjo && quadradoprincipal.x - 10 < XAnjo)
                && (quadradoprincipal.y + 10 > YAnjo && quadradoprincipal.y - 10 < YAnjo))
        {
          score += 30;
          vida += 3;
          tempoParaItemEspecialAnjo = 0;
          if (numeroCubosVermelhosTela >= 15)
          {
            numeroCubosVermelhosTela -= 15;
          } else
          {
            numeroCubosVermelhosTela = 0;
          }
          XAnjo = -31;
          YAnjo = -31;
          validaItemAnjo = 0;
          quantiCubosBrancos++;
        }

        /* FIM DA L�GICA DO ITEM BRANCO */
        graficos.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font("Serif", Font.BOLD, 25);
        graficos.setFont(font);
        graficos.setColor(Color.LIGHT_GRAY);
        graficos.drawString("VIDA: " + Math.round(vida) + "   TEMPO: " + ((new Date().getTime() - dataJogo.getTime()) / 1000) + "s", 350, 20);
        /*
         * Como falei na classe PerdeJogo(), aqui � onde reseta o jogo,
         * caso o jogador aperte uma tecla invalida
         */

        graficos.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        font = new Font("Serif", Font.BOLD, 40);
        graficos.setFont(font);
        graficos.setColor(Color.LIGHT_GRAY);
        graficos.drawString("" + quantiCubosAmarelosVermelhos, 620, 180); //cubos amarelos
        graficos.drawString("" + quantiCubosDourados, 620, 290); // cubos dourados
        graficos.drawString("" + quantiCubosBrancos, 804, 180); // cubos brancos
        graficos.drawString("" + quantiCubosRoxos, 804, 290); // cubos roxos
        graficos.drawString("" + score, 672, 360);

        if (trapaca == 1)
        {
          defineOFim = 0;
          numeroCubosVermelhosTela = 0;
          quadradoprincipal = new QuadradoPrincipal(); // cria uma
          // novo
          // quadrado
          // aqui
          // !_!
          aux = 0;
          vida = 10;
          tempo = 0;
          trapaca = 0;
          validaItemAnjo = 0;
          quantiQuadradosPegos = 0;
          quantiCubosAmarelosVermelhos = 0;
          quantiCubosBrancos = 0;
          quantiCubosDourados = 0;
          quantiCubosRoxos = 0;
          quantiQuadradosPegos = 0;
          tempoParaItemEspecialDourado = 0;
          tempoParaItemEspecialRoxo = 0;
          tempoParaItemEspecialAnjo = 0;
          tempo = 0;
          score = 0;
          quantiQuadradosPegos = 0;
          validaItemAnjo = 0;
          inicio = 0;

        }
        g.dispose(); // isso aqui � importante, pois at� onde sei libera
        // a
        // mem�ria que estava sendo utilizada nos N
        // objetos
        // da tela, assim evita o Stack OverFlow.
      }
    }
    repaint();
  }

  @Override
  // significa que o c�digo foi copiado de algum lugar
  // aqui � onde teremos o tratamento da informa�o toda hora
  public void actionPerformed(ActionEvent arg0)
  {

    localAnteriorX = quadradoprincipal.x;
    localAnteriorY = quadradoprincipal.y;
    quadradoprincipal.mexer(); // mexe na variavel X e Y do QUADRADO
    // VERMELHO PRINCIPAL

    /*
     * Caso o jogador pare na parede, o mesmo perder� vida conforme est�
     * escrito nesse if
     */
    if (localAnteriorX == quadradoprincipal.x
            && localAnteriorY == quadradoprincipal.y && inicio == 1)
    {
      contaPerdePonto++;
      if (contaPerdePonto == 50)
      {
        vida--;
        contaPerdePonto = 0;
      }

    }

  }

  /* TRATAMENTO DO TECLADO */
  private class TecladoAdapter extends KeyAdapter
  {

    @Override
    public void keyPressed(KeyEvent e)
    {
      if (e.getKeyCode() == KeyEvent.VK_ENTER)
      {
        try
        {

          if (Insercao_ScoreJDialog.getInstance(frameJogo, false).isVisible())
          {
            Insercao_ScoreJDialog.getInstance(frameJogo, false).setVisible(false);
          }

          if (VerificaSeCampoScoreEstaAberto == 1)
          {
            musicaScore.stop();
            reproduzMusica.musica.resume();
            VerificaSeCampoScoreEstaAberto = 0;
            reproduzMusica.musica.situacao = 0;
          }
          quemEstaComAMusica = 0;
          defineOFim = 0;
          numeroCubosVermelhosTela = 0;
          quadradoprincipal = new QuadradoPrincipal(); // cria uma novo
          score = 0;
          aux = 0;
          vida = 10;
          validaItemAnjo = 0;
          quantiQuadradosPegos = 0;
          quantiCubosAmarelosVermelhos = 0;
          quantiCubosBrancos = 0;
          quantiCubosDourados = 0;
          quantiCubosRoxos = 0;
          quantiQuadradosPegos = 0;
          tempoParaItemEspecialDourado = 0;
          tempoParaItemEspecialRoxo = 0;
          tempoParaItemEspecialAnjo = 0;
          tempo = 0;
          score = 0;
          validaItemAnjo = 0;
          inicio = 0;
          determinaTelaInicial = 1;
          dataJogo = new Date();
          dataItemBranco = new Date();
          dataItemRoxo = new Date();
          dataItemDourado = new Date();
          repaint();
        } catch (Exception ex)
        {
          System.out.println(ex.getCause());
        }
      }
      quadradoprincipal.KeyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
      // TODO Auto-generated method stub
      quadradoprincipal.KeyReleased(e);
    }

  }

}
