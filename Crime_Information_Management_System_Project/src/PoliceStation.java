import java.util.ArrayList;
import java.util.List;


class PoliceStation {
    private String name;
    private String location;
    private List<Crime> crimes;
    private List<Criminal> criminals;

    public PoliceStation(String name, String location) {
        this.name = name;
        this.location = location;
        this.crimes = new ArrayList<>();
        this.criminals = new ArrayList<>();
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public List<Criminal> getCriminals() {
        return criminals;
    }

    // Methods to add crimes and criminals
    public void addCrime(Crime crime) {
        crimes.add(crime);
    }

    public void addCriminal(Criminal criminal) {
        criminals.add(criminal);
    }

    // Additional methods for searching and reporting
    public List<Crime> searchCrimes(String filter) {
        List<Crime> result = new ArrayList<>();
        for (Crime crime : crimes) {
            if (crime.toString().contains(filter)) {
                result.add(crime);
            }
        }
        return result;
    }

    public List<Criminal> searchCriminals(String filter) {
        List<Criminal> result = new ArrayList<>();
        for (Criminal criminal : criminals) {
            if (criminal.toString().contains(filter)) {
                result.add(criminal);
            }
        }
        return result;
    }

    public int countSolvedCrimes() {
        int count = 0;
        for (Crime crime : crimes) {
            if (crime.getStatus().equalsIgnoreCase("Solved")) {
                count++;
            }
        }
        return count;
    }

    public int countUnsolvedCrimes() {
        int count = 0;
        for (Crime crime : crimes) {
            if (crime.getStatus().equalsIgnoreCase("Unsolved")) {
                count++;
            }
        }
        return count;
    }

    public int countCrimesInMonth(String month) {
        int count = 0;
        for (Crime crime : crimes) {
            if (crime.getDate().contains(month)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "PoliceStation{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", crimes=" + crimes +
                ", criminals=" + criminals +
                '}';
    }
}
