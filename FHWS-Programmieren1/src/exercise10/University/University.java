package exercise10.University;

public class University
{
    public static void main(String[] args)
    {
        Room[] rooms = new Room[2];
        rooms[0] = new Room("H.1.1", 10);
        rooms[1] = new Room("H.1.2", 4);

        for (int i = 0; i < rooms.length; i++)
        {
            System.out.printf("Raum %d occupied: %s \n", i, rooms[i].getLecture());
        }
        rooms[1].setLecture(new Lecture("Programmieren I", "Heinzl", "BIN"));
        for (int i = 0; i < rooms.length; i++)
        {
            System.out.printf("Raum %d occupied: %s \n", i, rooms[i].getLecture());
        }

        Student[] students = {new Student("Good"), new Student("Bad"), new Student("Ugly")};

        for (Student student : students)
        {
            rooms[1].enterRoom(student);
            rooms[1].getStudents();
        }
        for (Student student : students)
        {
            rooms[1].leaveRoom(student);
            rooms[1].getStudents();
        }
    }
}