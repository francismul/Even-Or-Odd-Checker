import java.util.Scanner;


class App {

    public static void main(String[] args) {
        System.out.println("Welcome to Even or Odd Checker App");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Check number");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");


                int choice;

                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Enter a valid number!");
                    scanner.nextLine();
                    continue;
                }

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 - > {
                        System.out.print("Enter number: ");

                        int number;

                        if (!scanner.hasNextInt()) {
                            System.out.println("Error: Enter a valid number");
                            scanner.nextLine();
                            continue;
                        }

                        number = scanner.nextInt();

                        if (isEven(number)) {
                            System.out.println("" + number + ": is an Even number");
                        } else {
                            System.out.println("" + number + ": is Odd number");
                        }
                        scanner.nextLine();
                    }
                    case 2 - > {
                        System.out.println("See you later guffer!");
                        System.exit(0);
                    }
                    default - > System.out.println("Error: Invalid choice");
                }
            }
        }
    }

    private static boolean isEven(int n) {
        return (n & 1) == 0 ? true : false;
    }
}
