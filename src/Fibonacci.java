/**
 * Classe Fibonacci
 * Permet l'affichage de la suite de fibonacci
 * avec 2 méthodes distincts
 * @author Francis Lafontaine
 * @since 26 Aout 2022
 */
public class Fibonacci {
    /**
     * Variable static que l'on peut réutiliser dans le main et dans la methode 2
     */
    static int nbr1=0;
    static int nbr2=1;
    static int nbr3=0;

    /**
     * Methode1 pour faire la suite de fibonacci
     * Elle utilise une boucle for
     * @param count qui seras le nombre d'itération
     */
    public static void methode1(int count){
        int nb1 =0,nb2=1, nb3;
        System.out.print( nb1 + " " + nb2 );
        /**
         * La boucle for qui commence a 2 car les 2 premier chiffre sont déja écrit
         * On addition les premiers nombre et on assigne la valeur a un troisième nombre
         * Ensuite échange les nombre pour la suite
         */
        for (int j = 2; j < count; j++) {
            nb3 = nb1 + nb2;
            nb1 = nb2;
            nb2 = nb3;
            System.out.print(" " + nb3);
        }
    }

    /**
     * Methode2 pour faire la suite de fibonacci
     * Elle utilise la récursivité
     * @param count qui est le nombre de chiffre que l'on désire
     */
    public static void methode2(int count){
        /**
         * La méthode s'appele elle-même selon le nombre choisi
         * et ensuite  elle effectue la même opération que la methode 1
         */
        if(count > 0){
            nbr3 = nbr1 + nbr2;
            nbr1 = nbr2;
            nbr2 = nbr3;
            System.out.print(" "+nbr3);
            methode2(count-1);
        }
    }

    /**
     * Permet de calculer le résultat entre le début et la fin du temps
     * @param start heure de début en nanon seconde
     * @param end heure de fin en nano seconde
     * @return la différence entre les 2
     */
    public static long calculerDifference(long start, long end){
        return end-start;
    }

    /**
     * Permet de comparer les 2 méthode
     * @param nom1 qui est le nom de la première méthode
     * @param resultat1 le résultat de la première méthode
     * @param nom2 nom de la deuxième méthode
     * @param resultat2 le résultat de la deuxième méthode
     * @return un string indiquant le plus petit résultat avec son nom et son résultat
     */
    public static String  comparerMethode(String nom1, long resultat1, String nom2, long resultat2 ){
        String nomMethodeGagnante = "";
        String resultatGagnant = "0";

        if (resultat1<resultat2){
        nomMethodeGagnante= nom1;
        resultatGagnant = String.valueOf(resultat1);
        }else{
            nomMethodeGagnante = nom2;
            resultatGagnant = String.valueOf(resultat2);
        }

        return "Voici le nom de la méthode la plus rapide => " + nomMethodeGagnante + " avec un résultat de "
                + resultatGagnant + " nano secondes.";
    }
}
