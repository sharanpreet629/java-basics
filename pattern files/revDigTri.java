import java.util.*;

public class revDigTri {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        input.close();
        for (int i=num; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
