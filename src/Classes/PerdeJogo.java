package Classes;

public class PerdeJogo {

    /*
     * aqui compara o quadrado vermelho principal com os demais, caso ambos
     * estejam na mesma cordenada o jogador perde pontos
     */
    public void fazPerder() {
        for (int i = 0; i < LogicaFase.numeroCubosVermelhosTela - 1; i++) {
            if ((QuadradoPrincipal.x + 5 > LogicaFase.X[i] && QuadradoPrincipal.x - 5 < LogicaFase.X[i])
                    && (QuadradoPrincipal.y + 5 > LogicaFase.Y[i] && QuadradoPrincipal.y - 5 < LogicaFase.Y[i])) {
                LogicaFase.defineOFim = 1;
            }

        }
    }

}
