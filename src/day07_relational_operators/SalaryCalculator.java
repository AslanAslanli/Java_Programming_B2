package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;

        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "State tax rate: " + stateTaxRate + ", " + "\nFederal tax rate: " + federalTaxRate + ", " +
                "\nBase Salary: $" + salary + ", " + "\nTax amount: " + stateTax + " for State Tax and " + federalTax +
                " Federal Tax in total it is: " + totalTax + "\nAfter tax salary is: $" + salaryAfterTax;

        System.out.println(taxReport);

    }
}

    /*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample date:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
     */