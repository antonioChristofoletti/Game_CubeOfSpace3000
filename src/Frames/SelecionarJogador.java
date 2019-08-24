package Frames;

import Classes.Jogador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SelecionarJogador extends javax.swing.JDialog
{

  Insercao_ScoreJDialog isj;

  public void setInsercao_ScoreJDialog(Insercao_ScoreJDialog isj)
  {
    this.isj = isj;
  }

  private void preencherTabela(List<Jogador> listaJogador)
  {
    Jogador j = new Jogador();
    DefaultTableModel tabelaJogador = (DefaultTableModel) tblJogadores.getModel();
    tabelaJogador.setNumRows(0);

    if (listaJogador != null)
    {
      for (Jogador i : listaJogador)
      {
        Object[] obj = new Object[]
        {
          i.getNome()
        };
        tabelaJogador.addRow(obj);
      }
    } else
    {
      JOptionPane.showMessageDialog(null, "Nenhum Jogador Encontrado.");
    }

  }

  public SelecionarJogador(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    setResizable(false);
    setSize(760, 430);
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jLabel2 = new javax.swing.JLabel();
    txtNome = new javax.swing.JTextField();
    jSeparator2 = new javax.swing.JSeparator();
    btnConfirmar = new javax.swing.JButton();
    btnPesquisar = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblJogadores = new javax.swing.JTable();
    txtFundo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Selecionar Jogador(a)");
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(java.awt.event.WindowEvent evt)
      {
        formWindowClosing(evt);
      }
    });
    getContentPane().setLayout(null);

    jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(51, 51, 255));
    jLabel2.setText("Jogador:");
    getContentPane().add(jLabel2);
    jLabel2.setBounds(70, 60, 85, 24);

    txtNome.setBackground(new java.awt.Color(153, 153, 153));
    txtNome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
    txtNome.setForeground(new java.awt.Color(204, 255, 255));
    txtNome.addCaretListener(new javax.swing.event.CaretListener()
    {
      public void caretUpdate(javax.swing.event.CaretEvent evt)
      {
        txtNomeCaretUpdate(evt);
      }
    });
    txtNome.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        txtNomeActionPerformed(evt);
      }
    });
    getContentPane().add(txtNome);
    txtNome.setBounds(160, 60, 410, 30);
    getContentPane().add(jSeparator2);
    jSeparator2.setBounds(662, 140, 2, 10);

    btnConfirmar.setBackground(new java.awt.Color(102, 102, 102));
    btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnConfirmar.setForeground(new java.awt.Color(51, 51, 255));
    btnConfirmar.setText("Confirmar");
    btnConfirmar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnConfirmarActionPerformed(evt);
      }
    });
    getContentPane().add(btnConfirmar);
    btnConfirmar.setBounds(340, 340, 133, 33);

    btnPesquisar.setBackground(new java.awt.Color(102, 102, 102));
    btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnPesquisar.setForeground(new java.awt.Color(51, 51, 255));
    btnPesquisar.setText("Pesquisar");
    btnPesquisar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnPesquisarActionPerformed(evt);
      }
    });
    getContentPane().add(btnPesquisar);
    btnPesquisar.setBounds(580, 60, 100, 30);

    jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
    jSeparator1.setForeground(new java.awt.Color(0, 255, 255));
    getContentPane().add(jSeparator1);
    jSeparator1.setBounds(0, 40, 750, 10);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(51, 51, 255));
    jLabel1.setText("Selecionar Jogador(a)");
    getContentPane().add(jLabel1);
    jLabel1.setBounds(270, 0, 270, 30);

    tblJogadores.setBackground(new java.awt.Color(204, 204, 204));
    tblJogadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    tblJogadores.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    tblJogadores.setForeground(new java.awt.Color(102, 102, 102));
    tblJogadores.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {

      },
      new String []
      {
        "Nome Jogador(a)"
      }
    )
    {
      boolean[] canEdit = new boolean []
      {
        false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex)
      {
        return canEdit [columnIndex];
      }
    });
    tblJogadores.setGridColor(new java.awt.Color(102, 102, 102));
    tblJogadores.setSelectionBackground(new java.awt.Color(153, 153, 153));
    tblJogadores.setSelectionForeground(new java.awt.Color(102, 102, 102));
    tblJogadores.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tblJogadores);

    getContentPane().add(jScrollPane1);
    jScrollPane1.setBounds(20, 100, 710, 230);

    txtFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoSelecionarjogador.png"))); // NOI18N
    getContentPane().add(txtFundo);
    txtFundo.setBounds(0, 0, 753, 400);

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtNomeCaretUpdate(javax.swing.event.CaretEvent evt)//GEN-FIRST:event_txtNomeCaretUpdate
  {//GEN-HEADEREND:event_txtNomeCaretUpdate
    /*String nomejogador = txtNome.getText();
     Jogador c = new Jogador();
     List<Jogador> listaJogador = c.pesquisarNome(nomejogador);
     preencherTabela(listaJogador);*/
  }//GEN-LAST:event_txtNomeCaretUpdate

  private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConfirmarActionPerformed
  {//GEN-HEADEREND:event_btnConfirmarActionPerformed
    int linhaSelecionada = tblJogadores.getSelectedRow();
    if (linhaSelecionada == -1)
    {
      JOptionPane.showMessageDialog(null, "Selecione um jogador da tabela");
    } else
    {

      String nome = tblJogadores.getValueAt(linhaSelecionada, 0).toString();
      Jogador j = new Jogador();
      j.setNome(nome);
      isj.carregar(j);
      this.dispose();
    }

  }//GEN-LAST:event_btnConfirmarActionPerformed

  private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarActionPerformed
  {//GEN-HEADEREND:event_btnPesquisarActionPerformed
    if (txtNome.getText().equals(""))
    {
      JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa!");
    } else
    {
      String nomejogador = txtNome.getText();
      Jogador c = new Jogador();
      List<Jogador> listaJogador = c.pesquisarNome(nomejogador);
      preencherTabela(listaJogador);
      if (listaJogador.isEmpty())
      {
        JOptionPane.showMessageDialog(null, "Nada foi Encontrado com Base nos Dados Passados.");
      }
    }
  }//GEN-LAST:event_btnPesquisarActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
  {//GEN-HEADEREND:event_formWindowClosing
    int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
    if (decicao == 0)
    {
      this.dispose();
    }
  }//GEN-LAST:event_formWindowClosing

  private void txtNomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNomeActionPerformed
  {//GEN-HEADEREND:event_txtNomeActionPerformed
    if (txtNome.getText().equals(""))
    {
      JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa!");
    } else
    {
      String nomejogador = txtNome.getText();
      Jogador c = new Jogador();
      List<Jogador> listaJogador = c.pesquisarNome(nomejogador);
      preencherTabela(listaJogador);
      if (listaJogador.isEmpty())
      {
        JOptionPane.showMessageDialog(null, "Nada foi Encontrado com Base nos Dados Passados.");
      }
    }
  }//GEN-LAST:event_txtNomeActionPerformed

  public static void main(String args[])
  {

    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {

        SelecionarJogador dialog = new SelecionarJogador(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e)
          {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnConfirmar;
  private javax.swing.JButton btnPesquisar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JTable tblJogadores;
  private javax.swing.JLabel txtFundo;
  private javax.swing.JTextField txtNome;
  // End of variables declaration//GEN-END:variables
}
