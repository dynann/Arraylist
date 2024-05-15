import java.lang.reflect.Array;
import java.util.ArrayList;

public class Computer {

    public ArrayList<Integer> list;
    public String computer;

    Computer(){
        list = new ArrayList<>();
        computer = "Computer";
    }


    public int points(){
        return point_calculation();
    }



    public int pull(ArrayList<Integer> list1){
        int point = list.get(0) + list.get(1);
        int pull_point = list1.remove(0);
        list.add(pull_point);
        if(pull_point < 10){
            point += pull_point;
        }
        return pull_calculation(point);
    }


    private int point_calculation(){
        int point = list.get(0) + list.get(1);
        if(point < 10){
            return point;
        } else {
            if(point % 10 != 0){
                return point % 10;
            } else return point;
        }
    }

    private int pull_calculation(int point){
        if(point < 10){
            return point;
        } else {
            if(point % 10 != 0){
                return point % 10;
            } else return point;
        }
    }


}
