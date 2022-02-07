import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int j;
        if (n>=9){
            n=9;
        }

        for(int i=0; i<n; i++){

            for(int z=0; z<=i; z++){
                System.out.print(" ");
            }
            
            for (j=1; j<=(n-i); j++){
                int sum=0;
                sum=sum+j;
                System.out.print(sum);
            }
            
            for (int k=n-i-1; k>0; k--){
                int count=0;
                count=count+k;
                System.out.print(count);
            }
           
            System.out.println("");
           

        }
        input.close();
    }
    
}
