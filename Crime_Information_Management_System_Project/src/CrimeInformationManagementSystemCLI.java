import java.util.List;
import java.util.Scanner;

// Command line interface - for the management system\.
public class CrimeInformationManagementSystemCLI {
     static DatabaseManager dbManager = new DatabaseManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n Crime Information Management System " +
                               "\n 1. Add Crime" +
                               "\n 2. Add Criminal " +
                               "\n 3. Search Crimes" +
                               "\n 4. Search Criminals" +
                               "\n 5. Generate Report"+
                               "\n 6. Exit" +
                               "\n \n Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addCrime(scanner);
                    break;
                case 2:
                    addCriminal(scanner);
                    break;
                case 3:
                    searchCrimes(scanner);
                    break;
                case 4:
                    searchCriminals(scanner);
                    break;
                case 5:
                    generateReport(scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    private static void addCrime(Scanner scanner) {
        System.out.print("Enter Crime Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Crime Place: ");
        String place = scanner.nextLine();
        System.out.print("Enter Crime Type: ");
        String type = scanner.nextLine();
        System.out.print("Enter Crime Description: ");
        String description = scanner.nextLine();

        Crime crime = new Crime(date, place, type, description);

        System.out.print("Enter Victims (comma separated): ");
        String[] victims = scanner.nextLine().split(",");
        for (String victim : victims) {
            crime.addVictim(victim.trim());
        }

        System.out.print("Enter Suspects (comma separated): ");
        String[] suspects = scanner.nextLine().split(",");
        for (String suspect : suspects) {
            crime.addSuspect(suspect.trim());
        }

        dbManager.addCrime(crime);
        System.out.println("Crime added successfully.");
    }

    private static void addCriminal(Scanner scanner) {
        System.out.print("Enter Criminal Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Criminal Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Criminal Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Criminal Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Criminal Identifying Mark: ");
        String mark = scanner.nextLine();
        System.out.print("Enter Criminal Area of Crime: ");
        String area = scanner.nextLine();

        Criminal criminal = new Criminal(name, age, gender, address, mark, area);
        dbManager.addCriminal(criminal);
        System.out.println("Criminal added successfully.");
    }

    private static void searchCrimes(Scanner scanner) {
        System.out.print("Enter search filter: ");
        String filter = scanner.nextLine();

        List<Crime> crimes = dbManager.searchCrimes(filter);
        if (crimes.isEmpty()) {
            System.out.println("No crimes found.");
        } else {
            for (Crime crime : crimes) {
                System.out.println(crime);
            }
        }
    }

    private static void searchCriminals(Scanner scanner) {

    }

    private static void generateReport(Scanner scanner) {

    }
}

