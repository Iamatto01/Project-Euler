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
Map<Integer,Integer> Map = new HashMap<>();
int Sum3 = 0;
int Sum5 = 0;
for (int i=1;Sum3 < Max ; i++){
    Sum3 = 3*i;
    if(Sum3 >= Max) break;
    Map.put(Sum3,Sum3);

}
for (int i=1;Sum5 < Max ; i++){
    Sum5 = 5*i;
    if(Sum5 >= Max) break;
    Map.put(Sum5,Sum5);

}

for (int value : Map.values()){
    Sum += value;
}
    return Sum;
}

}