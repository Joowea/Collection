package 集合03增强for循环;
import java.util.ArrayList;
import java.util.Collection;

public class MainForEach {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        ((ArrayList<String>) coll).add("伊利丹");
        ((ArrayList<String>) coll).add("泰兰德");
        ((ArrayList<String>) coll).add("安度因");
        ((ArrayList<String>) coll).add("吉安娜");
        ((ArrayList<String>) coll).add("阿尔萨斯");
        ((ArrayList<String>) coll).add("瓦里安");

        System.out.println(coll);

        for (String s:coll) {
            System.out.println(s);
        }
    }
}
