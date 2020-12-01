package 集合04CaseDouDiZhu;

/*1.准备牌：
    使用一个集合poker 准备存储54张扑克牌
    创建一个数组 存放大小王
    创建一个数组 存放四种花色
    创建一个数组 存放13个数字
    嵌套循环 存入54张牌

  2.洗牌
    collections 方法打乱顺序

  3.发牌
    创建三个集合 存储三个玩家的牌
    创建一个集合 存储剩下的三章底牌

    发牌逻辑：if(序号<51){switch 序号%3  1:玩家1.add()  2:玩家2.add()  3:玩家3.add()}

  4.看牌
    直接打印集合
*
* */

import java.util.ArrayList;
import java.util.Collections;

public class MainDouDiZhu {
    public static void main(String[] args) {

        //1. 准备牌
        ArrayList<String> poker = new ArrayList<>(); //存放54张poker牌

        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        poker.add("big joker");
        poker.add("little joker");

        for (String number :
                numbers) {
            for (String color :
                    colors) {
                //System.out.println(color+number);
                poker.add(color + number);
            }
        }

        //2. 洗牌
        Collections.shuffle(poker);
        //System.out.println(poker);

        //3. 发牌
        ArrayList<String> playerOne = new ArrayList<>();
        ArrayList<String> playerTwo = new ArrayList<>();
        ArrayList<String> playerThree = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {

//            if (i <= 50) {
//                switch (i % 3) {
//                    case 0:
//                        playerOne.add(poker.get(i));
//                        break;
//                    case 1:
//                        playerTwo.add(poker.get(i));
//                        break;
//                    case 2:
//                        playerThree.add(poker.get(i));
//                        break;
//                }
//            } else {
//                diPai.add(poker.get(i));
//            }  //代码重复 注释掉
        }

        //4. 看牌
        System.out.println("王俊凯的牌是："+playerOne);
        System.out.println("易烊千玺的牌是："+playerTwo);
        System.out.println("王源的牌是："+playerThree);
        System.out.println("底牌是："+diPai);
    }


}
