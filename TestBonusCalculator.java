public class TestBonusCalculator {

    public static void main(){
        
    }

    public static yearlyBonusCalculator() {
        YearlyBonusVisitor yearlyBonusCalculator = new YearlyBonusVisitor();

        SalesTrainee bradTrainee = new SalesTrainee(5, 1, 20000);
        Salesman tomSalesman = new Salesman(150000, 62);
        Boss rossBoss = new Boss(1000000, 1200, 4000000);

        System.out.println("YEARLY BONUS");

        System.out.println(yearlyBonusCalculator.visit(bradTrainee));
        System.out.println(yearlyBonusCalculator.visit(tomSalesman));
        System.out.println(yearlyBonusCalculator.visit(rossBoss));
    }

    public static quarterlyBonusCalculator() {
        QuarterlyBonusVisitor quarterlyBonusCalculator = new QuarterlyBonusVisitor();

        bradTrainee = new SalesTrainee(1, 0, 20000);
        tomSalesman = new Salesman(30000, 22);
        rossBoss = new Boss(200000, 300, 11000);

        System.out.println("\nQUARTERLY BONUS");

        System.out.println(quarterlyBonusCalculator.visit(bradTrainee));
        System.out.println(quarterlyBonusCalculator.visit(tomSalesman));
        System.out.println(quarterlyBonusCalculator.visit(rossBoss));
    }

}