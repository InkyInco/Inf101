import java.util.ArrayList;

public class lab7{
    public static ArrayList<Integer> removeRow(ArrayList<Integer> matrix , byte n){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (byte i = 0; i< matrix.size(); i++){
            if (i == n){
                
            }
            else{
                list2.add(matrix.get(i));
            }
        }
        return list2;
    }

    public static boolean equal(ArrayList<Integer> matrix){
        boolean isTrue = false;
        byte Row = matrix.size();
        byte Colum =matrix.get(0).size();
        if (Row==Colum){
            isTrue = true;
        }
        return isTrue;
    }
}