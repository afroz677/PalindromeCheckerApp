import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text:");
        String original = sc.nextLine();
        String reversed = "";
        int i;
        for (i=original.length()-1;i>=0;i--)
        {
            reversed += original.charAt(i);
        }
        System.out.println("Is it Palindrome? ");
        if (original.equals(reversed))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
