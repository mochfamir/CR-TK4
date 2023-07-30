// Class untuk mewakili data SalesTrainee
public class SalesTraineeData {
    private int sickDays;
    private int failedTests;
    private double salary;

    public SalesTraineeData(int sickDays, int failedTests, double salary) {
        this.sickDays = sickDays;
        this.failedTests = failedTests;
        this.salary = salary;
    }

    // Metode getter untuk mendapatkan nilai atribut
    public int getSickDays() {
        return sickDays;
    }

    public int getFailedTests() {
        return failedTests;
    }

    public double getSalary() {
        return salary;
    }
}