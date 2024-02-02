public class lab5 {
    public static arraylist<integer> multiblesWithTwo(arraylist<integer> list){
        List<integer> result = new arraylist<>();
        for(integer i : list) {
            result.add(i*2);
        }
    return result;
    }

    public static arraylist<integer> removeThree(arraylist<integer> list){
        List<integer> result = new arraylist<>();
        for (int i : list){
            if (i != 3){
                result.add(i);
            }
        }
    return result;
    }

    public static arraylist<integer> removeThree(arraylist<integer> list){
        List<integer> result = new arraylist<>();
        for (int i : list){
            if (!(result.contains(i))){
                result.add(i);
            }
        }
        return result;
    }
}