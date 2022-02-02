//********************************************************************* 
// 
// Programmeur : Wang Guanqun et Etienne Daoust
// Date : 31 janvier 2021
// Fichier : Fibonacci1.3 
// 
// Classe pour stocker la méthode d'affichage et d'implementation des méthodes
// récurives et classiques ainsi que le calcule du temps du calcule
// 
//********************************************************************* 

package fibonacci;

public class CalculerImprimerSequence 
{

    //méthode d'affichage/calcule/implémentation des séquences
    public static long caculerEtImprimer(FiboInterface fbIF, int num) 
    {

        //déclaration des variables
        long[] liste = new long[num];
        long timeBegin, timeEnd = 0;
        String resultString = "";
        long duration = 0;

        //calcule du temps + affichage
        timeBegin = System.nanoTime();
        for (int i = 1; i <= num; i++) 
        {
            liste[i - 1] = fbIF.calculer(i);
        }
        timeEnd = System.nanoTime();

        duration = timeEnd - timeBegin;

        System.out.println("Temps d'execution de cette methode en nanosecondes: " + duration);

        //affichage des séquences
        for (int i = 0; i < num; i++) 
        {
            resultString += liste[i];

            if (i != (num - 1)) 
            {
                resultString += ",";
            }
        }

        System.out.println("La liste de fibo : " + resultString);

        return duration;
    }
}
