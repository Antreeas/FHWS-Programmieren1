package exercise09;

public class task4
{
    public static void main(String[] args)
    {
        double solution = 0;
        for (int i = 1; i < args.length - 1; i++)
        {
            solution = solution + Double.parseDouble(args[i]);
        }
        if (args[args.length - 1].equals("+"))
        {
            solution = Double.parseDouble(args[0]) + solution;
        } else
        {
            solution = Double.parseDouble(args[0]) - solution;
        }
        System.out.println(solution);
    }
}

/*
    1. Locate the task3.java file in the Windows Explorer
    2. Open the Command Prompt in the Windows Explorer:     cmd
    3. Compile the Java file:                               javac task3.java
    4. Go to the src folder:                                cd..
    5. Run the Java class:                                  java exercise09.task4 1 2 3 +
    6. Returns the result:                                  6 (= 1 + 2 + 3)
    7. Run the Java class:                                  java exercise09.task4 10 2 3 -
    8. Returns the result:                                  5 (= 10 - 2 - 3)
*/