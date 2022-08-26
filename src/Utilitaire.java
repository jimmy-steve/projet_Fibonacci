import java.util.Scanner;

/**
 * Nom de la classe Utilitaire
 * permet d'ajouter des méthode utilitaire qui sera utilisé dans le programme
 * @author Francis lafontaine
 * @since 26/aout/2022
 */
public class Utilitaire {
    /**
     * Methode qui permet de saisir un chiffre entier sans erreur
     * @param message Qui seras afficher a l'utilisateur pour savoir quoi saisir
     * @param messageErreur retour un message d'erreur si on ne retourne pas un entier
     * @return un nombre entier saisi par l'utilisateur
     */
    public static int saisirEntier(String message, String messageErreur){
        Scanner lecteur = new Scanner(System.in);
        System.out.println(message);
        while (!lecteur.hasNextInt()){
            System.out.println(messageErreur);
            lecteur.nextLine();
        }
        return lecteur.nextInt();
    }
}
