package 集合01Collection公用方法;
/*
 * Collection接口七个通用方法
 * 1.boolean add(E e); 2.void clear(); 3.boolean remove(E e); 4.boolean contains(E e)
 * 5.boolean isEmpty(); 6.int size(); 7.Object[] toArray(); */

import java.util.ArrayList;
import java.util.Collection;

public class MainCollection {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        coll.add("伊利丹·怒风");
        coll.add("泰兰德·羽风");
        coll.add("安度因·乌瑞恩");
        coll.add("吉安娜·普罗德摩尔");
        coll.add("吉恩·麦格莱恩");
        coll.add("麦格·尼铜须");
        coll.add("布莱恩·尼铜须");

        if(coll.contains("布莱恩·尼铜须")){
            coll.remove("布莱恩·尼铜须");
        }
        coll.toArray();
        System.out.println(coll);
    }
}
