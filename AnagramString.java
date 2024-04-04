import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    


    public static boolean Anagram(String str1,String str2){

        if(str1.length()!=str2.length())
            System.out.println("String not Anagram");
        else{

            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1, string2)==true){
                System.out.println("String anagram");
            }
            else{
                System.out.println("String not anagram");
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second String : ");
        String str2 = sc.nextLine().toLowerCase();
        
        Anagram(str1, str2);

        sc.close();

    }
}
