import java.util.*;
import java.lang.StringBuffer;

class Reverse {
    public static void main(String[] args) {
        boolean run = true;

        System.out.println("This program will reverse whatever is inputted.");
        while (run) {
            Scanner Input = new Scanner(System.in);
            System.out.print("Enter the string - ");
            String Intstring = Input.nextLine();
            StringBuffer Reverse = new StringBuffer(Intstring);
            Reverse.reverse();
            System.out.println("The reverse is " + Reverse);
            Scanner Ag = new Scanner(System.in);
            System.out.print("Do you want to use this program again? (Yes/No) ");
            String Again = Ag.nextLine();
            if (Again.equals("No")) {
                break;
            }
            if (Again.equals("Yes")) {
                continue;
            }
            Input.close();
            Ag.close();
        }

    }
}
