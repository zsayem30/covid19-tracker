import java.util.GregorianCalendar;

public class symptom {
    String symptomType;
    private int intensity;
    GregorianCalendar dateContracted;
    public symptom (String symptomType, int intensity) {
        this.symptomType = symptomType;
        if (intensity>10 || intensity < 0) {
            throw new IllegalArgumentException("Please enter an intensity between 0 and 10");
        }
        this.intensity = intensity;
        dateContracted = new GregorianCalendar();
    }
}
