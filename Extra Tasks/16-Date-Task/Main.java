public class Main {
    language language;
    private int duration;
    private int day;
    private int month;
    private int year;

    public Main(language language, int duration, int day, int month, int year) {
        this.language = language;
        this.duration = duration;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public language getLanguage() {
        return language;
    }

    public void setLanguage(language language) {
        this.language = language;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Main{" +
                "language=" + language +
                ", duration=" + duration +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
