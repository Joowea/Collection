package 集合05List集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List集合 extends Collection接口
 * List集合特点1.有序 2.有索引 3.可重复
 * List集合特有方法：
 *   1. void add(int index, E element):将指定元素，添加到集合中的指定位置中
 *   2. E get(int index):返回集合中指定位置的元素
 *   3. E remove(int index):移出集合中指定位置元素，返回值为移出的元素
 *   4. E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值为更新前的元素
 *   */
public class Main110101 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");

        list.add(0, "a2"); //方法1

        System.out.println(list.get(1));

        list.remove(0); //方法2

        list.set(0, "A");

        Iterator<String> it = list.iterator(); //迭代器遍历

        while (it.hasNext()) {//遍历方法1 while + iterator

            System.out.println(it.next());
        }
        System.out.println("_____________________");

        for (String s : list) {//遍历方法2 foreach
            System.out.println(s);
        }
        System.out.println("_____________________");

        for (int i = 0; i < list.size(); i++) {//遍历方法3 for + 索引
            System.out.println(list.get(i));
        }

        System.out.println(list);

        //list.get(9); //IndexOutOfBoundsException 索引越界异常
    }
}
