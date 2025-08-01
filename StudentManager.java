
import java.util.*;

public class StudentManager {

    
    @SuppressWarnings("FieldMayBeFinal")
    private static  List<Student> students = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do { 
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
        
        
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAll();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (true);
    }

    public static void addStudent()
    {
        System.out.println("Enter the Rollnumber: ");
        int roll= sc.nextInt();
        sc.nextLine();
        for(Student s: students)
        {
            if(s.getrollnum()==roll)
            {
                System.out.println("Student with this roll number already exists.");
                return;
            }
        }
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();


        Student s= new Student(roll, name, age, course);
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public static void viewAll()
    {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            s.displayinfo();
        }
    }

    public static void searchStudent()
    {
        System.out.println("Enter the roll number to search: ");
        int roll =sc.nextInt();
        sc.nextLine();

        for(Student s: students)
        {
            if(s.getrollnum()==roll)
            {
                s.displayinfo();
                return;
            }
        }

        System.out.println("Student not found ");
    }

    public static void updateStudent() {
        System.out.print("Enter Roll Number to update: ");
        int roll = sc.nextInt();
        sc.nextLine();

        for(Student s: students)
        {
            if(s.getrollnum()==roll)
            {
                System.out.println("Enter new name: ");
                s.setname(sc.nextLine());
                System.out.println("Enter new age: ");
                s.setage(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter New Course: ");
                s.setcourse(sc.nextLine());
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int roll = sc.nextInt();

        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext())
        {
            Student s= iterator.next();
            if(s.getrollnum()==roll){
                iterator.remove();
                System.out.println("Student has removed!");
                return;
            }
        }
        System.out.println("Student not found");
    }


}
