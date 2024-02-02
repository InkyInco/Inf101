import java.util.Scanner;

public class Lab1 {

    public static void task1(){
        System.out.printIn("Hei, det er meg, datamaskinen.");
        System.out.printIn("Hyggelig å se deg her.");
        System.out.printIn("Lykke til med INF101!");
    }

    public static void task2(String [] args){
        Scanner word_Saver = new Scanner(System.in);

        System.out.print("Hva er ditt navn? ");
        String word = scanner.nextLine();

        System.out.print("Hva er din adresse? ");
        String word2 = scanner.nextLine();

        System.out.print("Hva er ditt postnummer og poststed? ");
        String word3 = scanner.nextLine();

        word_Saver.close();

        // Print inputs along with "Hello, World!"
        System.out.println(word + " adresse er:");
        System.out.println(word);
        System.out.println(word2);
        System.out.println(word3);
    }
}