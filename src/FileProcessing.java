import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class FileProcessing {
    private final ArrayList<Long> LIST_LONG = new ArrayList();
    private final ArrayList<Double> LIST_DOUBLE = new ArrayList();
    private final ArrayList<String> LIST_STRING = new ArrayList();

    public void readFile(String fileName){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(scanner.hasNext()) {
            if (scanner.hasNextLong()) {
                long scan = scanner.nextLong();
                LIST_LONG.add(scan);
            }else if (scanner.hasNextDouble()){
                double scan = scanner.nextDouble();
                LIST_DOUBLE.add(scan);
            }else if (scanner.hasNextLine()){
                String scan = scanner.nextLine();
                if (scan.contains("1") || scan.contains("2") || scan.contains("3")){
                    LIST_DOUBLE.add(Double.parseDouble(scan));
                }else{
                    LIST_STRING.add(scan);
                }
            }
        }
        System.out.println(LIST_LONG);
        System.out.println(LIST_DOUBLE);
        System.out.println(LIST_STRING);
    }
    public ArrayList<Long> getListLong() {
        return LIST_LONG;
    }
    public ArrayList<Double> getListDouble() {
        return LIST_DOUBLE;
    }
    public ArrayList<String> getLIST_STRING() {
        return LIST_STRING;
    }
}