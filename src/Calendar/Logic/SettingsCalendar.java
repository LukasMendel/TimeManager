package Calendar.Logic;

import java.time.LocalTime;

public class SettingsCalendar {


    private int numberOfDays = 6;
    private int numberOfLessons = 6;

    private LocalTime startOfLessons = LocalTime.of(8, 0);
    private long shortBreakMin = 15;
    private long lunchBreakMin = 60;
    private int lunchBreakAfterNumberOfLessons = 3;
    private long durationOfLectures = 90;


    private static SettingsCalendar single_instance;


    public static SettingsCalendar getInstance()
    {
        if (single_instance == null)
            single_instance = new SettingsCalendar();

        return single_instance;
    }


    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public LocalTime getStartOfLessons() {
        return startOfLessons;
    }

    public void setStartOfLessons(LocalTime startOfLessons) {
        this.startOfLessons = startOfLessons;
    }

    public long getShortBreakMin() {
        return shortBreakMin;
    }

    public void setShortBreakMin(long shortBreakMin) {
        this.shortBreakMin = shortBreakMin;
    }

    public long getLunchBreakMin() {
        return lunchBreakMin;
    }

    public void setLunchBreakMin(long lunchBreakMin) {
        this.lunchBreakMin = lunchBreakMin;
    }

    public int getLunchBreakAfterNumberOfLessons() {
        return lunchBreakAfterNumberOfLessons;
    }

    public void setLunchBreakAfterNumberOfLessons(int lunchBreakAfterNumberOfLessons) {
        this.lunchBreakAfterNumberOfLessons = lunchBreakAfterNumberOfLessons;
    }

    public long getDurationOfLectures() {
        return durationOfLectures;
    }

    public void setDurationOfLectures(long durationOfLectures) {
        this.durationOfLectures = durationOfLectures;
    }

    public static SettingsCalendar getSingle_instance() {
        return single_instance;
    }

    public static void setSingle_instance(SettingsCalendar single_instance) {
        SettingsCalendar.single_instance = single_instance;
    }
}
