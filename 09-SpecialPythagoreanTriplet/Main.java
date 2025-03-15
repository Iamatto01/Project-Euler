import java.util.*;
public class Main{
    public static void main(String[] args){
        double a = 3 ;
        double b = 4 ;
        double c = 0 ;
        double plus = 0;
        double product = 0;
        boolean betul = true;
      
      do{  if(plus < 1000){
      
      c = Math.pow(a,2) + Math.pow(b,2);
       c = Math.sqrt(c);
       plus = a+b+c;
       a++;
       b++;
       System.out.println(a + "+" + b + "+"  + c + "=" + plus);
    }
    else if(plus>1000){
        a--; 
        c = Math.pow(a,2) + Math.pow(b,2);
        c = Math.sqrt(c);
        plus = a+b+c;
        System.out.println(a + "+" + b + "+"  + c + "=" + plus);
    }
    else if(plus == 1000){
        product= a*b*c;
        System.out.println(a + "x" + b + "x"  + c + "=" +product);
        break;
    }}while(betul);

    
   
    

      
}}