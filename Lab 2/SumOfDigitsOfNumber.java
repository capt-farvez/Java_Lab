
import java.util.Scanner;
public class SumOfDigitsOfNumber{

        static int add(int n){
            if(n==0){
                return 0;
            }
            else {
                return (n%10+add(n/10));
            }
        }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int number=input.nextInt();
        int ans=0;
        ans= add(number);
        System.out.println(ans);

        input.close();
    }
    
}
