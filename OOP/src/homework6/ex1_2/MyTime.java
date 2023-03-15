package homework6.ex1_2;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        String hour = "";
        String minute = "";
        String second = "";
        if (this.hour < 10) {
            hour = hour + '0' + this.hour;
        } else {
            hour += this.hour;
        }
        if (this.minute < 10) {
            minute = minute + '0' + this.minute;
        } else {
            minute += this.minute;
        }
        if (this.second < 10) {
            second += second + '0' + this.second;
        } else {
            second += this.second;
        }
        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond() {
        if (this.second == 59) {
            this.second = 0;
            this.minute += 1;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour += 1;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        } else {
            this.second += 1;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            this.hour += 1;
            if (this.hour == 24) {
                this.hour = 0;
            }
        } else {
            this.minute += 1;
        }
        return this;
    }

    public MyTime nextHour() {
        if (this.hour == 23) {
            this.hour = 0;
        } else {
            this.hour += 1;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (this.second == 0) {
            this.second = 59;
            this.minute -= 1;
            if (this.minute < 0) {
                this.minute = 59;
                this.hour -= 1;
                if (this.hour < 0) {
                    this.hour = 23;
                }
            }
        } else {
            this.second -= 1;
        }
        return this;
    }

    public MyTime previousMinute() {
        if (this.minute == 0) {
            this.minute = 59;
            this.hour -= 1;
            if (this.hour < 0) {
                this.hour = 23;
            }
        } else {
            this.minute -= 1;
        }
        return this;
    }

    public MyTime previousHour() {
        if (this.hour == 0) {
            this.hour = 23;
        } else {
            this.hour -= 1;
        }
        return this;
    }
}
