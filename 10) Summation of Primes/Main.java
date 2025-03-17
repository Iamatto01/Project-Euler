public class Main{
    public static void main(String[] args){
        long Num = 2;
        long temp = 0;
        long Sum = 0;
        boolean betul = true;
        while ( Num < 10){
            if(Num ==2){
                Sum += Num;
                Num ++;
        }

            else {
                temp = Num - 1;
                do{
                    if (Num%temp == 0){
                        Num++;
                        break;
                    }
                    else if (Num%temp != 0){
                        temp--;
                        if (temp==1){
                            Sum+=Num;
                            Num++;
                       //     System.out.println(Num);                            
                       //     System.out.println(Sum);
                            break;
                        }
                    }

                }while (betul);
            }
            }System.out.println(Sum);
        }
}