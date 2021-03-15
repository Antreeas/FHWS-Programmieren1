package exercise08;

public class task2
{
    public static void main(String[] args)
    {
        String text = "spiel mit mir";
        System.out.println(text);
        System.out.println(new task2().play(text));
    }

    public String play(String text)
    {
        char[] letters = text.toCharArray();
        String newText = "";
        for (char c : letters)
        {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                newText = newText + c + 'b' + Character.toLowerCase(c);
            } else
            {
                newText = newText + c;
            }
        }
        return newText;
    }
}