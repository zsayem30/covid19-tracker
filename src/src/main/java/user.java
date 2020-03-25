import java.util.ArrayList;
import java.util.GregorianCalendar;

public class user {
    private String name;
    private int age;
    private String gender;
    private String region;
    private GregorianCalendar date;
    private final int caseID;

    private ArrayList<user> infectList = new ArrayList<>();

    public user(String name, int age, String gender, String region, GregorianCalendar date, int caseID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.region = region;
        this.date = date;
        this.caseID = caseID;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + caseID;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof user) {
            user other = (user) o;
            if (other.caseID == this.caseID && other.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    public int getCaseID() {
        return caseID;
    }

    public String name() {
        return name;
    }
}


