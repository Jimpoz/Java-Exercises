package DateHour;

import java.util.*;

public class DateHour {
    private int month, day;
    private Date ora;

    DateHour(int month, int day, Date ora) throws WrongDateHourException {

        if (month > 12 || day > 31 || ora == null) { // su java non si usa OR
            throw new WrongDateHourException("Invalid Date");
        } else {
            this.month = month;
            this.day = day;
            this.ora = ora;
        }
    }

    public int get_month() {
        return this.month;
    }

    public int get_day() {
        return this.day;
    }

    public Date get_date() {
        return this.ora;
    }

}
