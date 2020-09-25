package game;

public class Wall extends MapSite{
    public Wall() {}

    @Override
    public void enter() {
        System.out.println("Wall");
    }
}
