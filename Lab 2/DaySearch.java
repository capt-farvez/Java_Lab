import java.util.Scanner;
public class DaySearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int rem, num=input.nextInt();
        rem=num%7;

        if(rem==0){
            System.out.println("Saturday");
        }
        if(rem==1){
            System.out.println("Sunday");
        }
        if(rem==2){
            System.out.println("Monday");
        }
        if(rem==3){
            System.out.println("Tuesday");
        }
        if(rem==4){
            System.out.println("Wednesday");
        }
        if(rem==5){
            System.out.println("Thursday");
        }
        if(rem==6){
            System.out.println("Friday");
        }
        input.close();

    }
    
}
