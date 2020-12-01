package 集合02Iterator迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainIterator {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        ((ArrayList<String>) coll).add("伊利丹");
        ((ArrayList<String>) coll).add("泰兰德");
        ((ArrayList<String>) coll).add("安度因");
        ((ArrayList<String>) coll).add("吉安娜");
        ((ArrayList<String>) coll).add("阿尔萨斯");
        ((ArrayList<String>) coll).add("瓦里安");

        System.out.println(coll);

        Iterator<String> it = coll.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}
