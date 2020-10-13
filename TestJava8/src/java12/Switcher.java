package java12;

import java.util.ArrayList;
import java.util.List;

public class Switcher implements ElectronicityCons {

    private List<ElectronicityCons> listener;

    public Switcher() {
        listener = new ArrayList<>();
    }

    public void addElectrisityListener(ElectronicityCons list){
        listener.add(list);
    }

    public void removeElectrisityListener(ElectronicityCons list){
        listener.remove(list);
    }

    @Override
    public void swirchOn() {
        System.out.println("Выключатель в состоянии вкл.");
        for (ElectronicityCons listener: listener){
            listener.swirchOn();
        }
    }
}
