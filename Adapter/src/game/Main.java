package game;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MazeGame mazeGame = new MazeGame();

        Maze maze = mazeGame.createMaze(); // фабричный метод

        Random random = new Random();

        // помещаем нашего игрока в комнату случайный образом
        Room room = maze.roomNo(random.ints(1,3).findFirst().getAsInt());

        MapSite site = null;


        while (true) {

            switch (random.ints(0,4).findFirst().getAsInt()) {
                case 0:
                    site = room.getSides(Direction.North);
                    break;
                case 1:
                    site = room.getSides(Direction.South);
                    break;
                case 2:
                    site = room.getSides(Direction.West);
                    break;
                case 3:
                    site = room.getSides(Direction.East);
                    break;
            }

            System.out.println(String.format("Я нахожусь в %d комнате. Делаем шаг", room.getRoomNumber())); // Либо вот так: System.out.printf("");

            // делаем шаг
            site.enter();

            // c# site is Door
            if(site instanceof Door) {
                Door door = (Door) site;
                room = door.otherSideFrom(room);
            }

            // задержка между шагами
            Thread.sleep(1000);

        }

    }
}
