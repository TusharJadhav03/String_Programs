import java.util.Scanner;

public class CheckVowels {
    

    public static void CheckString(String str){

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)== 'a'|| str.charAt(i)=='i'|| str.charAt(i)=='e'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.println("Vowels are present : "+str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine().toLowerCase();

        CheckString(str);
        sc.close();
    }
}
