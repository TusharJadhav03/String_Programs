import java.util.Scanner;

public class SecondLastStringArray {
    
    public static void SecondLastString(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the String : ");
        String str[] = new String[n];

        for(int i=0;i<str.length;i++){
            
            str[i] = sc.next();
        }

        System.out.println("Secong Last String is : ");
        System.out.println(str[n-2]);

        sc.close();
    }

    public static void main(String[] args) {
        
        SecondLastString();
        
        
    }
}
