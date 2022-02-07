public class MaxMin{
    public static void main(String[] args){
        int num1 = 30, num2 = 25, num3 = 14, max= 0 ;
        int mini = 0;
        if(num1>num2){
            if(num1>num3){
                max = num1;
                if(num2>num3){
                    mini = num3;
                }
                else mini = num2;
            }
            else{
                max = num3;
                mini = num2;
            }
       }

       else {
           if(num2>num3){
               max = num2;
               if(num3>num1){
                   mini = num1;
               } 
               else {
                   mini = num3;
               }
           }
           else{
               max = num3;
               mini = num1;
           }
       }
  
       
       System.out.println("Maximum number is = "+max);
       System.out.println("Minimum Number is = "+mini);

    }
}
