package exercise10.University;

public class Student
{
    //region Attributes
    private String name;
    //endregion

    //region Getter and Setter
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    //endregion

    //region Constructors
    public Student(String name)
    {
        this.name = name;
    }
    //endregion
}