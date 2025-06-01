import java.io.*;

public class PRJ_LiveFileReaderWriter {

    private static volatile boolean keeprunning = true;
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws IOException, InterruptedException {

        File serverFile = new File("server.txt");

        Runnable ReaderTask = () -> {
            while (keeprunning) {


                try (BufferedReader bf = new BufferedReader(new FileReader(serverFile));

                     FileWriter fw = new FileWriter("resource.txt", true)) { // append mode

                    String line;
                    while ((line = bf.readLine()) != null) {
                        synchronized (LOCK) {
                            System.out.println("Data read: " + line);
                            fw.write(line + System.lineSeparator());
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                break;
            }
        };

        Thread th = Thread.startVirtualThread(ReaderTask);
        th.join();
    }
}
