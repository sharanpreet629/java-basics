import java.util.Scanner;

public class hollowRect {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter cols: ");
        int cols = input.nextInt();
        input.close();
        for(int i =1; i<=rows; i++){
            for (int j =1; j<=cols; j++){
                if(i==1 || j==1 || i==rows || j==cols){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    
}
