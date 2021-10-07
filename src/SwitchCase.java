import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your profession?");
        String prof = scanner.nextLine();
        int salary = role(prof);
        System.out.println("Your salary equals " + salary + " $");
    }
    public static int role (String prof){
        int salary;
        switch (prof) {
            case "orderly":
                salary = 1000;
                break;
            case "nurse":
                    salary = 1200;
                    break;
            case "doctor":
                    salary = 1400;
                    break;
            default: throw new IllegalArgumentException("Not found your profession " + prof);
            }
            return salary;
    }
}

