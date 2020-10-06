package behavioral.command;

public class ConcreateCommand extends Command{

    public ConcreateCommand(Receiver receiver) { super(receiver); }

    @Override
    public void execute() {
        receiver.action();
    }
}
