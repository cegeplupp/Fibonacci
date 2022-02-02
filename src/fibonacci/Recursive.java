//********************************************************************* 
// 
// Programmeur : Wang Guanqun et Etienne Daoust
// Date : 31 janvier 2021
// Fichier : Fibonacci1.3 
// 
// Classe pour stocker la methode de calculation récursive
// 
//********************************************************************* 

package fibonacci;

public class Recursive implements FiboInterface 
{

    /**
     * Méthode classique pour calculer la séquence de fibonacci
     * @param num
     * @return
     */
    @Override
    public long calculer(int num) 
    {

        if (num <= 0) 
        {
            return 0;
        } 
        else if (num == 1) 
        {
            return 1;
        } 
        else 
        {
            return calculer(num - 1) + calculer(num - 2);
        }
    }

}
