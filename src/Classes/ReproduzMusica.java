package Classes;

import java.io.File;

public class ReproduzMusica {

    /*
     * Em sintese o jogo necessitava de varias m�sicas, ent�o eu fiz uma array
     * de string contento todos os endere�os das m�sicas e a cada vez que uma
     * m�sica acaba o indice(das can��es) � aumentado e a pr�xima m�sica tem
     * inicio.
     */
    public static int iMusicas = 0;
    public static String[] musicas = new String[14];
    MP3Musica musica;

    public void inicializarMusicas() {
        musicas[0] = "res\\Musicas\\Megamen X4-OST- Cyber Peacock.mp3";
        musicas[1] = "res\\Musicas\\Megamen X5-OST- Deep Sea.mp3";
        musicas[2] = "res\\Musicas\\Megamen X5-OST- Ending Theme.mp3";
        musicas[3] = "res\\Musicas\\Megamen X5-OST- Izzy Glow stage Theme.mp3";
        musicas[4] = "res\\Musicas\\Megamen X5-OST- Zero Stage.mp3";
        musicas[5] = "res\\Musicas\\Megamen X4-OST- Final Weapon Stage 1.mp3";
        musicas[6] = "res\\Musicas\\Megamen X4-OST- Frost KibaTodos Stage 2.mp3";
        musicas[7] = "res\\Musicas\\Megamen X4-OST- Slash Beastleo Stage.mp3";
        musicas[8] = "res\\Musicas\\Megamen X5-OST-Dark NecroBat Stage.mp3";
        musicas[9] = "res\\Musicas\\Megamen X4-OST- Split Mushroom Stage.mp3";
        musicas[10] = "res\\Musicas\\Megamen X1-OST- Burnin' Noumander Stage.mp3";
        musicas[11] = "res\\Musicas\\Megamen X1-OST- Spark Mandriller Stage.mp3";
        musicas[12] = "res\\Musicas\\Megamen X5-OST-Misson Report.mp3";
        musicas[13] = "res\\Musicas\\Megamen X5-OST-Unused Track - Mission Report.mp3";
        System.err.println(musicas[iMusicas]);
        String path = musicas[iMusicas]; // contem o caminho da musica.Nesse
        // caso a musica est� no pr�prio
        // projeto

        if (iMusicas == 11) {
            iMusicas = 0;
        } else {
            iMusicas++;
        }

        File mp3File = new File(path); /*
         * aqui instancia um arquivo com o
         * endere�o do arquivo(poderia jogar
         * direto, mas optei por fazer dessa
         * forma mesmo !_!)
         */

        musica = new MP3Musica(); // instanciou um objeto do tipo MP3,

        // derivado da biblioteca
        // JAVAZOOM(veja a linha 3)
        musica.inserirMusica(mp3File); // est� inserindo os componentes necessarios para
        // a musica
        musica.start(); // chama um m�todo para tocar a m�sica aqui.
    }

    /*
     * � necess�rio uma Thread para que a m�sica seja executada concorrentemente
     * com o resto do jogo
     */
}
