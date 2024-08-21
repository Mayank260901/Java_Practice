import java.util.List;

public class CrimeInformationManagementSystem {
    public static void main(String[] args) {
        PoliceStation station = new PoliceStation("Central Police Station", "Downtown");

        // Add Crimes
        Crime crime1 = new Crime("2024-07-10", "Downtown", "Robbery", "A bank was robbed.");
        crime1.addVictim("John Doe");
        crime1.addSuspect("Jane Doe");
        station.addCrime(crime1);

        Crime crime2 = new Crime("2024-08-05", "Uptown", "Homicide", "A person was killed.");
        crime2.addVictim("Alice");
        crime2.addSuspect("Bob");
        station.addCrime(crime2);

        Crime crime3 = new Crime("2024-06-07", "Gwalior", "Robbery", "Masked man Snatched a chain");
        crime3.addVictim("Ravi");
        crime3.addSuspect("Kallu");
        station.addCrime(crime3);

        // Add Criminals
        Criminal criminal1 = new Criminal("Jane Doe", 30, "Female", "123 Main St", "Scar on left cheek", "Downtown");
        criminal1.addAssociatedCrime("Robbery");
        station.addCriminal(criminal1);

        Criminal criminal2 = new Criminal("Bob", 35, "Male", "456 Elm St", "Tattoo on right arm", "Uptown");
        criminal2.addAssociatedCrime("Homicide");
        station.addCriminal(criminal2);

        Criminal criminal3 = new Criminal("Ravi", 30, "Male", "Gwalior", "Cut mark on forehead", "Gwalior");
        criminal3.addAssociatedCrime("Homicide");
        station.addCriminal(criminal2);

        // Search for a crime
        System.out.println("Search Crimes:");
        List<Crime> crimes1 = station.searchCrimes("Robbery");
        for (Crime crime : crimes1) {
            System.out.println(crime);
        }

        List<Crime> crimes2 = station.searchCrimes("Homicide");
        for (Crime crime : crimes2) {
            System.out.println(crime);
        }

        // Search for a criminal
        System.out.println("\nSearch Criminals:");
        List<Criminal> criminals = station.searchCriminals("Jane Doe");
        for (Criminal criminal : criminals) {
            System.out.println(criminal);
        }

        // Reporting
        System.out.println("\n Solved Crimes: " + station.countSolvedCrimes() +
                "\n Unsolved Crimes: " + station.countUnsolvedCrimes() +
                "\n Crimes in August: " + station.countCrimesInMonth("2024-08"));
    }
}
