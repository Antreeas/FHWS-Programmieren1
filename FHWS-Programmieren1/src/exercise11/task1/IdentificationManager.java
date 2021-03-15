package exercise11.task1;

public class IdentificationManager
{
    public static void main(String[] args)
    {
        Identification[] identifications = generate();
        printID(identifications);
    }

    public static Identification[] generate()
    {
        Identification[] ids = new Identification[6];
        ids[0] = new Identification("Generic", "Identification", "neutral");
        ids[1] = new Identification("Maximilian", "Mustermann", "male");
        ids[2] = new StudentId("The", "Good", "mannlich", 1850);
        ids[3] = new StudentId("The", "Ugly", "mannlich", 1860);
        ids[4] = new UnionId("Jesus", "Christ", "mannlich", "Church");
        ids[5] = new UnionId("Satan", "McFire", "mannlich", "Hell");
        return ids;
    }

    public static void printID(Identification[] identifications)
    {
        for (int i = 0; i < identifications.length; i++)
        {
            if (identifications[i] == null)
            {
                System.out.printf("Index %d is empty", i);
            } else
            {
                System.out.println(identifications[i]);
            }
        }
    }
}