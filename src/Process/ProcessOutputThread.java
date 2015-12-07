package Process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/12/15.
 */
public class ProcessOutputThread extends Thread {
    private InputStream is;
    private List<String> outputList;

    public ProcessOutputThread(InputStream is) throws IOException {
        if (null == is) {
            throw new IOException("the provided InputStream is null");
        }
        this.is = is;
        outputList = new ArrayList<String>();
    }

    public List<String> getOutputList() {
        return outputList;
    }

    @Override
    public void run() {
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String result;
            while (null != (result = br.readLine())) {
                System.out.println(result);
                outputList.add(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != br) {
                    br.close();
                }
                if (null != isr) {
                    isr.close();
                }
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
