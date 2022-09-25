package com.rsingh.timeservice.model;

public class TimeDto {
    private String abbreviation;
    private String timezone;
    private String datetime;

    public TimeDto(Time time) {
        this.abbreviation = time.getAbbreviation();
        this.timezone = time.getTimezone();
        this.datetime = time.getDatetime();
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
