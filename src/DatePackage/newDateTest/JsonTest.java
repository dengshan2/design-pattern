package DatePackage.newDateTest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 11/26/15.
 * zd
 */
public class JsonTest {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("machineName", null);
        map.put("userName", "zhaodeng");
        System.out.println(map);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(map.toString());
        String prettyString = gson.toJson(je);
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("conf/logCollectorConf.json")))) {
            bw.write(prettyString);
            bw.flush();
        }
    }
}
