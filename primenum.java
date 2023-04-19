package basics;

public class primenum {
    public static void main(String[] args) {
        int num=Integer.parseInt(br.readLine());
        for (int i=2; i<=num-1;i++){  // num=5 2,3,4
            if (num%i==0){
                count=count+1;
            }}
        if (count==0){
            System.out.println("number is a prime number");
        }else {
            System.out.println("number is not a prime");
        }
    }
}
