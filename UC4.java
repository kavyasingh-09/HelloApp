public class UC4 {
    public static void main(String[] args) {

        String message;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            message = String.join(", ", args);
        } else {
            // Default value
            message = "World";
        }

        System.out.println("Hello, " + message + "!");
    }
}