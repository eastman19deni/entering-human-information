import java.io.IOException;
import java.io.FileWriter;

public class WriteFile {
    public void writeData(String data, String path){
        System.out.println(path);
        System.out.println(path.getClass().getSimpleName());
        try(FileWriter fw = new FileWriter(path, true)){
            fw.append(data);
            fw.append("\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
