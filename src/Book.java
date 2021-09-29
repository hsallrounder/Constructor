import java.util.Scanner;

class Author {                      // will contain the author detail passed using getter and setter.
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Book{               // will contain the details for book.
    String name;
    Author author = new Author();
    double price;
    int qtyInStock;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // will create a new scanner class object.
        Book book = new Book(); // will create a new book class object.
        // Passing the details of author and the book.
        book.name = sc.nextLine();
        book.author.setName(sc.nextLine());
        book.author.setAge(sc.nextInt());
        book.price = sc.nextDouble();
        book.qtyInStock = sc.nextInt();
        // Displaying all the details.
        System.out.println(book.name);
        System.out.println(book.author.getName());
        System.out.println(book.author.getAge());
        System.out.println(book.price);
        System.out.println(book.qtyInStock);
    }
}