class AnsIdentifier {

    AnsIdentifier()
    {
        System.out.println("This is an Constructor.");
        //Will be executed at the time of each object creation.
    }
    int a = 8;
    String n = "hello";
    static {
        System.out.println("This is an Static Block."); //Will be displayed before the constructor statement.
        // will be executed only once.
    }
    // If we use non-static variables inside the static variables then it will throw compile time error.
    public static void main(String[] args) {
        new AnsIdentifier();
        new AnsIdentifier();
    }
}
