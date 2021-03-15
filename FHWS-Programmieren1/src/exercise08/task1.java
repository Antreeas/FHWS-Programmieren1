package exercise08;

import java.util.stream.IntStream;

public class task1
{
    public static void main(String[] args)
    {
        int[] numbers = new task1().playLotto();
        numbers = new task1().sort(numbers);
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d ", numbers[i]);
        }
    }

    public int[] playLotto()
    {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; )
        {
            int randomNumber = (int) (Math.random() * 49 + 1);
            if (!IntStream.of(numbers).anyMatch(x -> x == randomNumber))
            {
                numbers[i] = randomNumber;
                i++;
            }
        }
        return numbers;
    }

    public int[] sort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = (i + 1); j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}