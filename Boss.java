public class Boss implements Visitable{
    private BossInfo bossInfo;

    public Boss(BossInfo bossInfo) {
        this.bossInfo = bossInfo;
    }

    public double getTotalSalesAmount() {
        return bossInfo.getTotalSalesAmount();
    }

    public void setTotalSalesAmount(double totalSalesAmount) {
        bossInfo.setTotalSalesAmount(totalSalesAmount);
    }

    public int getNewCustomers() {
        return bossInfo.getNewCustomers();
    }

    public void setNewCustomers(int newCustomers) {
        bossInfo.setNewCustomers(newCustomers);
    }

    public double getOfficeExpenses() {
        return bossInfo.getOfficeExpenses();
    }

    public void setOfficeExpenses(double officeExpenses) {
        bossInfo.setOfficeExpenses(officeExpenses);
    }
}