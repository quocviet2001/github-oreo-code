package homework6.ex1_3;

public class MyDate {
    private int day;
    private int month;
    private int year;
    static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
            "Aug", "Sep", "Oct", "Nov",
            "Dec"};
    static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
            31};

    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (isLeapYear(year) && month == 2) {
            if (year > 9999 || year < 1 || day > 29 || day < 1) {
                return false;
            }
        } else {
            if (year > 9999 || year < 1 || month > 12 || month < 1
                    || day > DAYS_IN_MONTHS[month - 1] || day < 1) {
                return false;
            }
        }
        return true;
    }

    public int getDayOfWeek(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            int[] array = {4, 2, 0, 6};
            int lastTwoDigit = year % 100;
            int centuryNumber;
            if ((year - lastTwoDigit) % 400 == 100) {
                centuryNumber = array[0];
            }
            if ((year - lastTwoDigit) % 400 == 200) {
                centuryNumber = array[1];
            }
            if ((year - lastTwoDigit) % 400 == 300) {
                centuryNumber = array[2];
            } else {
                centuryNumber = array[3];
            }

            int[] nonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
            int[] leapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
            int monthNumber;
            if (isLeapYear(year)) {
                monthNumber = leapYear[month - 1];
            } else {
                monthNumber = nonLeapYear[month - 1];
            }
            return (centuryNumber + lastTwoDigit + lastTwoDigit / 4 + monthNumber
                    + day) % 7;
        } else {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }

    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }

    public void setDate(int day, int month, int year) {
        if (isValidDate(year, month, day)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(year, month, day)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(year, month, day)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(year, month, day)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
    }

    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " "
                + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        day++;
        if (isLeapYear(year) && month == 2) {
            if (day > 29) {
                day = 1;
                month++;
            }
        } else {
            if (day > DAYS_IN_MONTHS[month - 1]) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (isLeapYear(year) && month == 2 && day > 29) {
            day = 29;
        } else if (month == 2 && day > 28) {
            day = 28;
        } else {
            if (month > 12) {
                month = 1;
                year++;
            }
            int temp = month + 1;
            if (day == DAYS_IN_MONTHS[temp - 1]) {
                day = DAYS_IN_MONTHS[month - 1];
            }
        }
        return this;
    }

    public MyDate nextYear() {
        if (year + 1 > 9999) {
            throw new IllegalStateException("Year out of range!");
        } else {
            year++;
            if (isLeapYear(year) && month == 2 && day == 29) {
                day = 28;
            }
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            if (isLeapYear(year) && month == 3) {
                day = 29;
                month--;
            } else {
                month--;
                if (month < 1) {
                    month = 12;
                    year--;
                    day = DAYS_IN_MONTHS[month - 1];
                }
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (isLeapYear(year) && month == 3 && day > 29) {
            day = 29;
        } else if (month == 3 && day > 28) {
            day = 28;
        } else {
            if (month < 1) {
                year--;
                month = 12;
            }
            int temp = month + 1;
            if (day == DAYS_IN_MONTHS[temp - 1]) {
                day = DAYS_IN_MONTHS[month - 1];
            }
        }
        return this;
    }

    public MyDate previousYear() {
        if (year - 1 < 1) {
            throw new IllegalStateException("Year out of range!");
        } else {
            year--;
        }
        return this;
    }
}
