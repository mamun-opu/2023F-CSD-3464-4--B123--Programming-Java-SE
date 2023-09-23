import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = myInput.nextInt();
        if(number == 0){
            System.out.println("This is zero");
        } else if (number < 0) {
            if(number % 2 == 0){
                System.out.println("Number is Negative and Even");
            }
            else {
                System.out.println("Number is Negative and Odd");
            }
        } else {
            if(number % 2 == 0){
                System.out.println("Number is Positive and Even");
            }
            else {
                System.out.println("Number is Positive and Odd");
            }
        }
    }
}
