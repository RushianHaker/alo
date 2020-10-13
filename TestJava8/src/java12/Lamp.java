package java12;

public class Lamp implements ElectronicityCons {

    public void lampOn(){
        System.out.println("Лампа включена");
    }

    @Override
    public void swirchOn() {
        lampOn();
    }
}
