import java.util.Scanner;

public class CountDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        long number = sc.nextLong();

        long digCount = 0;
        while(number!=0){
            number = number/10;
            digCount++; 
        }
        System.out.println("Digits in Number are : "+digCount);
        sc.close();
    }
}