import java.util.*;

public class primenum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("My number: ");
        int num = input.nextInt();
        boolean isPrime= false;
        input.close();
        if (num>1){
            for (int i=2; i<num/2; i++){
                // System.out.println(i);
                if(num%i==0){
                    isPrime= true;
                    break;
                }
            }  
        if (isPrime){
            System.out.println("Not Prime");

        }else{
            System.out.println("Prime");
        }
        
    }
    }
    
}
