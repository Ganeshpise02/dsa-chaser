import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    
    int nod=0;
    int temp=number;
    while(temp!=0){
       temp=temp/10;
        nod++;   
    }
    int div =(int)Math.pow(10, nod-1);
    while(div!=0){
        int num= number/div;
        System.out.println(num);

        number = number %div;
        div = div/10;
    }
     sc.close();
  }
}
