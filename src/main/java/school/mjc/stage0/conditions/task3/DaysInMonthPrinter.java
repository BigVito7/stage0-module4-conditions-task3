package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println(31); // Months with 31 days
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println(30); // Months with 30 days
                break;
            case 2:  // February
                System.out.println(28); // February has 28 days (assuming it's not a leap year)
                break;
            default:
                System.out.println("wrong number!"); // Invalid month number
        }
    }
}
