public class Student
{
    final  int rollnumber;
    private String name;
    private int age;
    private String course;

    public Student(int rollnumber, String name , int age, String course)
    {
        this.rollnumber=rollnumber;
        this.name=name;
        this.age=age;
        this.course=course;
    }

    public int getrollnum()
    {
        return rollnumber;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public String getcourse()
    {
        return course;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public void setage(int age)
    {
        this.age=age;
    }

    public void setcourse(String course)
    {
        this.course=course;
    }
    public void displayinfo()
    {
        System.out.println("Rollnumber: "+ rollnumber + "|"+"Student name: "+name +"| Age: "+ age+"| Coures: "+course);
    }
}