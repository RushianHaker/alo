package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Singlton {

    private static Singlton instance;

    public String filePathFirst = new String(Files.readAllBytes(FileSystems.getDefault().getPath("First.txt")));
    public String filePathSecond = new String(Files.readAllBytes(FileSystems.getDefault().getPath("Second.txt")));
    public String filePathThird = new String(Files.readAllBytes(FileSystems.getDefault().getPath("Third.txt")));

    private Singlton() throws IOException {
    }

    public static Singlton getInstance() throws IOException {
        if (instance == null) {
            instance = new Singlton();
        }
        return instance;
    }
}
