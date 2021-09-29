import java.util.Scanner;

public class Box {         //box class containing its dimensions.
    double width;
    double height;
    double depth;
    public Box(double w,double h,double d)  //parameterized construction to pass dimesions.
    {
         width = w;
         height = h;
         depth = d;
    }
    double volume()            // method to return the volume.
    {
        return width*height*depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // passing the arguments.
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();
        Box volume = new Box(width,height,depth); // creating a new object for 'Box'.
        System.out.println(volume.volume());  // displaying the volume.
    }
}

