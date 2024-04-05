import java.util.Scanner;

public class AsciiValue {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);

        int ascii_value = (int)ch;

        System.out.println("The Ascii Value of" +ch+ " is : "+ascii_value);
        sc.close();
    }
}
