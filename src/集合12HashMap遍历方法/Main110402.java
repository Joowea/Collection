package 集合12HashMap遍历方法;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main110402 {
    public static void main(String[] args) {

        HashMap<String, Integer> hm2 = new HashMap<>();

        hm2.put("伊利丹", 188);
        hm2.put("泰兰德", 178);
        hm2.put("吉安娜", 168);
        hm2.put("安度因", 175);

        //System.out.println(hm2);

        Set<String> hm2KSet = hm2.keySet();

        //System.out.println(hm2KSet);

        //第一种遍历方法
        Iterator<String> it = hm2KSet.iterator();

        while (it.hasNext()) {
            String next = it.next();

            System.out.println(next + "的身高为：" + hm2.get(next));
        }
        
        //第二种遍历方法
        Set<Map.Entry<String, Integer>> hm2EnSet = hm2.entrySet();

        //System.out.println(hm2EnSet);

        for (Map.Entry<String, Integer> stringIntegerEntry : hm2EnSet) {
            System.out.println(stringIntegerEntry.getKey()+"的身高2为："+stringIntegerEntry.getValue());
        }
    }
}
