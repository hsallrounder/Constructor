public class Student {
    String name;
    Student()    // Non-parameterized ---> Will return "Unknown"
    {
        this.name = "Unknown";
    }
    Student(String n) // Parameterized ---> Will return string value 'n' passed while creating.
    {
        name = n;
    }
}
class main {
    public static void main(String[] args) {
        Student obj1 = new Student();     // for non-parameterized.
        Student obj2 = new Student("Himanshu");  // for parameterized.
        System.out.println(obj1.name);      // displaying the both objects created.
        System.out.println(obj2.name);
    }
}
