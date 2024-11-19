using System;

class Example {
    static void Main(string[] args) {
        // Bug: Divide by zero
        int number = 10;
        int zero = 0;
        Console.WriteLine(number / zero);

        // Code smell: Magic number
        int result = number * 42;

        // Unused method
        Console.WriteLine(UnusedMethod());
    }

    static string UnusedMethod() {
        return "I am unused!";
    }
}
