package 集合08HashSet存储自定义类型元素;

/*
 * HashSet 存储自定义类型元素
 *
 * set集合元素唯一： 元素类必须重写hashCode()和equals()方法
 *
 * 保证同名 同年龄的人 视为同一个人 只能存储一次*/

import java.util.HashSet;

public class Main110202 {

    public static void main(String[] args) {

        Person person1 = new Person("亚索", 25);
        Person person2 = new Person("亚索", 25);
        Person person3 = new Person("亚索", 26);
        Person person4 = new Person("亚索", 27);

        HashSet<Person> set = new HashSet<>();

        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);

        System.out.println(person1 == person2);  //重写前后 p1p2对象地址均不同 与两方法无关
        System.out.println(person1.equals(person2));  //重写equals前比较地址值 不同  重写后比较内容 相同

        System.out.println(person1.hashCode());  //重写hashCode前 p2p1不同  重写后相同 在set中存储于同一数组元素下
        System.out.println(person2.hashCode());

        System.out.println(set);

        /*未重写hashCode()和equals()方法
         *false //==
         *false //eq
         *356573597
         *1735600054
         *[Person{name='亚索', age=25}, Person{name='亚索', age=27}, Person{name='亚索', age=25}, Person{name='亚索', age=26}]
         * */

        /*重写
         *false //=
         *true  //eq
         *20331282
         *20331282
         *[Person{name='亚索', age=27}, Person{name='亚索', age=25}, Person{name='亚索', age=26}]*/


    }
}
