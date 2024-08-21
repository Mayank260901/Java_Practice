import java.util.ArrayList;
import java.util.List;

class Criminal {
    private String name;
    private Integer age;
    private String gender;
    private String address;
    private String identifyingMark;
    private String areaOfCrime;
    private List<String> associatedCrimes;

    public Criminal(String name, int age, String gender, String address, String identifyingMark, String areaOfCrime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.identifyingMark = identifyingMark;
        this.areaOfCrime = areaOfCrime;
        this.associatedCrimes = new ArrayList<>();
    }

    // Getter Methods
    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getIdentifyingMark() {
        return identifyingMark;
    }

    public String getAreaOfCrime() {
        return areaOfCrime;
    }

    public List<String> getAssociatedCrimes() {
        return associatedCrimes;
    }

    // Setter Methods
    public void addAssociatedCrime(String crime) {
        associatedCrimes.add(crime);
    }

    @Override
    public String toString() {
        return "Criminal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", identifyingMark='" + identifyingMark + '\'' +
                ", areaOfCrime='" + areaOfCrime + '\'' +
                ", associatedCrimes=" + associatedCrimes +
                '}';
    }
}
