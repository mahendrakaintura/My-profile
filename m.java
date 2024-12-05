import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class m {

    // Method to check if the name is valid (non-empty in this case)
    public static boolean check(String name) {
        return !name.isEmpty();
    }

    // Method to search for valid names in the predefined list
    public static void searchAndDisplayResults(List<String> names, String query) {
        System.out.println("\nSearch Results for: \"" + query + "\"");

        // Flag to check if we found any match
        boolean found = false;
        
        // Iterate over predefined names and check if they match the query
        for (String name : names) {
            if (name.toLowerCase().contains(query.toLowerCase()) && check(name)) {
                System.out.println(name + " : valid name");
                found = true;
            }
        }

        // If no valid names are found
        if (!found) {
            System.out.println("No valid names found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined list of names (this could be anything)
        List<String> names = new ArrayList<>();
        names.add("suraj");
        names.add("john123");
        names.add("iugsi");
        names.add("adam456");
        names.add("1234567");
        names.add("mark99");
        names.add("Abc123");
        names.add("nonEmptyName");

        // Start of dynamic input (for search query)
        System.out.println("Enter a search query (or type 'exit' to quit):");

        while (true) {
            String query = sc.nextLine().trim();

            // Exit condition if the user types "exit"
            if (query.equalsIgnoreCase("exit")) {
                break;
            }

            // Perform the search and display matching results
            searchAndDisplayResults(names, query);
        }

        sc.close();
    }
}
