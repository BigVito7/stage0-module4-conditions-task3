package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!"); // Print for invalid input
        } else if (salary <= 10000) {
            double salaryAfterTax = salary * 0.85; // 15% tax
            System.out.println(salaryAfterTax);
        } else if (salary <= 20000) {
            double salaryAfterTax = salary * 0.82; // 18% tax
            System.out.println(salaryAfterTax);
        } else {
            double salaryAfterTax = salary * 0.80; // 20% tax
            System.out.println(salaryAfterTax);
        }
    }
}
