package exercise11.task1;

public class StudentId extends Identification
{
    //region Attributes
    private int matriculationNumber;
    //endregion

    //region Getter and Setter
    public int getMatriculationNumber()
    {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber)
    {
        this.matriculationNumber = matriculationNumber;
    }
    //endregion

    //region Constructors
    public StudentId(String prename, String surname, String gender, int matriculationNumber)
    {
        super(prename, surname, gender);
        this.matriculationNumber = matriculationNumber;
    }
    //endregion

    @Override
    public String toString()
    {
        return String.format("%s Student Number: %d", super.toString(), matriculationNumber);
    }
}
