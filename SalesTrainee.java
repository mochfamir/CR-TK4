public class SalesTrainee implements Visitable {
    private SalesTraineeData data; // Menggunakan objek SalesTraineeData

    public SalesTrainee(int sickDays, int failedTests, double salary) {
        this.data = new SalesTraineeData(sickDays, failedTests, salary);
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    // Metode untuk mendapatkan objek SalesTraineeData
    public SalesTraineeData getData() {
        return data;
    }
}