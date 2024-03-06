import java.util.*;

public class School {
    private Floor[] floors;
    private String name;

    public School(String name, Floor[] floors) {
        this.name = name;
        this.floors = floors;
    }

    public Floor getFloor(int id) {
        for (int i = 0; i < floors.length; i++) {
            if (floors[i].getId() == id) {
                return floors[i];
            }
        }
        return null;
    }

    public void printSchool(Tourist tourist, Scanner console) {
        // print all text and ask user what floor they want to go to
        // Example of how picking there choice would work: (if they picked 2)
        int x = 2;
        Floor floor = getFloor(x);
        if (floor != null) {
            floor.printFloor(tourist, console);
        }
        else {
            // they picked an invalid floor
        }
    }
}
