package Process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 10/12/15.
 */
public class TestProcess {
    public static void main(String[] args) {
        try {
            String[] command = new String[]{"/bin/sh", "-c", " ls -l"};
            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
            System.out.println(buffer.toString());



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
