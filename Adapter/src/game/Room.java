package game;

import java.util.HashMap;
import java.util.Map;

public class Room extends MapSite {

    private int roomNumber = 0;
    private Map<Direction, MapSite> sides = null;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.sides = new HashMap<>(4);
    }

    public void addSides(Direction direction, MapSite mapSite) {
        this.sides.put(direction, mapSite);
    }

    public MapSite getSides(Direction direction) {
        return this.sides.get(direction);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void enter() {
        System.out.println("Room");
    }
}
