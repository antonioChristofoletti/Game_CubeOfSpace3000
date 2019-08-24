package Classes;

import java.util.Random;

/*Essa classe n�o possui segredo, pois ela s� gera n�meros aleat�rios,
 n�o sendo fundamental para a execu��o do sistema, visto que, pode-se
 criar um "Random radom = new Random();" na pr�pria classe "Fase"(onde isso �
 � realmente feito).Mas por crit�rios de organiza��o a mesma � utilizada;
 )

 */
public class GeradorDeCordenadas
{

  Random radom = new Random();

  public int geradorDeCordenadaX()
  {

    /*
     * O M�todo nextInt gera um n�mero aleat�rio perante ao valor que �
     * passado para o mesmo. Ex: Se for passado um n�mero X. Ser� gerado um
     * valor aleat�rio(hipoteticamente) entre 0 at� X.
     */
    return (radom.nextInt(TelaDoJogo.limiteAltura));
  }

  public int geradorDeCordenadaY()
  {
    return (radom.nextInt(TelaDoJogo.limiteLargura - 160));
  }

  public int geradorDeNumero(int possibilidades)
  {
    return (radom.nextInt(possibilidades));
  }
}
