
/**
 * Nom : Main qui contient la méthode Main
 *
 * @author Francis lafontaine
 * @since 26/Aout/2022
 */
public class Main {
    /**
     * La méthode main qui permet de tester et d"afficher les résultat
     * Qui consiste a afficher la suite de fibonacci selon 2 méthode et d'évaluer le résultat en milliseconde
     *
     * @param args
     */
    public static void main(String[] args) {
        int nombreSaisie = 0;
        /**
         * Permettre la saisie sans erreur d'un chiffre entier
         */
        nombreSaisie = Utilitaire.saisirEntier("Bonjour, Veuillez saisir un nombre entier pour afficher " +
                        "le nombre de termes de la suite a calculer.",
                "Svp ... Saisir un chiffre entier  !!");


        //----------------------------------------------------------------------------------Methode1 avec boucle for
        long endTime = 0;
        System.out.println("-------Fibonacci avec la bouche for-------- \n");
        /**
         * Début du
         */
        //long startTime = System.currentTimeMillis();
        long startTime = System.nanoTime();
        /**
         * La boucle commence par 2 car 0 et 1 sont deja affiché
         */
        Fibonacci.methode1(nombreSaisie);
        /**
         * Fin du
         */
        //endTime = System.currentTimeMillis();
        endTime = System.nanoTime();
        /**
         * On calcule la différence entre les 2 nombres
         */
        long resultatMethode1 = Fibonacci.calculerDifference(startTime, endTime);
        /**
         * Compte rendu de la methode 1
         */
        System.out.println("\nDébut = " + (endTime));
        System.out.println("Fin = " + (startTime));
        System.out.println("Le temps d'execution de la methode 1 est = " + resultatMethode1 + " nano secondes.");


        //----------------------------------------------------------------------------------Methode2 avec récursivité
        long endTime2 = 0;
        System.out.println("\n\n-------Fibonacci avec la récursivité------- \n");
        /**
         * afficher les 2 premiers chiffres
         */
        System.out.print(Fibonacci.nbr1 + " " + Fibonacci.nbr2);
        /**
         * Le Début du  en nanonTime()
         */
        //long startTime2 = System.currentTimeMillis();
        long startTime2 = System.nanoTime();
        /**
         * La boucle commence par 2 car 0 et 1 sont deja affiches
         */
        Fibonacci.methode2( nombreSaisie-2);
        /**
         * Fin du
         */
        //endTime2 = System.currentTimeMillis();
        endTime2 = System.nanoTime();

        /**
         * On calcule la différence entre les 2 nombres
         */
        long resultatMethode2 = Fibonacci.calculerDifference(startTime2, endTime2);

        /**
         * Compte rendu de la methode 2
         */
        System.out.println("\nDébut = " + (endTime2));
        System.out.println("Fin = " + (startTime2));
        System.out.println("Le temps d'execution de la methode2 est = " + resultatMethode2 + " nano secondes.");


        //-------------------------------------------------------------------------------Comparaison
        /**
         * On compare maintenant les 2 résultats pour savoir laquelle des methodes est plus rapide
         */
        System.out.println("\n-----------------------------Résultat de la comparaison-----------------------------\n");
        System.out.println(Fibonacci.comparerMethode("Methode1", resultatMethode1,
                "Methode2", resultatMethode2));

        System.out.println("Il y a donc " + (resultatMethode1 - resultatMethode2)
                + " nano secondes entre les 2 méthodes");

    }
}
