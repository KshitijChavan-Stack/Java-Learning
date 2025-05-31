import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_read_write {
    public static void main(String[] args) throws IOException {
        File f = new File("hello.txt");
        String data = "";
        //Create a file and check if its created
        if (f.exists()) {
            System.out.println("File Present");
            if (f.canRead()) {
                Scanner sc = new Scanner(f);
                while (sc.hasNextLine()) {
                    data = sc.nextLine();
                }
                System.out.println(data);
            } else {
                System.out.println("File not found");
            }
        }
    }
}
