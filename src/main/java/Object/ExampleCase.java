package Object;

import java.util.Scanner;

public class ExampleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a color: ");
        String carColor = sc.nextLine();

        switch (carColor) {
            case "Red":
                System.out.println("Red is printed");
                break;
            case "Black":
                System.out.println("Black is printed");
                break;
            default:
                System.out.println("default is printed");
        }
    }
}
