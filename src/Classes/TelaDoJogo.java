package Classes;

import Frames.TelaRegras;
import Frames.TelaDireitosAutorais;
import Frames.TelaQuemSomos;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaDoJogo extends JFrame
{

  public static int largura = 920;
  public static int altura = 439;
  public static int limiteLargura = 510;
  public static int limiteAltura = 439;
  private Image caveira;
  public JLabel jl;

  public TelaDoJogo()
  {
    JMenuBar barraMenu = new JMenuBar();

    JMenu menu = new JMenu("Menu");

    JMenuItem sobre = new JMenuItem("Quem Somos");

    sobre.addActionListener(new ActionListener()
    {

      @Override
      public void actionPerformed(ActionEvent e)
      {

        TelaQuemSomos.getInstance().setVisible(true);
      }
    });

    JMenuItem sair = new JMenuItem("Sair");
    sair.addActionListener(new ActionListener()
    {

      @Override
      public void actionPerformed(ActionEvent e)
      {

        int decicao = JOptionPane.showConfirmDialog(null, "Deseja Encerrar o Sistema?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
        if (decicao == 0)
        {
          System.exit(0);
        }
      }
    });

    JMenuItem regras = new JMenuItem("Regras");
    regras.addActionListener(new ActionListener()
    {

      @Override
      public void actionPerformed(ActionEvent e)
      {

        TelaRegras.getInstance().setVisible(true);
      }
    });

    JMenuItem direitosAutorais = new JMenuItem("Direitos Autorais");
    direitosAutorais.addActionListener(new ActionListener()
    {

      @Override
      public void actionPerformed(ActionEvent e)
      {
        TelaDireitosAutorais.getInstance().setVisible(true);

      }
    });

    JMenuItem score = new JMenuItem("Score");
    
    menu.add(regras);
    menu.add(sobre);
    menu.add(direitosAutorais);
    menu.add(score);
    menu.add(sair);

    barraMenu.add(menu);
    this.setJMenuBar(barraMenu);

    LogicaFase fase = new LogicaFase(this, barraMenu);
    add(fase); 

    setTitle("Cube of Space 3000.Beta.1.9.");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(largura, altura);
    setLocationRelativeTo(null);
    setResizable(false);
    
    setVisible(true);
    ImageIcon imagemTituloJanela = new ImageIcon("res\\Imagens\\QuadradoJogador.png");
    setIconImage(imagemTituloJanela.getImage());
  }

  public static void main(String[] args)
  {
      TelaDoJogo telaDoJogo = new TelaDoJogo();
  }
}
