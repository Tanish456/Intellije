package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrays  {
    public static void diff(int a,int b) {   //returnable type      //non returnable type

        int diff;
        if (a > b) {
            diff = a - b;
            System.out.println(diff);
        } else {
            diff = b - a;
            System.out.println(diff);
        }
    }
        public static void prod(int c ,int d){             //abstract
            System.out.print(c*d);}
            public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            //diff(x,y);
            prod(x,y);
        }
            }









