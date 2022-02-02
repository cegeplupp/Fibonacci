//********************************************************************* 
// 
// Programmeur : Wang Guanqun et Etienne Daoust
// Date : 31 janvier 2021
// Fichier : Fibonacci1.3 
// 
// Classe d'éxécution
// 
//********************************************************************* 

package fibonacci;

import java.util.Scanner;

public class Fibonacci 
{

    public static void main(String[] args) 
    {

        //création des objets Classique et Recursive
        FiboInterface fbclassique = new Classique();
        FiboInterface fbrecursive = new Recursive();

        //on demande à l'utilisateur le nombre à utiliser pour faire le calcule
        System.out.println("Saisir le nombre: ");

        //initialiser scanner
        Scanner scanner = new Scanner(System.in);

        //input a l'interieur d'un try and catch étant donné l'entrée de l'utilisateur
        try 
        {
            long duration_fbclassique, duration_fbrecursive = 0;
            //capture du numéro
            int num = scanner.nextInt();

            //calcule et affichage des resultats pour la methode classique 
            System.out.println("Resultat pour la methode classique: ");
            duration_fbclassique = CalculerImprimerSequence.caculerEtImprimer(fbclassique, num);

            //calcule et affichage des resultats pour la methode recursive
            System.out.println("Resultat pour la methode recursive: ");
            duration_fbrecursive = CalculerImprimerSequence.caculerEtImprimer(fbrecursive, num);

            //comparaison de la duration des calcules
            //si la méthode classique est plus longue
            if (duration_fbclassique > duration_fbrecursive) 
            {
                System.out.println("La methode classique est plus longue");
            } 
            //si la methode recursive est plus longue
            else if (duration_fbclassique < duration_fbrecursive) 
            {
                System.out.println("La methode recursive est plus longue");
            } 
            //si les deux méthodes sont égales
            else 
            {
                System.out.println("Le methode classique et recursive prennent la même quantité de temps");
            }

        } 
        catch (Exception e) 
        {
            System.out.println("Exception: " + e.toString());
        }
    }

}
