package behavioral.command;

public class Invocker {
    private Command command;

    public void storeCommand(Command command){
        this.command = command;
    }

    public void excuteCommand(){
        command.execute();
    }
}
