package exercise11.task2;

public class ClockManager
{
    public static void main(String[] args)
    {
        Clock[] globalTimes = new Clock[24];
        for (int i = 0; i < globalTimes.length; i++)
        {
            globalTimes[i] = new Clock(i, 23, 7);
            globalTimes[i].nextSecond();
        }

        while (true)
        {
            try
            {
                System.out.print(globalTimes[0]);
                Thread.sleep(1000);
                for (Clock e : globalTimes)
                {
                    e.nextSecond();
                }
            } catch (InterruptedException e1)
            {
                e1.printStackTrace();
            }
        }
    }
}