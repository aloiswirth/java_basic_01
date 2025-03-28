
import java.util.Scanner;

public class Student { 
    public static void main(String[] args) {
        int age = 16;
        // double gpa = 3.0;
        boolean perfectAttendance = true;
        String studentFirstName = "Amanda";
        String studentLastName = "Lear";
        System.out.println("Age: " + age);
        char firstInitial = studentFirstName.charAt(0);
        char lastInitial = studentLastName.charAt(0);
        System.out.println("First initial: " + firstInitial);
        System.out.println("Last initial: " + lastInitial);
        System.out.println("Good Student: " + perfectAttendance);
        System.out.println("Student Name: " + studentFirstName + " " + studentLastName);
        System.out.println("Last Character: " + studentLastName.charAt(studentLastName.length() - 1));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine(); 
        System.out.println("You entered: " + name);
        input.close();
    }
}

/* 

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                '}';
    }
} */