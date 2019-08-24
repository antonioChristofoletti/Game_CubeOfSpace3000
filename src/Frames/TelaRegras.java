package Frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaRegras extends javax.swing.JFrame {

    private static TelaRegras telaDireitosAutorais;

    private TelaRegras() {
        initComponents();
        setResizable(false);
        setSize(590, 428);
        setLocationRelativeTo(null);
        ImageIcon imagemTituloJanela = new ImageIcon("res\\Imagens\\QuadradoRoxo.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public static TelaRegras getInstance() {
        System.out.println("ola");
        if (telaDireitosAutorais == null) {
            return (telaDireitosAutorais = new TelaRegras());
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
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Regras");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Regras");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 10, 60, 20);

        jSeparator1.setBackground(new java.awt.Color(160, 160, 160));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 30, 550, 10);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("O jogo Cube of Space 3.000 baseia-se em transformar a maior quantidade de cubos amarelos na tela em cubos de cor ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 560, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("vermelha. ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 50, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Regras Gerais:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 70, 90, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1) O jogador terá 10 pontos de vida ao iniciar o jogo.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 90, 290, 14);

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
        jLabel9.setText("   2) Inicialmente a tela conterá dois cubos, um sendo azul (Jogador) e o outro amarelo (Objetivo).");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 100, 480, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("nascerá outros dois cubos amarelos na tela além de obter 10 pontos por transformação. ");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 130, 420, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sendo assim, quando o jogador transformá-lo em vermelho através do contato dos itens,");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 110, 440, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("3) Quando o cubo do jogador (Azul) passar pelos cubos vermelhos presentes na tela, o mesmo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 140, 540, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" perderá pontos.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 160, 90, 14);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("   4) O jogo terminará quando a pontuação for zerada.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 170, 260, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Efeitos Cubos:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 190, 260, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  1) O cubo amarelo quando transformado pelo jogador, criar  um novo par de cubos, sendo um verdadeiro");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 200, 510, 40);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("e o outro falso que apenas existe para  confundir o jogador. Cada cubo verdadeiro coletado dá ao jogador");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 220, 520, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("um total de 10 pontos em seu score e 1 ponto de vida. ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(60, 240, 270, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("  2) O cubo de cor roxa, caso seja tocado pelo cubo do jogador, fará com que o mesmo perca 5 pontos.");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(40, 250, 500, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("  3) O cubo de cor prata retira da tela 15 cubos vermelhos da tela, facilitando assim a locomoção do jogador.");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(40, 270, 650, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("   Além disso, adicionará 30 pontos no score e 30 pontos na vida do jogador.");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(50, 280, 460, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("4) O circulo dourado acrescentará 20 pontos ao score e 20 pontos à vida do jogador caso o jogador passe pelo");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(43, 300, 570, 20);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("mesmo.");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(57, 310, 40, 20);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pena.png"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(270, 310, 80, 70);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoRegrasEQuemSomos.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, -50, 600, 500);

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
        int decicao = JOptionPane.showConfirmDialog(null, "Deseja Sair da Inserção de Score?", "Ratificação de Encerramento", JOptionPane.YES_NO_OPTION);
        if (decicao == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegras().setVisible(true);
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
