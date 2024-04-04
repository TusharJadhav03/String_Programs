import java.util.Scanner;

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        
        String str1;
        String str2 = " ";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str1 = sc.nextLine();
        int l = str1.length()-1;

        for(int i=l;i>=0;i--){
            str2 += str1.charAt(i);
        }

        System.out.println("Reverse : "+str2);
        sc.close();
    }
}