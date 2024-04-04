import java.util.Scanner;

public class StringPalindrome {

    public static boolean isPalindrome(String str1){

        int i=0;
        int n = str1.length()-1;
        while(i<n){
            if(str1.charAt(i)!= str1.charAt(n)){
                return false;
            }
            i++;
            n--;

        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str1 = sc.nextLine().toLowerCase();
        
        if(isPalindrome(str1)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}
