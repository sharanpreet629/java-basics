import java.util.*;


public class diamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        input.close();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=(num-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println(); 
        }
        for(int i=num-1; i>0; i--){
            for(int j=1; j<=(num-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println(); 
        }
    }
    
}
