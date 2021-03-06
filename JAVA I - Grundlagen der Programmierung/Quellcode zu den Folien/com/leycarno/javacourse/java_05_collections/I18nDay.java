package com.leycarno.javacourse.java_05_collections;

public enum I18nDay {

    SUNDAY      ("Sontag"),
    MONDAY      ("Montag"),
    TUESDAY     ("Dienstag"),
    WEDNESDAY   ("Mittwoch"),
    THURSDAY    ("Donnerstag"),
    FRIDAY      ("Freitag"),
    SATURDAY    ("Samstag");

    private final String de;

    I18nDay(String de) {
        this.de = de;
    }

    public String de() {
        return de;
    }

}
