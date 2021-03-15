package exercise10.University;

import java.util.Arrays;

public class Room
{
    //region Attributes
    private String id;
    private int capacity;
    private Student[] students;
    private Lecture lecture;
    //endregion

    //region Getter and Setter
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public Student[] getStudents()
    {
        return students;
    }

    public void setStudents(Student[] students)
    {
        this.students = students;
    }

    public Lecture getLecture()
    {
        return lecture;
    }

    public void setLecture(Lecture lecture)
    {
        this.lecture = lecture;
    }
    //endregion

    public Room(String id, int capacity)
    {
        this.id = id;
        this.capacity = capacity;
        students = new Student[this.capacity];
    }

    public void enterRoom(Student student)
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i] == null)
            {
                students[i] = student;
                System.out.printf("%10s enters %s. \r", student.getName(), this.id);
                break;
            }
        }
    }

    public void leaveRoom(Student student)
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i] == student)
            {
                students[i] = null;
                System.out.printf("%10s leaves %s.%n", student.getName(), this.id);
                break;
            }
        }
    }
}