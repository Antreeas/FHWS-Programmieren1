package exercise11.task2;

public class Clock
{
    private int seconds;

    public Clock(int hh, int mm, int ss)
    {
        if (!correctTime(hh, mm, ss))
        {
            hh = 12;
            mm = 0;
            ss = 0;
        }
        setClock(hh, mm, ss);
    }

    public boolean correctTime(int hh, int mm, int ss)
    {
        return (hh >= 0 && hh < 24) && (mm >= 0 && mm <= 59) && (ss >= 0 && ss <= 59);
    }

    public void setClock(int hh, int mm, int ss)
    {
        if (correctTime(hh, mm, ss))
        {
            this.seconds = (hh * 3600 + mm * 60 + ss);
        } else
        {
            System.out.println("Error - Invalid Format");
        }
    }

    public int calculateHour()
    {
        return seconds / 3600;
    }

    public int calculateMinute()
    {
        return (seconds % 3600) / 60;
    }

    public int calculateSecond()
    {
        return seconds % 60;
    }

    public void nextSecond()
    {
        seconds = (seconds + 1) % 86400;
    }

    public long getSecondsFromMidnight()
    {
        return seconds;
    }

    public boolean alarm(Clock alarmTime)
    {
        return seconds == alarmTime.getSecondsFromMidnight();
    }

    @Override
    public String toString()
    {
        return String.format("%02d:%02d:%02d \n", this.calculateHour(), this.calculateMinute(), this.calculateSecond());
    }
}