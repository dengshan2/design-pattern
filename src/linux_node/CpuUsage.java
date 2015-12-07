package linux_node;

import com.mlp.util.ResourceUsage;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLock;

/**
 * Created by root on 10/14/15.
 * zd
 */
public class CpuUsage extends ResourceUsage {
//    private static Logger log = Logger.getLogger(CpuUsage.class);
//    private static CpuUsage INSTANCE = new CpuUsage();
//
//    private CpuUsage() {
//
//    }
//
//    public static CpuUsage getINSTANCE() {
//        return INSTANCE;
//    }
//
//    public float get() {
//        float cpuUsage = 0;
//        Process pro1, pro2;
//        Runtime r = Runtime.getRuntime();
//        try {
//            String command = "cat /proc/stat";
//            // 第一次采集CPU时间
//            long startTime = System.currentTimeMillis();
//            pro1 = r.exec(command);
//            BufferedReader in1 = new BufferedReader(new InputStreamReader(pro1.getInputStream()));
//            String line;
//            long idleCpuTime1 = 0, totalCpuTime1 = 0; // 分别为系统启动后空闲的CPU时间和总的CPU时间
//            while ((line = in1.readLine()) != null) {
//                if (line.startsWith("cpu")) {
//                    line = line.trim();
//                    String[] temp = line.split("\\s+");
//                    idleCpuTime1 = Long.parseLong(temp[4]);
//                    for (String s : temp) {
//                        if (!s.equals("cpu")) {
//                            totalCpuTime1 += Long.parseLong(s);
//                        }
//                    }
//                    break;
//                }
//            }
//            in1.close();
//            pro1.destroy();
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                StringWriter sw = new StringWriter();
//                e.printStackTrace(new PrintWriter(sw));
//            }
//
//            // 第二次采集CPU时间
//            long endTime = System.currentTimeMillis();
//            pro2 = r.exec(command);
//            BufferedReader in2 = new BufferedReader(new InputStreamReader(pro2.getInputStream()));
//            long idleCpuTime2 = 0, totalCpuTime2 = 0;
//            while ((line = in2.readLine()) != null) {
//                if (line.startsWith("cpu")) {
//                    line = line.trim();
//                    String[] temp = line.split("\\s+");
//                    idleCpuTime2 = Long.parseLong(temp[4]);
//                    for (String s : temp) {
//                        if (!s.equals("cpu")) {
//                            totalCpuTime2 += Long.parseLong(s);
//                        }
//                    }
//                    break;
//                }
//            }
//            if (idleCpuTime1 != 0 && totalCpuTime1 != 0 && idleCpuTime2 != 0 && totalCpuTime2 != 0) {
//                cpuUsage = 1 - (float)(idleCpuTime2 - idleCpuTime1)/(float)(totalCpuTime2 - totalCpuTime1);
//            }
//            in2.close();
//            pro2.destroy();
//        } catch (IOException e) {
//            StringWriter sw = new StringWriter();
//            e.printStackTrace(new PrintWriter(sw));
//
//        }
//        return cpuUsage;
//    }

    public static void main(String[] args) {
        long total = 0l;
        File file = new File("./data/linux_agent/conf/linuxMachineStatus.json");
        StringBuilder status = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(file)) {
            FileLock fl = fis.getChannel().tryLock(0, Long.MAX_VALUE, true);
            if (null != fl) {
                byte[] buf = new byte[1024];
                int hasRead;
                while ((hasRead = fis.read(buf)) != -1) {
                    String temp = new String(buf, 0, hasRead);
                    status.append(temp);
                }
            }
            fl.release();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] log_counts = StringUtils.substringsBetween(status.toString(), "log_count\":", ",");
        if (log_counts != null) {
            for (String log_count : log_counts) {
                total += Long.parseLong(log_count.trim());
            }
        }

        System.out.println(total);



















//        int count = Runtime.getRuntime().availableProcessors();
//        System.out.println(count);
//        // get name representing the running Java virtual machine
//        String name = ManagementFactory.getRuntimeMXBean().getName();
//        System.out.println(name);
//        // get pid
//        String pid = name.split("@")[0];
//        System.out.println("Pid is : " + pid);

        // 执行 ps aux
//        Process p = null;
//        BufferedReader br = null;
//        List<String> pidList = new LinkedList<>();
//        try {
//            p = Runtime.getRuntime().exec("/bin/ps aux");
//            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
//            String line;
//            while (null != (line = br.readLine())) {
//                System.out.println(line);
//                pidList.add(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (p != null) {
//                p.destroy();
//            }
//        }
//        List<String> usePidList = new ArrayList<>();
//
//
//        for (String aPidList : pidList) {
//            if (aPidList.contains(pid)) {
//                usePidList.add(aPidList);
//            }
//        }
//
//        String cpu = null;
//        String memory = null;
//        for (String anUsePidList : usePidList) {
//            String[] arr = anUsePidList.substring(0, anUsePidList.indexOf(":")).split("\\s+");
//            if (arr[1].equals(pid)) {
//                System.out.println(arr[2]);
//                System.out.println(arr[5]);
//                cpu = arr[2];
//                memory = arr[5];
//                break;
//            }
//        }
//
//        System.out.println("this process cpuUsage is :");
//        if (cpu != null) {
//            System.out.println(Double.parseDouble(cpu) / (count * 100));
//        } else {
//            System.out.println(0);
//        }
//        System.out.println("this process memoryUsage is :");
//        if (memory != null) {
//            System.out.println(Long.parseLong(memory) * 1024);
//        } else {
//            System.out.println(0);
//        }
//        try {
//            Thread.sleep(10000l);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        while (true) {
//            System.out.println(CpuUsage.getINSTANCE().get());
//            Thread.sleep(5000);
//        }
    }

}
