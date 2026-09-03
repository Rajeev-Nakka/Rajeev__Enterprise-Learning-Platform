import java.io.*;

public class FileHandlingExample {

    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("Student.txt");

        fw.write("Hello Rajeev");

        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("Student.txt"));

        String data = br.readLine();

        System.out.println(data);

        br.close();

    }

}