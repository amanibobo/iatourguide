import java.util.*;

public class Room {
    private int id;
    private String name;
    private Container[] items;
    private Interactable[] interations;

    // Helpful for floor planning people
    public Room(int id, String name) {
        this.id = id;
        this.name = name;
        this.items = new Container[]{};
        this.interations = new Interactable[]{};
    }

    public Room(int id, String name, Container[] items, Interactable[] interations) {
        this.id = id;
        this.name = name;
        this.items = items;
        this.interations = interations;
    }

    public String getName(int floor) {
        if (id == 0) {
            return name;
        }
        else {
            return "" + (floor*100 + id);
        }
    }

    public int getId() {
        return id;
    }

    public void printRoom(Tourist tourist, Scanner console) {
        // If they selected a container run something like this:
        int x = 0;
        items[x].printContainer(tourist, console);

        // If they selected a interaction run something like this:
        int y = 0;
        interations[y].interact(tourist, console);
    }
}
