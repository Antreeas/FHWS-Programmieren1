package exercise03;

public class task4
{
    public static void main(String[] args)
    {
        int index = (int) (Math.random() * 6);
        String[] dice = {"One", "Two", "Three", "Four", "Five", "Six"};
        System.out.printf("Dice rolled a %s\n", dice[index]);
    }
}