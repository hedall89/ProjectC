
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Decleration
        Scanner in = new Scanner(System.in); // scanner created
        double price; // this should be initialized during coding from input
        int satisfactory; // this should be initialized during coding from input
        double tip1 = 20; // tip if satisfactory == 1
        double tip2 = 15; // tip if satisfactory == 2
        double tip3 = 10; // tip if satisfactory == 3

        //input and validation
        System.out.println("enter price");
        price = in.nextDouble();
        satisfactory = 0;
        System.out.println("Enter satisfactoryLvl like 1, 2, 3");
        satisfactory = in.nextInt();

        if (satisfactory == 1)//validation
            System.out.print("You get 20 percent of the price as tip");
        else if (satisfactory == 2)
            System.out.print("you get 15 percent of the price as tip");
        else if (satisfactory == 3)
            System.out.print("you get 10 percent of the price as tip");
        else
            System.out.println("number not valid, please enter 1, 2 or 3");

    }
}