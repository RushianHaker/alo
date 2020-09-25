package game;

public class Door extends MapSite{
    private Room room1 = null;
    private Room room2 = null;

    public Door(Room r1, Room r2){
        this.room1 = r1;
        this.room2 = r2;
    }

    public Room otherSideFrom(Room room){
        if(room == room1)
            return room2;
        else
            return room1;
    }

    @Override
    public void enter() {
        System.out.println("Door");
    }
}
