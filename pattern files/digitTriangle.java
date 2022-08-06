import java.util.*;

public class digitTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        input.close();
        int number = 1;
        for (int i=0; i<num; i++){
            for (int j=0; j<i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
