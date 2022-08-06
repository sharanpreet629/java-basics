import java.util.*;

public class rect{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows number: ");
        int row = input.nextInt();
        System.out.print("Enter columns number: ");
        int col = input.nextInt();
        input.close();
        for(int i=1; i<=row; i++){
            for(int j =1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



    

