package Classes;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class MP3Musica extends Thread /* <<<< OLHA A THREAD AQUI */ {

        public static int situacao=0;
        // OBJETO PARA O ARQUIVO MP3 A SER TOCADO
        public File mp3;
        
        // OBJETO PLAYER DA BIBLIOTECA JLAYER QUE TOCA O ARQUIVO MP3
        public Player player;

        // Vide linha 20
        public void inserirMusica(File mp3) {
            this.mp3 = mp3;
        }

        // Em run a m�sica � executada
        @Override
        public void run() {
            try {
                FileInputStream fis = new FileInputStream(mp3);
                BufferedInputStream bis = new BufferedInputStream(fis);

                this.player = new Player(bis);
                // System.out.println("Tocando Musica!");

                this.player.play();
                while(situacao != 0){
                    this.run();
                }
                LogicaFase.iniciaMusica = 0;
                // System.out.println("Terminado Musica!");

            } catch (Exception e) {
                System.out.println("Problema ao tocar Musica" + mp3);
                e.printStackTrace();
            }
        }
}