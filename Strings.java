package basics;
import java.util.Locale;

public class Strings {
    public static void main(java.lang.String[] args) {
        java.lang.String a=" JHARKHAND ";
        System.out.println(a.toLowerCase(Locale.of("JHARKHAND")));
        System.out.println(a.replace("N","Z"));
        System.out.println(a.length());
        System.out.println(a.charAt(5));
        System.out.println(a.equals("jharkhand"));
        System.out.println(a.equalsIgnoreCase(" jharkhand "));
        System.out.println(a.trim());
        System.out.println(a.substring(5));
        System.out.println(a.substring(8)); //STRING OPERATORS:-
    }
}

