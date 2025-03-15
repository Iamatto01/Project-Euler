import java.util.*;

public class Main{
    public static void main(String []args){
        
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your desired prime number : ");
        int Max = Scanner.nextInt();
        int Prime = PrimeCalc(Max);
        System.out.println(Prime);
        Scanner.close();

    
        }
        public static int PrimeCalc(int Max){
            int Prime = 2;
            int temp = 0;
            int i = 1;
            if (Max==1) {return Prime;}
            else{
            do{
                Prime++;
                int j  = Prime ;

                do{
                    j--;
                    if (j==1) {
                         i++;
                        break;
                    }
                    else{
                   temp = Prime%j;
                   if(temp == 0){
                    Prime ++;
                    j = Prime;
                   }}
                }while(true);
               // System.out.println("Prime Number " + i + " is " + Prime);
            }while(i<Max);
        }


            return Prime;
        }
      }

        
    
