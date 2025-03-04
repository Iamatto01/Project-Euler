import java.util.*;

public class Multiplesof3or5 {
public static void main (String[] args){
        
System.out.println("Enter Max Number :");
Scanner Scanner = new Scanner(System.in);
int Max = Scanner.nextInt();
Scanner.close();

int Sum = Multiple(Max);
System.out.println(Sum);

}

public static int Multiple(int Max){

int Sum = 0;
int num3 = 0;
int num5 = 0;
int i = 1; 

do{
    int temp3 = 3;
    num3 = temp3 * i;
    if (num3 >= Max) break;
    i++;
    Sum += num3;
    }while(1 == 1) ;
    i = 1;

do{
    int temp5 = 5;
    num5 = temp5 * i;
    if (num5 >= Max) break;
    i++;
    Sum += num5;
    }while(1 == 1) ;

    return Sum;
}

}