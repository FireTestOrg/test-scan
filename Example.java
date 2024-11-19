public class Example {
    public static void main(String[] args) {
        // Intentional bug: Null pointer dereference
        String text = null;
        System.out.println(text.length());
        
        // Unused variable
        int unused = 10;

        // Code smell: Use of magic number
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    // Code smell: Method too long
    public void longMethod() {
        System.out.println("This is a very long method");
        // Add 50+ lines of unnecessary code here
    }
}
