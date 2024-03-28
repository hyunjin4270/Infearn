package lang.immutable.ex;

public class ImmuableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static ImmuableMyDate setYear(ImmuableMyDate immuableMyDate,int year) {
        return new ImmuableMyDate(year, immuableMyDate.month, immuableMyDate.day);
    }



    

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
