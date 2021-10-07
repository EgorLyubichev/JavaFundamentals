import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your bus-stop number?");
        int number = scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("Bus routes: 1, 3, 6, 19");
                break;
            case 2:
                System.out.println("Bus routes: 4, 7");
                break;
            case 3:
                System.out.println("Bus routes: 5, 21, 23");
                break;
            default: throw new IllegalArgumentException("Bus stop not found");
        }
    }
}
