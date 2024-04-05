import java.util.*;
public class StringEvenLocationArray {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[5];
        System.out.println("Enter  the String :");
        for(int i=0;i<arr.length;i++){

            arr[i] = sc.next();
        }

        for(int i=0;i<arr.length;i++){

            if(i%2==0){
                System.out.print(" " +arr[i]);
            }
        }

        sc.close();
    }
}
