package basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n=8;
        //outer loop
        for(int i=n; i>=1; i--){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

