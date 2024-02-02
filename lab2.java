public class Lab2 {
    public static void logestword (String word1, String word2, String word3) {
        byte word1Len = word1.length();
        byte word2Len = word1.length();
        byte word3Len = word1.length();
        byte maxlen = integer.max(word1. length(), word2.length(), word3.length());
        if (maxlen == word1.length()){
            if (maxlen == word2.length()){
                if (maxlen == word2.length()){
                    System.out.println(word1);
                    System.out.println(word2);
                    System.out.println(word3);
                }
            }
        }
        if (word1 == word2){
            System.out.println(word1);
            System.out.println(word2);
        }
        if (word1 == word3){
            System.out.println(word1);
            System.out.println(word3);
        }
        if (word3 == word2){
            System.out.println(word2);
            System.out.println(word3);
        }
        if (maxlen == word1.length()){
            System.out.println(word1);
        }
        if (maxlen == word2.length()){
            System.out.println(word2);
        }
        else {
            System.out.println(word1);
        }
    }
    public static boolean isleapyear (int year) {
        if(year%4==0){
            if(year%100==0){
                return year%400==0;
            }
            else{
                return True;
            }
        }
        else return False;
    }
    public static boolean isevenpsoitive (int number) {
        return num % 2==0;
    }
}