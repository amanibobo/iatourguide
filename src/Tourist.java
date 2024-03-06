import java.util.*;

public class Tourist {
    private int roomId;
    private boolean roomHover;

    public Tourist(int roomId, boolean roomHover) {
        this.roomId = roomId;
        this.roomHover = roomHover;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void tour(School school) {
        Scanner console = new Scanner(System.in);
        school.printSchool(this, console);
    }
}
