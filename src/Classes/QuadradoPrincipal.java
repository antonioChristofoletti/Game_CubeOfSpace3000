package Classes;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class QuadradoPrincipal
{

  public static int x = 100, y = 100; // cordenadas da pe�a principal
  private int dx, dy; // auxiliares que ir�o mudar as cordenadas (x e y).
  private Image imagem; // Auto-explicativo

  /*
   * Aqui est� instanciando a imagem do quadrado e dando valores iniciais as
   * cordenadas (x e y )
   */
  public QuadradoPrincipal()
  {
    ImageIcon referencia = new ImageIcon(
            "res\\Imagens\\QuadradoJogador.png");
    imagem = referencia.getImage();

    this.x = 100;
    this.y = 100;
  }

  /*
   * Esse m�todo tem a fun��o de mudar o valor das variaveis X e Y, dependendo
   * da tecla apertada
   */
  public void mexer()
  {

    /*
     * Os if e os elses s�o necess�rios para delimitar a tela. Repare que a
     * altura e o tamanho da tela est�o incluindos , para assim, o jogador
     * n�o possa sair da vis�o do Jframe.
     */
    if (x > 0 && x < TelaDoJogo.limiteLargura - 50)
    {
      x += dx;
    }
    else
    {
      if (x == 0 && dx > 0)
      {
        x += dx;
      }
      else
      {
        if (x == TelaDoJogo.limiteLargura - 50 && dx < 0)
        {
          x += dx;
        }
      }
    }

    if (y > 0 && y < TelaDoJogo.limiteAltura - 95)
    {
      y += dy;
    }
    else
    {
      if (y == 0 && dy > 0)
      {
        y += dy;
      }
      else
      {
        if (y == TelaDoJogo.limiteAltura - 95 && dy < 0)
        {
          y += dy;
        }
      }
    }

  }

  /*
   * S� serve para returnar a imagem do quadradoPrincipal(O quadrado Vermelho)
   * quando necess�rio
   */
  public Image getImagem()
  {
    return imagem;
  }

  /* Nesse m�todo ser� invocado quando o usu�rio apertar alguma tecla */
  public void KeyPressed(KeyEvent tecla)
  {

    int codigo = tecla.getKeyCode();
    /* para n�o efetuar dois movimentos ao mesmo tempo */
    dy = 0;
    dx = 0;

    if (codigo == KeyEvent.VK_UP)
    {
      dy = -2; // delimita a velocidade da locomo��o
      LogicaFase.inicio = 1; // serve saber se o usu�rio apertou alguma tecla
      // valida(CIMA,BAIXO,DIREITA,ESQUERDA E ENTER)
    }

    /* Vide linha 83 */
    if (codigo == KeyEvent.VK_DOWN)
    {
      dy = 2;
      LogicaFase.inicio = 1;
    }
    /* Vide linha 83 */
    if (codigo == KeyEvent.VK_LEFT)
    {
      dx = -2;
      LogicaFase.inicio = 1;
    }
    /* Vide linha 83 */
    if (codigo == KeyEvent.VK_RIGHT)
    {
      dx = 2;
      LogicaFase.inicio = 1;
    }

    /*
     * H� uma situa��o muito interessante no tratamento de teclas que � a
     * seguinte: Caso o usu�rio aperte uma tecla que n�o possua um
     * tratamente como, por exemplo: os tratamentos entre a linha 82 a 102, o objeto que
     * estava se locomovendo na tela ir� congelar(facilitando a vida do
     * jogador, mas n�o � isso que queremos hehe, ent�o, quando um bot�o desse
     * tipo for pressionado iremos resetar o game, funcionando como uma puni��o !_!.
     * Nesse sistema essa situa��o ocorre, ent�o, criei um IF para "pegar" o usu�rio safado que
     * pretende burlar meu sistema hehe, vide linha 135 a 140)
     */
    if (codigo != KeyEvent.VK_UP && codigo != KeyEvent.VK_DOWN
            && codigo != KeyEvent.VK_LEFT && codigo != KeyEvent.VK_RIGHT
            && codigo != KeyEvent.VK_ENTER)
    {
      LogicaFase.trapaca = 1;
    }

  }

  public void KeyReleased(KeyEvent tecla)
  {

    /*
     * Caso o usu�rio n�o aperte nada entra aqui. Optei por deixar esse
     * m�todo in�til(nesse caso), pois desse modo, posso lembrar no futuro
     * que h� um m�todo que compreende essa situa��o !_!
     */
  }
}