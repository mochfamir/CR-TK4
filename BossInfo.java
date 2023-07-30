// Parameter Object untuk Boss untuk menghindari Long Parameter
class BossInfo {
    private double totalSalesAmount;
    private int newCustomers;
    private double officeExpenses;

    public BossInfo(double totalSalesAmount, int newCustomers, double officeExpenses) {
        this.totalSalesAmount = totalSalesAmount;
        this.newCustomers = newCustomers;
        this.officeExpenses = officeExpenses;
    }
}