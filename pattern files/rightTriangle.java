import java.util.*;

public class rightTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter number: ");
        int num = input.nextInt();
        input.close();
        for (int i =1; i<=num; i++){
            for (int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
