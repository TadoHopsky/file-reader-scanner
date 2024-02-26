import java.io.File;
import java.io.IOException;


public class CreateFile {
    public void createFileInt(){
        try {
            File file = new File("Result/FileInt.txt");
            if (!file.exists()) {
                file.createNewFile();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createFileFloat(){
        try {
            File file = new File("Result/FileFloat.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createFileString(){
        try {
            File file = new File("Result/FileString.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void realisation(){
        createFileInt();
        createFileFloat();
        createFileString();
    }
}
