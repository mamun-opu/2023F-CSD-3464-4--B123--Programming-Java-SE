import java.util.Scanner;
public class Intervalle {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter a real number: ");
        double x = myInput.nextInt();
        if((x >= 2 && x <3) || (x > 0 && x <= 1) || (x >= -10 && x <= -2)){
            System.out.println(x + " belongs to I");
        }else{
            System.out.println(x + "does not belong to I");
        }
    }
}
