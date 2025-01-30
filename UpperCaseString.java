public class UpperCaseString {
    public static void main(String[] args) {
        // Predefined input string
        String input = "Hello, World!";
        
        // Convert the string to uppercase
        String upperCaseString = convertToUpperCase(input);
        
        // Print the original and converted strings
        System.out.println("Original string: " + input);
        System.out.println("Uppercase string: " + upperCaseString);
    }
    public static String convertToUpperCase(String str) {
        // Use the toUpperCase() method of the String class
        return str.toUpperCase();
    }
}
