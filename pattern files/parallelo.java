import java.util.*;


public class parallelo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        input.close();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=(num-i);j++){
                System.out.print("  ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("* ");
            }
        System.out.println(); 
        }
    }
}