package 集合09Collections工具类sort方法;


import java.util.ArrayList;
import java.util.Collections;

public class Main110301 {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();

        Collections.addAll(arr1, 1, 2, 3, 0, 9, 8, 7, 6, 4, 5);

        System.out.println(arr1);

        Collections.sort(arr1);

        System.out.println(arr1);

        System.out.println("_________________________");

        ArrayList<String> arr2 = new ArrayList<>();

        Collections.addAll(arr2, "a", "c", "e", "g", "b", "d", "f", "h");

        System.out.println(arr2);

        Collections.sort(arr2);

        System.out.println(arr2);

        System.out.println("_________________________");

        Person p1 = new Person("伊利丹",1200);
        Person p2 = new Person("泰兰德",1199);
        Person p3 = new Person("安度因",20);
        Person p4 = new Person("吉安娜",35);

        ArrayList<Person> arrP = new ArrayList<>();

        Collections.addAll(arrP,p1,p2,p3,p4);

        System.out.println(arrP);

        Collections.sort(arrP);

        System.out.println(arrP);
    }
}
