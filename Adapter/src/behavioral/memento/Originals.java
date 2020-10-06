package behavioral.memento;

public class Originals {
    private String state;

    public void setMomento(Memento memento){
        this.state = memento.getState();
    }

    public Memento createMomento(){
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
