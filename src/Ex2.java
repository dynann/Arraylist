import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ex2 {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1, 3)),
                        new ArrayList<>(Arrays.asList(5, 7)),
                        new ArrayList<>(Arrays.asList(9, 11))
                )
        );
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(2, 4)),
                        new ArrayList<>(Arrays.asList(6, 8)),
                        new ArrayList<>(Arrays.asList(10, 12, 14))
                )
        );

        ArrayList<ArrayList<Integer>> zippedList = new ArrayList<>();

        System.out.println(list1);
        System.out.println(list2);
        zippedList = zip(list1, list2);
        System.out.println(zippedList);

        }
    static ArrayList<ArrayList<Integer>> zip(ArrayList<ArrayList<Integer>> list1, ArrayList<ArrayList<Integer>> list2){
        ArrayList<ArrayList<Integer>> zippedList = new ArrayList<>();
        zippedList = list1;
        for(int i = 0 ; i < list1.size(); i++){
            for(int j = 0; j < list2.get(i).size(); j++){
                zippedList.get(i).add(list2.get(i).get(j));
            }
        }
        return zippedList;

    }
}
