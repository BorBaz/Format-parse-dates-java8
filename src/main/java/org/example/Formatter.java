package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatter {

    public static void main(String[] args) {
//        formatear();
        localeFormalize();
    }

    private static void formatear(){
        // La clase mas importante para formatear fechas es DateTimeFormatter
        LocalDate date = LocalDate.of(2023, 7, 22);
        String iso = date.format(DateTimeFormatter.ISO_DATE);
        String basic = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(iso + " " + basic);

        String date1 = "2023-07-22";
        String date2 = "20230722";

        LocalDate parse1 = LocalDate.parse(date1, DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(parse1 + " " + parse2);

        // Las instancias de este formater son thread-safe
    }

    public static void localeFormalize() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.CHINA);
        LocalDate date = LocalDate.of(2012, 12, 12);
        String dateFormatted = date.format(formatter);

        System.out.println(dateFormatted);

    }
}