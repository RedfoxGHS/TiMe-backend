package com.redandmoon.time.thisisme.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Week {
    final private int MIN_HOURS = 0;
    final private int MAX_HOURS = 24;
    final private String MSG_MIN_THROW = "HOUR MUST BE GREATER THAN ZERO";
    final private String MSG_MAX_THROW = "HOUR MUST BE LOWER THAN ZERO";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_WEEK")
    private Long idWeek;

    @Column(name = "SUNDAY")
    @Min(value = MIN_HOURS, message = MSG_MIN_THROW)
    @Max(value = MAX_HOURS, message = MSG_MAX_THROW)
    private int hoursInSunday;

    @Column(name = "MONDAY")
    @Min(value = MIN_HOURS, message = MSG_MIN_THROW)
    @Max(value = MAX_HOURS, message = MSG_MAX_THROW)
    private int hoursInMonday;

    @Column(name = "TUESDAY")
    @Min(value = MIN_HOURS, message = MSG_MIN_THROW)
    @Max(value = MAX_HOURS, message = MSG_MAX_THROW)
    private int hoursInTuesday;

    @Column(name = "WEDNESDAY")
    @Min(value = MIN_HOURS, message = MSG_MIN_THROW)
    @Max(value = MAX_HOURS, message = MSG_MAX_THROW)
    private int hoursInWednesday;

    @Column(name = "THURSDAY")
    @Min(value = MIN_HOURS, message = MSG_MIN_THROW)
    @Max(value = MAX_HOURS, message = MSG_MAX_THROW)
    private int hoursInThursday;

    @Column(name = "FRIDAY")
    @Min(value = MIN_HOURS, message = MSG_MIN_THROW)
    @Max(value = MAX_HOURS, message = MSG_MAX_THROW)
    private int hoursInFriday;

    @Column(name = "SATURDAY")
    @Min(value = MIN_HOURS, message = MSG_MIN_THROW)
    @Max(value = MAX_HOURS, message = MSG_MAX_THROW)
    private int hoursInSaturday;

    public int getHoursInSunday() {
        return hoursInSunday;
    }

    public void setHoursInSunday(int hoursInSunday) {
        this.hoursInSunday = hoursInSunday;
    }

    public int getHoursInMonday() {
        return hoursInMonday;
    }

    public void setHoursInMonday(int hoursInMonday) {
        this.hoursInMonday = hoursInMonday;
    }

    public int getHoursInTuesday() {
        return hoursInTuesday;
    }

    public void setHoursInTuesday(int hoursInTuesday) {
        this.hoursInTuesday = hoursInTuesday;
    }

    public int getHoursInWednesday() {
        return hoursInWednesday;
    }

    public void setHoursInWednesday(int hoursInWednesday) {
        this.hoursInWednesday = hoursInWednesday;
    }

    public int getHoursInThursday() {
        return hoursInThursday;
    }

    public void setHoursInThursday(int hoursInThursday) {
        this.hoursInThursday = hoursInThursday;
    }

    public int getHoursInFriday() {
        return hoursInFriday;
    }

    public void setHoursInFriday(int hoursInFriday) {
        this.hoursInFriday = hoursInFriday;
    }

    public int getHoursInSaturday() {
        return hoursInSaturday;
    }

    public void setHoursInSaturday(int hoursInSaturday) {
        this.hoursInSaturday = hoursInSaturday;
    }
}
