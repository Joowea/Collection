package 集合06Set接口集合HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main110102 {

    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            hs.add(i);
        }

        hs.add(111);
        hs.add(111111);
        hs.add(1111);
        hs.add(112);

        System.out.println(hs);
    }
}
