package game;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer,Room> rooms = null;


    public Maze(){this.rooms = new HashMap<>();}

    public void addRoom(Room room){this.rooms.put(room.getRoomNumber(),room);}

    public Room roomNo(int number){return this.rooms.get(number);}
}
