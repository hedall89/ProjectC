
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Decleration
        Scanner in = new Scanner(System.in); // scanner created
        double price = 0; // this should be initialized during coding from input
        int satisfactory = 0; // this should be initialized during coding from input
        double tip1 = 0.20; // tip if satisfactory == 1
        double tip2 = 0.15; // tip if satisfactory == 2
        double tip3 = 0.10; // tip if satisfactory == 3
        double tipAmount = 0;

        //input and validation
        System.out.print("\n Enter price: ");
        if (in.hasNextDouble()) {
            price = in.nextDouble();
            System.out.print("\n Satisfactory levels: \n    1 = Totally Satisfied,  \n    2 = Satisfied,  \n    3 = Dissatisfied");
            System.out.print("\n Enter satisfactory level either 1, 2, 3: ");
            if (in.hasNextInt()) {
                satisfactory = in.nextInt();


                //computation
                if (satisfactory == 1) {
                    tipAmount = price * tip1;
                } else if (satisfactory == 2) {
                    tipAmount = price * tip2;
                } else if (satisfactory == 3) {
                    tipAmount = price * tip3;
                } else {
                    System.out.print("\n number not valid, please enter 1, 2 or 3");
                }
            }
            else{
                System.out.print("\n Satisfactory level should be 1, 2, or 3");
            }
        }
        else {
            System.out.print("\n the price must be numbers");
        }


        //output TODO - output the satisfaction lvl and the tipAmount

    }
}