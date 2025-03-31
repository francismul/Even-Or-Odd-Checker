import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Even or Odd Checker App");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                try {
                    System.out.println("1. Check Even or Odd");
                    System.out.println("2. Exit");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter a number: ");
                            int number = scanner.nextInt();
                            if ((number & 1) == 0) {
                                System.out.println(number + " is an even number");
                            } else {
                                System.out.println(number + " is an odd number");
                            }
                        }
                        case 2 -> {
                            System.out.println("Thank you for using the app");
                            System.exit(0);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please try again");
                    break;
                }
            }
        }
    }

    private boolean isEven(int n){
        return (n & 1) == 0 ? true : false;
    }
}
