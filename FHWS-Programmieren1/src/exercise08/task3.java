package exercise08;

public class task3
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.print("Error - Enter two digits!");
            System.exit(0);
        } else
        {
            System.out.println(Double.parseDouble(args[0]) * Double.parseDouble(args[1]));
        }
    }
}

/*
    1. Locate the task3.java file in the Windows Explorer
    2. Open the Command Prompt in the Windows Explorer:     cmd
    3. Compile the Java file:                               javac task3.java
    4. Go to the src folder:                                cd..
    5. Run the Java class:                                  java exercise08.task3 2 4
    6. Returns the product of two numbers:                  8
*/