package Frames;

import Classes.Jogador;
import conexao.ConexaoBancoJogo;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Insercao_ScoreJDialog extends javax.swing.JDialog
{
  
  String nome;
  int tempoDecorido;
  Integer CubosPegos;
  Date dataFinal, dataInicial;
  Integer pontuacaoFinal;
  private static Insercao_ScoreJDialog Insercao_ScoreJDialog;
  
  private Insercao_ScoreJDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    ImageIcon imagemTituloJanela = new ImageIcon("res\\Imagens\\QuadradoAmarelo.png");
    setIconImage(imagemTituloJanela.getImage());
  }
  
  public static Insercao_ScoreJDialog getInstance(java.awt.Frame parent, boolean modal)
  {
    if (Insercao_ScoreJDialog == null)
    {
      Insercao_ScoreJDialog = new Insercao_ScoreJDialog(parent, modal);
    }
    Insercao_ScoreJDialog.setLocationRelativeTo(null);
    return Insercao_ScoreJDialog;
  }
  
  public void iniciar(int tempoDecorido, int CubosPegos, int pontuacaoFinal, Date data)
  {
    try
    {
      this.dataInicial = data;
      this.tempoDecorido = tempoDecorido;
      this.CubosPegos = CubosPegos;
      this.dataFinal = new Date();
      this.pontuacaoFinal = pontuacaoFinal;
      txtNome.setText(nome);
      txtCubosPegos.setText(String.valueOf(CubosPegos));
      txtData.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(dataFinal));
      txtPontuacaoFinal.setText(String.valueOf(pontuacaoFinal));
      txtTempoDecorido.setText(String.valueOf(tempoDecorido) + " segundos");
      setSize(500, 300);
      setLocationRelativeTo(null);
      setResizable(false);
    } catch (Exception ex)
    {
      JOptionPane.showMessageDialog(null, "Erro ao Inicializar a Tela de Inserção de Score.");
      this.dispose();
    }
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTempoDecorido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCubosPegos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPontuacaoFinal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inserção Score");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Inserção Score");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 0, 190, 30);

        jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 31, 500, 10);

        txtNome.setBackground(new java.awt.Color(153, 153, 153));
        txtNome.setForeground(new java.awt.Color(204, 255, 255));
        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(130, 50, 200, 20);

        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 50, 50, 14);

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Tempo Decorido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 150, 14);

        txtTempoDecorido.setBackground(new java.awt.Color(153, 153, 153));
        txtTempoDecorido.setForeground(new java.awt.Color(0, 51, 204));
        txtTempoDecorido.setEnabled(false);
        getContentPane().add(txtTempoDecorido);
        txtTempoDecorido.setBounds(130, 80, 320, 20);

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Cubos Pegos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 110, 120, 14);

        txtCubosPegos.setBackground(new java.awt.Color(153, 153, 153));
        txtCubosPegos.setForeground(new java.awt.Color(0, 51, 204));
        txtCubosPegos.setToolTipText("");
        txtCubosPegos.setEnabled(false);
        getContentPane().add(txtCubosPegos);
        txtCubosPegos.setBounds(130, 110, 320, 20);

        jLabel5.setBackground(new java.awt.Color(0, 51, 255));
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("  Data:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 140, 50, 14);

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(153, 153, 153));
        txtData.setForeground(new java.awt.Color(0, 51, 204));
        txtData.setEnabled(false);
        getContentPane().add(txtData);
        txtData.setBounds(130, 140, 320, 20);

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("  Pontuação Final:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 170, 140, 14);

        txtPontuacaoFinal.setBackground(new java.awt.Color(153, 153, 153));
        txtPontuacaoFinal.setForeground(new java.awt.Color(0, 51, 204));
        txtPontuacaoFinal.setEnabled(false);
        getContentPane().add(txtPontuacaoFinal);
        txtPontuacaoFinal.setBounds(130, 170, 320, 20);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 220, 140, 25);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 220, 140, 25);

        btnSelecionar.setBackground(new java.awt.Color(102, 102, 102));
        btnSelecionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSelecionar.setForeground(new java.awt.Color(51, 51, 255));
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelecionar);
        btnSelecionar.setBounds(340, 45, 110, 25);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, -10, 500, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
  {//GEN-HEADEREND:event_formWindowClosing
    int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Inserção de Score?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
    if (decicao == 0)
    {
      this.dispose();
    }
  }//GEN-LAST:event_formWindowClosing

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
  {//GEN-HEADEREND:event_jButton1ActionPerformed
    if (txtNome.getText().equals(""))
    {
      JOptionPane.showMessageDialog(null, "Selecione o Campo de Pesquisa de Nome.");
    } else
    {
      ConexaoBancoJogo c = new conexao.ConexaoBancoJogo();
      c.conectar();
      System.out.println("insert into score (nome,tempoDecorido,CubosPegos,data,pontuacaoFinal) values('" + txtNome.getText() + "','" + new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(dataInicial) + "'," + CubosPegos + ",'" + new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(dataFinal) + "'," + pontuacaoFinal + ")");
      if (new Jogador().atualizarStatusCubeOfSpace3000(txtNome.getText(), Integer.parseInt(txtPontuacaoFinal.getText())) && c.executar("insert into score (nome,tempoDecorido,CubosPegos,data,pontuacaoFinal) values('" + txtNome.getText() + "','" + new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(dataInicial) + "'," + CubosPegos + ",'" + new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(dataFinal) + "'," + pontuacaoFinal + ")"))
      {
        JOptionPane.showMessageDialog(null, "Inserção Realizada com Sucesso.");
        dispose();
      } else
      {
        JOptionPane.showMessageDialog(null, "Erro ao Inserir Score. Tente Novamente.");
      }
      
    }
  }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Inserção de Score?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
      if (decicao == 0)
      {
        this.dispose();
      }
    }//GEN-LAST:event_jButton2ActionPerformed

  private void txtNomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNomeActionPerformed
  {//GEN-HEADEREND:event_txtNomeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
      SelecionarJogador sj = new SelecionarJogador(null, true);
      sj.setInsercao_ScoreJDialog(this);
      sj.setVisible(true);
      
    }//GEN-LAST:event_btnSelecionarActionPerformed
  
  public static void main(String args[])
  {
    
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        Insercao_ScoreJDialog dialog = new Insercao_ScoreJDialog(new javax.swing.JFrame(), true);
        
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e)
          {
            System.exit(0);
          }
        });
        dialog.setSize(515, 315);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
      }
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCubosPegos;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPontuacaoFinal;
    private javax.swing.JTextField txtTempoDecorido;
    // End of variables declaration//GEN-END:variables

  void carregar(Jogador j)
  {
    txtNome.setText(j.getNome());
  }
}
