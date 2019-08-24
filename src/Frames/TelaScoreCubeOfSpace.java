package Frames;

import Classes.MP3Musica;
import Classes.Score;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaScoreCubeOfSpace extends javax.swing.JDialog {

    MP3Musica tocador = new MP3Musica();

    public TelaScoreCubeOfSpace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        ImageIcon imagemTituloJanela = new ImageIcon("res\\Imagens\\QuadradoBranco.png");
        setIconImage(imagemTituloJanela.getImage());
        
        carregarDados();
        setSize(981, 429);
        setLocationRelativeTo(null);
        jtable.getColumnModel().getColumn(0).setPreferredWidth(260);
        jtable.getColumnModel().getColumn(1).setPreferredWidth(91);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent evt) {
                int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
                if (decicao == 0) {
                    dispose();
                }
            }
        });
    }

    public void carregarDados() {
        try {
            DefaultTableModel table = (DefaultTableModel) jtable.getModel();
            table.setRowCount(0);
            ArrayList<Score> listaScore = Score.retornaScore();
            for (int i = 0; i < listaScore.size(); i++) {
                Object[] b = {
                    listaScore.get(i).getNome(),
                    new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(listaScore.get(i).getData()),
                    (listaScore.get(i).getData().getTime() - listaScore.get(i).getTempoDecorido().getTime()) / 1000 + "s",
                    listaScore.get(i).getCubosPegos(),
                    listaScore.get(i).getPontuacaoFinal(),};
                table.addRow(b);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar os Dados.");
        }

    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jSeparator1 = new javax.swing.JSeparator();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtable = new javax.swing.JTable();
    jButton2 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Score Cube of Space");
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(java.awt.event.WindowEvent evt)
      {
        formWindowClosing(evt);
      }
    });
    getContentPane().setLayout(null);

    jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
    jSeparator1.setForeground(new java.awt.Color(0, 255, 255));
    getContentPane().add(jSeparator1);
    jSeparator1.setBounds(0, 31, 970, 10);

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(51, 51, 255));
    jLabel2.setText("Score Cube of Space 3000");
    getContentPane().add(jLabel2);
    jLabel2.setBounds(380, 0, 250, 30);

    jtable.setBackground(new java.awt.Color(204, 204, 204));
    jtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jtable.setForeground(new java.awt.Color(102, 102, 102));
    jtable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {

      },
      new String []
      {
        "Nome", "Data", "Tempo Decorrido", "Cubos Pegos", "Pontuação Final"
      }
    )
    {
      boolean[] canEdit = new boolean []
      {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex)
      {
        return canEdit [columnIndex];
      }
    });
    jtable.setGridColor(new java.awt.Color(102, 102, 102));
    jtable.setSelectionBackground(new java.awt.Color(153, 153, 153));
    jtable.setSelectionForeground(new java.awt.Color(102, 102, 102));
    jtable.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(jtable);

    getContentPane().add(jScrollPane1);
    jScrollPane1.setBounds(20, 50, 930, 210);

    jButton2.setBackground(new java.awt.Color(102, 102, 102));
    jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton2.setForeground(new java.awt.Color(51, 51, 255));
    jButton2.setText("Sair");
    jButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton2ActionPerformed(evt);
      }
    });
    getContentPane().add(jButton2);
    jButton2.setBounds(810, 270, 140, 25);

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoExibicaoScore.png"))); // NOI18N
    getContentPane().add(jLabel1);
    jLabel1.setBounds(0, 0, 969, 390);

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Inserção da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
        if (decicao == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
  {//GEN-HEADEREND:event_formWindowClosing
   int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
        if (decicao == 0) {
            this.dispose();
        }
  }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaScoreCubeOfSpace dialog = new TelaScoreCubeOfSpace(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                        System.out.println("oi");
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JTable jtable;
  // End of variables declaration//GEN-END:variables
}
