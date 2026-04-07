import java.util.Scanner;

public class NoOfDigits {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();

            int nod=0;
            int temp=n;
            while(temp!=0){
                temp=temp/10;
                nod++;
            }
            int div =(int)Math.pow(10, -1);
            while (div!=0) {
                int num = n/div;
                System.out.println(num);
                
                n=n%div;
                div=div/10;
                
            }
            sc.close();

        
    }
}
