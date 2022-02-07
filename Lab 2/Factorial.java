import java.util.Scanner;
public class Factorial {
    
        static int Factor(int n){
            if(n==0){
                return 1;
            }
            else if(n<0){
                return 0;
            }
            else {
                return(n*Factor(n-1));
            }
        }
    

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int fact=1, number=input.nextInt();
        fact= Factor(number);

        System.out.print(fact);

        input.close();
    }
}
