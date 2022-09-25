package com.rsingh.timeservice.model;

public class Time {
    private String abbreviation;
    private String clientIp;
    private String datetime;
    private Integer dayOfWeek;
    private Integer dayOfYear;
    private Boolean dst;
    private String dstFrom;
    private Long dstOffset;
    private String dstUntil;
    private Long rawOffset;
    private String timezone;
    private Long unixTime;
    private String utcDateTime;
    private String utcOffset;
    private Integer weekNumber;

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

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(Integer dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public Boolean getDst() {
        return dst;
    }

    public void setDst(Boolean dst) {
        this.dst = dst;
    }

    public String getDstFrom() {
        return dstFrom;
    }

    public void setDstFrom(String dstFrom) {
        this.dstFrom = dstFrom;
    }

    public Long getDstOffset() {
        return dstOffset;
    }

    public void setDstOffset(Long dstOffset) {
        this.dstOffset = dstOffset;
    }

    public String getDstUntil() {
        return dstUntil;
    }

    public void setDstUntil(String dstUntil) {
        this.dstUntil = dstUntil;
    }

    public Long getRawOffset() {
        return rawOffset;
    }

    public void setRawOffset(Long rawOffset) {
        this.rawOffset = rawOffset;
    }

    public Long getUnixTime() {
        return unixTime;
    }

    public void setUnixTime(Long unixTime) {
        this.unixTime = unixTime;
    }

    public String getUtcDateTime() {
        return utcDateTime;
    }

    public void setUtcDateTime(String utcDateTime) {
        this.utcDateTime = utcDateTime;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }
}
