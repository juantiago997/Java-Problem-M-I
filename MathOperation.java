public class MathOperation {

    // Method to determine if there is a mathematical operation that makes Number1
    // (operation) Number2 equal to Number3
    public static String mathFunction(int Number1, int Number2, int Number3) {
        // Check if Number1 + Number2 equals Number3
        if (Number1 + Number2 == Number3) {
            return "+"; // If true, return "+"
        }
        // Check if Number1 - Number2 equals Number3
        else if (Number1 - Number2 == Number3) {
            return "-"; // If true, return "-"
        }
        // Check if Number1 * Number2 equals Number3
        else if (Number1 * Number2 == Number3) {
            return "*"; // If true, return "*"
        }
        // Check if Number2 is not zero and Number1 / Number2 equals Number3
        else if (Number2 != 0 && Number1 / Number2 == Number3) {
            return "/"; // If true, return "/"
        } else {
            return "None"; // If none of the conditions are met, return "None"
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(mathFunction(1, 2, 3)); // Output: "+"
        System.out.println(mathFunction(2, 2, 4)); // Output: "+"
        System.out.println(mathFunction(3, -3, -9)); // Output: "*"
        System.out.println(mathFunction(1, 2, -1)); // Output: "-"
        System.out.println(mathFunction(3, 3, 1)); // Output: "/"
        System.out.println(mathFunction(7, 1, 11)); // Output: "None"
    }
}
