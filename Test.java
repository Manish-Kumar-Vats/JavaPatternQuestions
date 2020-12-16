import java.util.*;

public class Test {
    
    public static void main(String gh[]){
         
        //Input from User and store value in inputNumber Variable
        Scanner obj = new Scanner(System.in);
        int inputNumber = obj.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){

                System.out.print(inputNumber+" ");

                inputNumber=inputNumber-1;
                if(inputNumber==0){
                    break;
                }
            } System.out.print(" \n");
            if(inputNumber==0){
                break;
            }
        }

}
    
}


/*
      this prgram will print the pattern in the given form(say input number is 10)-
      
      10
      9 8
      7 6 5 
      4 3 2 1
      
   * */
