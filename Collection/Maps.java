package Collection;
import java.util.HashMap;
import  java.util.Map;
public class Maps {
    public static void main(String[] args) {
        Map<String , String> Land=new HashMap<>();
    // ein key muss eindeutig sein.
        Land.put("DE","DEUTSCHLAND");
        Land.put("JPN","JAPAN");
        Land.put("KAN","KANADA");
        System.out.println(Land.get("JPN"));
        System.out.println("***********  KEYS  *****");
        for (String key:
                Land.keySet()) {
            System.out.println(key);

        }
        System.out.println("*******    LÄNDER  *********");
        for (String value:
                Land.values()) {
            System.out.println(value);

        }
    }
}
