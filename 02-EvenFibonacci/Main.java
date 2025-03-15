import java.util.*;

public class Main {
    public static void main (String[] args){
        long Max = 4000000;
        long first = 1;
        long second = 2;
        long i = 1;
        long even = 2;
      do{
        i = first + second ;
        first = second;
        second = i;
        if(i%2==0){
            even += i;
        }
       } while (i < Max);

       System.out.println(even);
        }
    }

