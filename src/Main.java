import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number max 8 orunduu !!!:  ");
        int number = scanner.nextInt();

        if ((number / 10000000) != 0) {
            System.out.println("8 orundoo sasn");
        } else if ((number / 1000000) != 0) {
            System.out.println("7 orundoo san");
        } else if ((number / 100000) != 0) {
            System.out.println("6 orundoo san");
        } else if ((number / 10000) != 0) {
            System.out.println("5 orundoo san");
        } else if ((number / 1000) != 0) {
            System.out.println("4 orundoo san");
        } else if ((number / 100) != 0) {
            System.out.println("3 orundoo san");
        } else if ((number / 10) !=0) {
            System.out.println("2 orundoo san");
        } else if ((number / 1) != 0) {
            System.out.println("1 orundoo san");
        }else {
            System.err.println("Max 8 orundoo san boluchu kerek!!!");
        }


    }
}