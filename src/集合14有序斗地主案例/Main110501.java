package 集合14有序斗地主案例;

import java.util.*;

public class Main110501 {

    public static void main(String[] args) {

        //1. 准备poker
        HashMap<Integer, String> poker = new HashMap<>();
        List<Integer> pokerKeysList = new ArrayList<>();

        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        int iI = 2;

        poker.put(0, "big joker");
        poker.put(1, "little joker");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {

                poker.put(iI, colors[j] + numbers[i]);
                iI++;
            }
        }
        System.out.println(poker);

        //洗牌
        Set<Integer> pokerKeysSet = poker.keySet();

        Iterator<Integer> it = pokerKeysSet.iterator();

        while (it.hasNext()) {
            pokerKeysList.add(it.next());
        }

        Collections.shuffle(pokerKeysList);
        //System.out.println(pokerKeysList);

        //3.发牌

        ArrayList<Integer> diPai = new ArrayList<>();
        ArrayList<Integer> playerOne = new ArrayList<>();
        ArrayList<Integer> playerTwo = new ArrayList<>();
        ArrayList<Integer> playerThree = new ArrayList<>();

        for (int i = 0; i < pokerKeysList.size(); i++) {

            if (i <= 50) {
                switch (i % 3) {
                    case 0:
                        playerOne.add(pokerKeysList.get(i));
                        break;
                    case 1:
                        playerTwo.add(pokerKeysList.get(i));
                        break;
                    case 2:
                        playerThree.add(pokerKeysList.get(i));
                        break;
                }

            } else {
                diPai.add(pokerKeysList.get(i));
            }
        }

//        System.out.println(playerOne);
//        System.out.println(playerTwo);
//        System.out.println(playerThree);
//        System.out.println(diPai);

        Collections.sort(playerOne);
        Collections.sort(playerTwo);
        Collections.sort(playerThree);
        Collections.sort(diPai);

        //4.看牌

        System.out.println("王俊凯的手牌是："+kanPai(playerOne, poker));
        System.out.println("王源的手牌是："+kanPai(playerTwo, poker));
        System.out.println("易烊千玺的手牌是："+kanPai(playerThree, poker));
        System.out.println("底牌是："+kanPai(diPai, poker));


    }

    public static ArrayList<String> kanPai(List<Integer> playerList, HashMap<Integer, String> poker) {

        ArrayList<String> orderList = new ArrayList<>();

        for (int i = 0; i < playerList.size(); i++) {

            orderList.add(poker.get(playerList.get(i)));
        }

        return orderList;
    }
}
