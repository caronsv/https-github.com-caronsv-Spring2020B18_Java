package Part1;

public class A161_Methods {
    public static double waterTax(double units) {
        double bill = 0.0;

        //your code here

        if (units <= 50) {
            bill = units * 0.60;
        } else if (units >= 50 && units <= 100) {
            bill = units * 0.90;
        } else if (units > 100 && units <= 150) {
            bill = (units * 0.90) + 50;
        } else if (units > 150) {
            bill = (units * 0.90) + 100;
        }
        //end your code here
        return bill;

    }//end waterTax



}
