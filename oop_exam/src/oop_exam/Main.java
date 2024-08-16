package oop_exam;
import oop_exam.LectureRoom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LectureRoom room = new LectureRoom();
        char choice;

        do {
            // Display the menu
            System.out.println("\nMain Menu:");
            System.out.println("W - Add Students");
            System.out.println("X - Remove Students");
            System.out.println("Y - Turn On Light");
            System.out.println("Z - Turn Off Light");
            System.out.println("P - Print Status");
            System.out.println("Q - Quit");

            // Get the user's choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().toUpperCase().charAt(0);

            switch (choice) {
                case 'W':
                    System.out.print("Enter number of students to add: ");
                    int addCount = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    room.addStudents(addCount);
                    break;

                case 'X':
                    System.out.print("Enter number of students to remove: ");
                    int removeCount = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    room.removeStudents(removeCount);
                    break;

                case 'Y':
                    System.out.print("Enter light number to turn on (1, 2, or 3): ");
                    int lightOn = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    room.turnOnLight(lightOn);
                    break;

                case 'Z':
                    System.out.print("Enter light number to turn off (1, 2, or 3): ");
                    int lightOff = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    room.turnOffLight(lightOff);
                    break;

                case 'P':
                    room.printStatus();
                    break;

                case 'Q':
                    System.out.println("Quitting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 'Q');

        scanner.close();
    }
}

