package Comparator;

import java.util.Comparator;

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player first, Player second) {
//        if(second.score>first.score) {
//            return 1;
//        }
//        else if(second.score<first.score) {
//            return -1;
//        }else {
//            return first.name.compareTo(second.name);
//        }
        //второе решение
        if(first.score==second.score) {
            return first.name.compareTo(second.name);
        } else {
            return second.score - first.score;
        }
    }
}
