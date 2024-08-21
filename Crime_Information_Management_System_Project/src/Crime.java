import java.util.ArrayList;
import java.util.List;


class Crime {
    private String date;
    private String place;
    private String crimeType;
    private List<String> victims;
    private String description;
    private List<String> suspects;
    private String status;

    public Crime(String date, String place, String crimeType, String description) {
        this.date = date;
        this.place = place;
        this.crimeType = crimeType;
        this.description = description;
        this.victims = new ArrayList<>();
        this.suspects = new ArrayList<>();
        this.status = "Unsolved";
    }

    // Getter Methods
    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public List<String> getVictims() {
        return victims;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSuspects() {
        return suspects;
    }

    public String getStatus() {
        return status;
    }

    // Setter Methods
    public void setStatus(String status) {
        this.status = status;
    }

    // Additional methods for adding victims and suspects
    public void addVictim(String victim) {
        victims.add(victim);
    }

    public void addSuspect(String suspect) {
        suspects.add(suspect);
    }

    @Override
    public String toString() {
        return "Crime{" +
                "date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", crimeType='" + crimeType + '\'' +
                ", victims=" + victims +
                ", description='" + description + '\'' +
                ", suspects=" + suspects +
                ", status='" + status + '\'' +
                '}';
    }
}

