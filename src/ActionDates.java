import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActionDates extends Observer {
    private FileOutputStream fw;

    public ActionDates(NumberSequence numberSequence, String fileName) {
        super(numberSequence);
        try {
            fw = new FileOutputStream(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doAction() {
        try {
            StringBuilder output = new StringBuilder();
            for (int number : getNumberSequence().getNumberList()) output.append(number).append(" ");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            output.append(simpleDateFormat.format(new Date()));
            fw.write((output.toString() + "\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
