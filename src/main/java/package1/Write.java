package package1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static void write(String str) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write(str + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\n...");
        }
    }

    public static void read() throws Exception {
        FileReader fr = new FileReader("sample.txt");
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
    }

}
