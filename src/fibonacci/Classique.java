//********************************************************************* 
// 
// Programmeur : Wang Guanqun et Etienne Daoust
// Date : 31 janvier 2021
// Fichier : Fibonacci1.3 
// 
// Classe pour stocker la methode de calculation fibonacci classique 
// 
//********************************************************************* 

package fibonacci;

public class Classique implements FiboInterface 
{

    /**
     * Méthode classique pour calculer la séquence de fibonacci
     * @param num
     * @return
     */
    @Override
    public long calculer(int num) 
    {

        long first = 0;
        long second = 1;
        long third = 1;

        for (int i = 2; i <= num; i++) 
        {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}
