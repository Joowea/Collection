package 集合07HashCode;

public class Main110201 {

    public static void main(String[] args) {

        Person p1 = new Person();

        int i1 = p1.hashCode();

        int i2 = p1.hashCode();

        System.out.println("i1 = " + i1); //i1 = i2
        System.out.println("i2 = " + i2); //十进制

        System.out.println("p1 = " + p1); //十六进制

        Person p2 = new Person();

        int i3 = p2.hashCode();

        System.out.println("i3 = " + i3);

        System.out.println("p2 = " + p2);

        System.out.println("_______________");

        String s1 = "abc"; //String中重写了hashCode()方法

        String s2 = new String("abc");

        System.out.println(s1.hashCode()); //96354
        System.out.println(s2.hashCode()); //96354


    }
}
