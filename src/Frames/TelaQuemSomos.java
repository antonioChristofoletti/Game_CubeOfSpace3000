package Frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaQuemSomos extends javax.swing.JFrame {

    private static TelaQuemSomos quemSomos;

    private TelaQuemSomos() {
        initComponents();
        setResizable(false);
        setSize(590, 428);
        setLocationRelativeTo(null);
        ImageIcon imagemTituloJanela = new ImageIcon("res\\Imagens\\QuadradoVermelho.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public static TelaQuemSomos getInstance() {
        if (quemSomos == null) {
            return (quemSomos = new TelaQuemSomos());
        } else {
            quemSomos.setLocationRelativeTo(null);
            return quemSomos;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quem Somos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quem Somos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 0, 120, 30);

        jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 24, 550, 2);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Software desenvolvido pela empresa SoftDead Corporation® todos os direitos reservados. Qualquer cópia ou");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 24, 530, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("   utilização não oficial do sistema acarretará em uma intervenção por parte dos nossos agentes,  com o intuito de");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 500, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   manter a qualidade e eficiencia dos nossos serviços. ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 450, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Equipe de Desenvolvimento:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 90, 290, 17);

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
        jButton2.setBounds(440, 340, 120, 25);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Desenvolvedor: Antonio Lucas Christofoletti. ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 120, 230, 10);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("   Designer: Hugo César Peressin e Giovani dos Santos. ");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 140, 270, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("       Analista e Escritor: Vinícius Gabriel de Camargo.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 130, 255, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail para Contato: softdeadCorporation@hotmail.com.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 170, 420, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agradecemos a preferência. A corporação SoftDead está trabalhando para desenvolver os  melhores softwares aos");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 200, 550, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("consumidores. Caso tenha adquirido esse software, e o mesmo não  possua o selo \"Dead\", entre em contato com ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 210, 560, 30);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("nossos atendentes.");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 230, 260, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caveira.png"))); // NOI18N
        jLabel14.setText("SoftDead Corporation®");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(210, 280, 180, 50);

        txtFundo.setForeground(new java.awt.Color(51, 51, 255));
        txtFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoRegrasEQuemSomos.png"))); // NOI18N
        getContentPane().add(txtFundo);
        txtFundo.setBounds(0, -50, 590, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
        if (decicao == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Tela?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
        if (decicao == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuemSomos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtFundo;
    // End of variables declaration//GEN-END:variables
}
