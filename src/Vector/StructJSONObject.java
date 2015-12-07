package Vector;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 11/5/15.
 * author: zd
 */
public class StructJSONObject {
    public static void main(String[] args) throws ParseException {
        Map<String, Object> map = new HashMap<>();
        map.put("file_reg", "/var/log/maillog");
        map.put("is_multi_lines", false);
        map.put("timestamp_reg", "");
        map.put("charset", "utf-8");
        String str = JSONObject.toJSONString(map);
        System.out.println("str : " + str);
        System.out.println("map : " + map.toString());
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject)parser.parse(str);
        System.out.println(object.toString());
    }
}
