import java.util.*;

public class Container {
    private String name;
    private String value;
    private Container sub;

    public String getName() {
        return name;
    }

    public void printContainer(Tourist tourist, Scanner console) {
        // Print the actual container


        // Makes it so that if you press 'q' you go one level deeper but if you
        // press anything else you will go to the room
        if (console.nextLine().equals("q") && sub != null) {
            sub.printContainer(tourist, console);
        }
    }
}
