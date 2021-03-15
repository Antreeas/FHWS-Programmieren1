package exercise02;

public class Tausch
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 7;

        System.out.println("Pre Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swap
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Post Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}