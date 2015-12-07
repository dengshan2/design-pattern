package linux_node;


/**
 * Created by root on 10/13/15.
 */
public class test {
    public static void main(String[] args) {



//        List<String> list = new LinkedList<>();
//        BufferedReader br = null;
//        try {
//            Process p = Runtime.getRuntime().exec("/bin/ps aux");
//            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
//            String line;
//            while ((line = br.readLine()) != null) {
//                list.add(line);
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        for (String s : list) {
//            System.out.println(s);
//        }


//        Map<String, Object> cfgMap = (JSONObject)JSON.parse("{\n" +
//                "        \"flumeAddr\":\"192.168.21.20\",\n" +
//                "        \"flumePort\":5858,\n" +
//                "        \"flumeBatchSize\":100,\n" +
//                "        \"sendCacheSize\":1000,\n" +
//                "        \"sshdNumThreshold\":30,\n" +
//                "        \"readConfSeconds\":3,\n" +
//                "        \"localThriftServerPort\":9996,\n" +
//                "        \"machines\":{\n" +
//                "            \"192.168.20.58\":{\n" +
//                "                \"user_name\":\"root\",\n" +
//                "                \"machine_name\":\"58\",\n" +
//                "                \"need_pause\":\"No\",\n" +
//                "                \"password\":\"123dev\",\n" +
//                "                \"log_type\":{\n" +
//                "                    \"maillog\":{\n" +
//                "                        \"file_reg\":\"/var/log/maillog*\",\n" +
//                "                        \"is_multi_lines\":false,\n" +
//                "                        \"charset\":\"utf-8\",\n" +
//                "                        \"timestamp_reg\":\"\"\n" +
//                "                    }\n" +
//                "                }\n" +
//                "            },\n" +
//                "        }\n" +
//                "    }");
//        String flumeAddr = cfgMap.get("flumeAddr").toString();
//        int flumePort = (int)cfgMap.get("flumePort");
//        int flumeBatchSize = (int)cfgMap.get("flumeBatchSize");
//        int sendCacheSize = (int)cfgMap.get("sendCacheSize");
//        int sshdNumThreshold = (int) cfgMap.get("sshdNumThreshold");
//        int readConfSeconds = (int) cfgMap.get("readConfSeconds");
//        int localThriftServerPort = (int)cfgMap.get("localThriftServerPort");
//        String machineStatusPath = "machineStatusPath.json";
//        String log4jConfPath = "log4j.properties";
//        String machineConfPath = "machineConfPath.json";
//        Object machines = cfgMap.get("machines");
//        System.out.println(machines);
//
//        Map<String, Object> logCollectionConf = new HashMap<>();
//        logCollectionConf.put("flumeAddr", flumeAddr);
//        logCollectionConf.put("flumePort", flumePort);
//        logCollectionConf.put("flumeBatchSize", flumeBatchSize);
//        logCollectionConf.put("sendCacheSize", sendCacheSize);
//        logCollectionConf.put("sshdNumThreshold", sshdNumThreshold);
//        logCollectionConf.put("readConfSeconds", readConfSeconds);
//        logCollectionConf.put("localThriftServerPort", localThriftServerPort);
//        logCollectionConf.put("machineStatusPath", machineStatusPath);
//        logCollectionConf.put("log4jConfPath", log4jConfPath);
//        logCollectionConf.put("machineConfPath", machineConfPath);
//
//        String logCollectionConfString = JSON.toJSONString(logCollectionConf);
//
//        System.out.println(logCollectionConfString);
//
//        File file = new File("logCollectionConf");
//        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
//            bw.write("haha");
//            bw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(file.toString());
//
//
//        Map<String, Object> machine = (JSONObject)cfgMap.get("machines");
//        Set<String> keys =  machine.keySet();
//        for (String key : keys) {
//            Map<String, Object> ipEach = (JSONObject)machine.get(key);
//            String password = ipEach.get("password").toString();
//            System.out.println(password);
////            ipEach.put
//        }

    }
}
