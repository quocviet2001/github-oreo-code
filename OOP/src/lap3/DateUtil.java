package lap3;

public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (day <= 0 || day > 31 || month < 1 || month > 12) {
            return false;
        }
        if ((month == 2) && (isLeapYear(year))) {
            if (day <= (daysInMonths[1] + 1)) {
                return true;
            } else {
                return false;
            }
        }
        if (daysInMonths[month - 1] < day) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            int sum = 0;
            switch (((year / 100) - 17) % 4) {
                case 0:
                    sum += 4;
                    break;
                case 1:
                    sum += 2;
                    break;
                case 2:
                    break;
                default:
                    sum += 6;
            }
            sum += year % 100 + (year % 100) / 4;
            if (month == 1) {
                if (isLeapYear(year))
                    sum += 6;
                else
                    sum += 0;
            } else if (month == 2) {
                if (isLeapYear(year))
                    sum += 2;
                else
                    sum += 3;
            } else {
                int[] temp = {3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
                if (month != 1 || month != 2) {
                    sum += temp[month - 3];
                }
            }
            sum += day;
            return sum % 7;
        }
        return -1;
    }

    public static String toString(int year, int month, int day) {

        if (isValidDate(year, month, day))
            return dayOfWeek[getDayOfWeek(year, month, day)] + " " + day + " "
                    + strMonths[month - 1] + " " + year;
        return null;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }
}
