package Frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaDireitosAutorais extends javax.swing.JFrame {

    private static TelaDireitosAutorais telaDireitosAutorais;

    private TelaDireitosAutorais() {
        initComponents();
        setResizable(false);
        setSize(500, 302);
        setLocationRelativeTo(null);
        ImageIcon imagemTituloJanela = new ImageIcon("res\\Imagens\\QuadradoDourado.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public static TelaDireitosAutorais getInstance() {
        if (telaDireitosAutorais == null) {
            return (telaDireitosAutorais = new TelaDireitosAutorais());
        } else {
            telaDireitosAutorais.setLocationRelativeTo(null);
            return telaDireitosAutorais;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tdt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Direitos Autorais");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Direitos Autorais");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 140, 20);

        jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 40, 460, 2);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Toda a sonoplastia utilizada nessa aplicação foi produzida por Noato Tanaka, Naoya Kamisaka,  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 470, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Takuya Miyawaki, Setsuo Yamamoto, Makoto Tomozawa, Yuki Iwai, Yuko Takehara e  ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 440, 40);

        tdt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tdt.setForeground(new java.awt.Color(255, 255, 255));
        tdt.setText("Toshihiko Horiyama para a empresa Capcom em seus jogos Mega Man X (1993), ");
        getContentPane().add(tdt);
        tdt.setBounds(20, 70, 400, 30);

        jLabel5.setBackground(new java.awt.Color(0, 51, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mega Man X4 (1997) e Mega Man X5 (2000). ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 84, 230, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Todos os direitos reservados a Capcom Entertainment, Inc. ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 120, 290, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Capcom_mini.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 170, 140, 30);

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
        jButton2.setBounds(360, 230, 120, 25);

        txtFundo.setForeground(new java.awt.Color(51, 51, 255));
        txtFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoDireitosAutorais.png"))); // NOI18N
        getContentPane().add(txtFundo);
        txtFundo.setBounds(0, -10, 500, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);

        if (decicao == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
        if (decicao == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDireitosAutorais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel tdt;
    private javax.swing.JLabel txtFundo;
    // End of variables declaration//GEN-END:variables
}
