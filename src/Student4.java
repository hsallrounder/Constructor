    public class Student4{
    String name;
    double percentage;

    Student4(String name, double percentage)     // method using parameterization.
    {
        this.name = name;
        this.percentage = percentage;
    }
}

class Test{
    public static void main(String[] args) {
        Student4 s1 = new Student4("Himanshu",97);         // three instances of student class with arguments.
        Student4 s2 = new Student4("Akshit",98);
        Student4 s3 = new Student4("Prayas",99);

        // using if-else statement to find the topper and hence displaying.

        if(s1.percentage>s2.percentage)
        {
            if(s1.percentage>s3.percentage)
            {
                System.out.println(s1.name+" "+s1.percentage);
            }
            else
            {
                System.out.println(s3.name+" "+s3.percentage);
            }
        }
        else
        {
            if (s2.percentage>s3.percentage)
            {
                System.out.println(s2.name+" "+ s2.percentage);
            }
            else
            {
                System.out.println(s3.name+" "+s3.percentage);
            }
        }
    }
}
