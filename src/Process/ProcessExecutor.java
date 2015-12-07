package Process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by root on 10/12/15.
 */
public class ProcessExecutor {
    private Process p;
    private List<String> outputList;
    private List<String> errorOutputList;

    public ProcessExecutor(Process p) throws IOException {
        if (null == p) {
            throw new IOException("the provided Process is null");
        }
        this.p = p;
    }

    public List<String> getOutputList() {
        return outputList;
    }

    public List<String> getErrorOutputList() {
        return errorOutputList;
    }

    public int execute() throws IOException, InterruptedException {
        int rs = 0;
        ProcessOutputThread outputThread = new ProcessOutputThread(p.getInputStream());
        ProcessOutputThread errorOutputThread = new ProcessOutputThread(p.getErrorStream());
        outputThread.start();
        errorOutputThread.start();
        rs = p.waitFor();
        outputThread.join();
        errorOutputThread.join();
        outputList = outputThread.getOutputList();
        errorOutputList = errorOutputThread.getOutputList();
        return rs;
    }

    public static int execute2() throws IOException, InterruptedException {
        int rs = 0;
        String[] commands = new String[] {"/bin/sh", "-c", "ls"};// command and arg
        ProcessBuilder builder = new ProcessBuilder(commands);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (null != (line = br.readLine())) {
            System.out.println(line);
        }
        br.close();
        rs = p.waitFor();
        return rs;
    }

    public static void main(String[] args) throws Exception {
//        String[] commands = new String[] {"/bin/sh", "-c", "ls -l"};
//        ProcessExecutor processExecutor = new ProcessExecutor(Runtime.getRuntime().exec(commands));
//        processExecutor.execute();
//        System.out.println(processExecutor.getOutputList().toString());
//        System.out.println(processExecutor.getErrorOutputList().toString());

        int rs = execute2();
        System.out.println(rs);
    }
}

