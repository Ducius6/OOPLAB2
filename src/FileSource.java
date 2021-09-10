import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSource implements INumberSource {
    private BufferedReader br;

    public FileSource(String fileName) {
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int loadNumber() {
        try {
            String line = br.readLine();
            if (line.isEmpty()) return -1;
            else return Integer.parseInt(br.readLine());
        } catch (IOException e) {
            return -1;
        }
    }
}
