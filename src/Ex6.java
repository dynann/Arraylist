import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 10; i++){
            Random rand = new Random();
            int element = rand.nextInt(10) + 1;
            list.add(element);
        }


        Queue<Integer> missing;
        missing = findMissing(list);
        System.out.println(list);
        System.out.println("The missing number(s) is/are: " + missing);
    }

    static Queue<Integer> findMissing(ArrayList<Integer> list){
        Queue<Integer> missing = new LinkedList<>();
        for(int i = 1 ; i <= 10; i++){
            int j;
            for( j = 0; j < 10 ; j++){
                if(i == list.get(j)){
                    break;
                }
            }

            if(j == 10){
                missing.add(i);
            }
        }
        return missing;
    }
}
