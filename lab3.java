public class lab3 {
    
    public static multipleofsevenuptwo(int n) {
        for (int i=1; i<=n; i++){
            if (i%7==0){
                System.out.printIn(i);
            }
        }
    }

    public static void mulipicationtable(int n){
        for (int i=1; i<=n; i++){
            System.out.print(i+" ");
            for (j=1; j<=n; j++){
            }
            System.out.print(" "+j*i);
        }
    }

    public static crossSum(int n) {
        int result =0;
        while (n >0){
            result +=num %10;
            num/=10;
        }
        return result;
    }
}