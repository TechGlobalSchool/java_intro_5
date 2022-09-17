package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        /*
        TASK 1
        Find min and max salary

        Expected output:
        Min salary = $4000.5
        Max salary = $6000.25
         */
        double d1 = Double.parseDouble(salary1); // 5000
        double d2 = Double.parseDouble(salary2); // 6000.25
        double d3 = Double.parseDouble(salary3); // 4000.50

        double minSalary = Math.min(d3, Math.min(d1, d2));

        System.out.println("Min salary = $" + minSalary);
        System.out.println("Max salary = $" + Math.max(d1, Math.max(d2, d3)));

        /*
        TASK-2
        Calculate the 10 percent of the min salary

        Expected output:
        400.05
         */

        System.out.println(minSalary * 0.1);
    }
}
