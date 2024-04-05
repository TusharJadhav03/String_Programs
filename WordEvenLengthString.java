import java.util.Scanner;

public class WordEvenLengthString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();

        int n = str.length()-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(str.charAt(i));
            }
        }

        sc.close();
    }
}
