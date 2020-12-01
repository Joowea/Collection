package 集合11HashMap常用方法;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;

public class Main110401 {

    public static void main(String[] args) {

        HashMap<String, Integer> hm1 = new HashMap<>();

        //常用方法1 put
        hm1.put("伊利丹", 188);
        hm1.put("泰兰德", 178);
        Integer puJiAnnA = hm1.put("吉安娜", 168);

        System.out.println(hm1);

        System.out.println(puJiAnnA);

        System.out.println("________________");

        //常用方法2 remove
        Integer ReJiAnNa = hm1.remove("吉安娜");

        System.out.println(hm1);

        System.out.println(ReJiAnNa);

        System.out.println("________________");

        //常用方法3
        Integer GeYiLiDan = hm1.get("伊利丹");

        System.out.println(hm1);

        System.out.println(GeYiLiDan);

        System.out.println("________________");

        //常用方法4
        boolean ConTaiLanDe = hm1.containsKey("泰兰德");
        boolean ConJiAnNa = hm1.containsKey("吉安娜");

        boolean Con188 = hm1.containsValue(188);
        boolean Con186 = hm1.containsValue(186);

        System.out.println(hm1);

        System.out.println(ConTaiLanDe);
        System.out.println(ConJiAnNa);
        System.out.println(Con188);
        System.out.println(Con186);

        System.out.println("________________");
    }
}
