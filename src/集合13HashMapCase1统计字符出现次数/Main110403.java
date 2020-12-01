package 集合13HashMapCase1统计字符出现次数;

//用户输入字符串 计算字符串中每个字符出现的次数

//1.使用Scanner获取用户输入字符串
//2.创建Map集合 key为字符 value为个数
//3.遍历字符串 获取每一个字符
//4.使用获取的字符 去Map判断key是否存在
//      若存在 通过key获取value；value++； put(key, value)
//      若不存在 put(key,1)
//5.遍历Map输出结果

import java.util.*;

public class Main110403 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入需要计算的字符串：");

        String str = sc.next();

        HashMap<Character, Integer> stringNum = new HashMap<>();

        for (char c:str.toCharArray()) {

            if(stringNum.containsKey(c)){
                Integer value = stringNum.get(c);
                value++;
                stringNum.put(c,value);
            }else {
                stringNum.put(c,1);
            }
        }

        System.out.println("您输入的字符串是："+ str+"，其中包含：");

        Set<Map.Entry<Character, Integer>> entStr = stringNum.entrySet();

//        Iterator<Map.Entry<Character, Integer>> it = entStr.iterator();
//
//        while(it.hasNext()){
//
//            Map.Entry<Character, Integer> next = it.next();
//
//            System.out.println("元素["+next.getKey()+"]的个数为："+next.getValue());
//        }

        System.out.println("________________");

        for (Map.Entry<Character, Integer> key: entStr) {

            System.out.println("元素["+key+"]的个数为："+key.getValue());
        }


    }
}
