import java.util.*;

public class Floor {
    private int id;
    private Room[][] rooms;
    private boolean[][] walkable;

    public Floor(int id, Room[][] rooms, boolean[][] walkable) {
        this.id = id;
        this.rooms = rooms;
        this.walkable = walkable;
    }

    public int getId() {
        return id;
    }

    public void printFloor(Tourist tourist, Scanner console) {
        while (true) {
            int pos_x = 0;
            int pos_y = 0;

            for(int i = 0; i < rooms.length; i++) {
                for(int x = 0; x < rooms[i].length; x++) {
                    if(rooms[i][x] != null) {
                        if(tourist.getRoomId() == rooms[i][x].getId()) {
                            System.out.print("*");

                            pos_x = i; // Its late ok dont gudge my variables
                            pos_y = x; // Actually all of this code is horrible
                        }
                        else {
                            System.out.print(" ");
                        }
                        System.out.print(rooms[i][x].getName(id) + " ");
                        x += rooms[i][x].getName(id).length()+1;
                    }
                    else if (walkable[i][x]) {
                        System.out.print("#");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

            String input = console.nextLine();
            if (input.equals("a")) {
                for(int i = pos_y-1; i >= 0; i--) {
                    if (rooms[pos_x][i] != null) {
                        tourist.setRoomId(rooms[pos_x][i].getId());
                        break;
                    }
                }
            }
            else if (input.equals("d")) {
                for(int i = pos_y+1; i < rooms[pos_x].length; i++) {
                    if (rooms[pos_x][i] != null) {
                        tourist.setRoomId(rooms[pos_x][i].getId());
                        break;
                    }
                }
            }
            else if (input.equals("s")) {
                for(int i = pos_x+1; i < rooms.length; i++) {
                    if (rooms[i][pos_y] != null) {
                        tourist.setRoomId(rooms[i][pos_y].getId());
                        break;
                    }
                }
            }
            else if (input.equals("w")) {
                for(int i = pos_x-1; i >= 0; i--) {
                    if (rooms[i][pos_y] != null) {
                        tourist.setRoomId(rooms[i][pos_y].getId());
                        break;
                    }
                }
            }
            else if (input.equals("")) {
                for(int i = 0; i < rooms.length; i++) {
                    for(int x = 0; x < rooms[i].length; x++) {
                        if(rooms[i][x] != null && rooms[i][x].getId() == tourist.getRoomId()) {
                            rooms[i][x].printRoom(tourist, console);
                        }
                    }
                }
            }
            else if (input.equals("q")) {
                return;
            }
        }
    }
}
