
public class Main {
    private static final String FILE1 = "inputFiles/file1.txt";
    private static final String FILE2 = "inputFiles/file2.txt";

    public static void main(String[] args){
    FileProcessing fileProcessing1 = new FileProcessing();
    FileProcessing fileProcessing2 = new FileProcessing();
    fileProcessing1.readFile(FILE1);
    fileProcessing2.readFile(FILE2);
    }
}
