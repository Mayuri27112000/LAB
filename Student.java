import java.util.ArrayList;
import java.util.List;

//student class
public class Student
{
	//declaring private variables
	private String name;
    private int rollNumber;

    //constructor
    public Student(String name, int rollNumber) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }
 
    //getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    //main method
    public static void main(String[] args) 
    {
        List<Student> students = new ArrayList<>();

        // Add 10 student objects
        students.add(new Student("Mayu", 101));
        students.add(new Student("Babby",102));
        students.add(new Student("Srinu",103));
        students.add(new Student("Ram", 104));
        students.add(new Student("Chikku", 105));
        students.add(new Student("Mahe", 106));
        students.add(new Student("Hema", 107));
        students.add(new Student("Chinna",108));
        students.add(new Student("Lalli",109));
        students.add(new Student("Avi", 110));

        // Print student details
        for (Student student : students) 
        {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber());
        }
    }
	
}
