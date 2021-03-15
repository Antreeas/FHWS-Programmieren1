package exercise02;

import java.time.LocalTime;

public class Time
{
    public static void main(String[] args)
    {
        LocalTime now = LocalTime.now();
        int HH = now.getHour();
        int mm = now.getMinute();
        int ss = now.getSecond();

        int sssincemidnight = HH * 3600 + mm * 60 + ss;
        int ssuntilmidnight = 86400 - sssincemidnight;
        double percentageofday = 100.0 / 86400 * sssincemidnight;

        System.out.printf("%5d seconds passed since midnight.\n", sssincemidnight);
        System.out.printf("%d seconds remain until midnight.\n", ssuntilmidnight);
        System.out.printf("%5.2f percent of the day has passed.\n", percentageofday);
    }
}
