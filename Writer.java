import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    // private String path;

    // public Writer(String path){
    //     this.path = path;
    // }

    public void Write(String path, String text){
        try(FileWriter fw = new FileWriter(path, true)){
            fw.write(text + "\n");
            fw.flush();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
