package 集合10sort方法comparator比较器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main110302 {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();

        Collections.addAll(arr1, 1, 3, 5, 7, 2, 4, 6);

        Collections.sort(arr1, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                return o2 - o1; //降序 匿名接口实现类
            }
        });

        System.out.println(arr1);

        System.out.println("_________________________");

        ArrayList<Student> arrS = new ArrayList<>();

        Student s1 = new Student("T泰兰德", 1200);
        Student s2 = new Student("A伊利丹", 1200);
        Student s3 = new Student("A安度因", 25);
        Student s4 = new Student("J吉安娜", 35);

        Collections.addAll(arrS, s1, s2, s3, s4);

        System.out.println(arrS);

        Collections.sort(arrS, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {

                int result = o1.getAge() - o2.getAge();

                if (o1.getAge() == o2.getAge()) { //如果第一排序规则相等 采用第二排序规则

                    result = o1.getName().charAt(0) - o2.getName().charAt(0); //姓名首字母升序排列
                }
                return result;
            }
        });

//        Collections.sort(arrS, (o1, o2) -> {
//
//            int result = o1.getAge() - o2.getAge();
//
//            if (o1.getAge() == o2.getAge()) { //如果第一排序规则相等 采用第二排序规则
//
//                result = o1.getName().charAt(0) - o2.getName().charAt(0); //姓名首字母升序排列
//            }
//            return result;
//        });

        System.out.println(arrS);
    }
}
