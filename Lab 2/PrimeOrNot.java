import java.util.Scanner;
public class PrimeOrNot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for(int i=2; i<num; i++){
            if(num%i==0){
                System.out.print(" Not Prime Number");
                break;
            }
            if(i==(num-1)){
                System.out.print(" Prime Number");
            }
        }
        input.close();
    }
    
}
