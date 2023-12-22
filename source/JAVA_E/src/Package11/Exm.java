package Package11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exm {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        PrintWriter fw = new PrintWriter ("c:/work/java_exm/t1.txt");
        for (int i = 1; i < 10; i++) {
            String data = i + " \r\n";
            fw.write(data);
        }
        fw.close();
    }

}
