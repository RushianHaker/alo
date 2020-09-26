package game;

public class MazeGame {
    public Maze createMaze() {
        Maze maze = new Maze();

        Room room1 = new Room(1);
        Room room2 = new Room(2);

        Door door = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.addSides(Direction.North, new Wall());
        room1.addSides(Direction.South, new Wall());
        room1.addSides(Direction.West, door);
        room1.addSides(Direction.East, new Wall());

        room2.addSides(Direction.North, door);
        room2.addSides(Direction.South, new Wall());
        room2.addSides(Direction.West, new Wall());
        room2.addSides(Direction.East, new Wall());

        return maze;
    }
}
