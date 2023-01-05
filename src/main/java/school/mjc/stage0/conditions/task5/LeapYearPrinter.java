package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String leap = String.valueOf((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        switch (leap) {
            case "true":
                System.out.println("leap");
                break;
            case "false":
                System.out.println("not leap");
                break;
        }
    }
}
