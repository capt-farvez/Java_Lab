import java.util.Scanner;
public class EvenOddCheck {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        input.close();
    }
    
}
