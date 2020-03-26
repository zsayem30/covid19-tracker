import java.util.GregorianCalendar;

public class user {
    private String name;
    private int age;
    private String gender;
    private location location;
    private GregorianCalendar date;
    private final int caseID; //unique id for each separate user. Found by adding the hashcode of the name, age. Need to add more features to make it unique for example location.

    public user (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.caseID = name.hashCode() + age;
        date = new GregorianCalendar();

    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof user) {
            user other = (user) o;
            if (other.caseID == this.caseID ) {
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


