package basics;

public class squarepower {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int num = 0;
        double sum = 0;
        double m = 0;
        for (double n = 0; n <= 10; n++) ;
        {   //2^0+ 2^1 +2^2//2*2
            m = Math.pow(a, n);
            sum = sum + m;
        }
        System.out.println(sum);
    }
}
