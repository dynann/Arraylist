import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args){
        ArrayList<ArrayList<Float>> list = new ArrayList<>();
        Random rand = new Random();
        for(int row = 0; row < 3; row++){
            ArrayList<Float> subList =  new ArrayList<>();
            for(int column = 0 ; column < 4; column++){

                float value = 100.00f + rand.nextFloat() * (200.99f - 100.00f);
                subList.add(value);
            }
            list.add(subList);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        locateSmallest(list);
    }

    static ArrayList<Integer> locateSmallest(ArrayList<ArrayList<Float>> list){
        ArrayList<Float> smallList = new ArrayList<>();
        int[] smallValue = new int[3];
        for (int i = 0; i < list.size(); i++) {
            float smallest = list.get(i).get(0); // Initialize smallest with the first element
            for (int j = 1; j < list.get(i).size(); j++) {
                float current = list.get(i).get(j);
                if (current < smallest) {
                    smallest = current; // Update smallest if a smaller value is found


                }
            }
            smallList.add(smallest);

        }

        float small = smallList.get(0);
        for(int i = 0 ; i < smallList.size(); i++){
            if(smallList.get(i) < small){
                small = smallList.get(i);
            }
        }

        ArrayList<Integer> index = new ArrayList<>();

        for(int j = 0 ; j < list.size(); j++){
            for(int k = 0 ; k < list.get(j).size(); k++){
                if(small == list.get(j).get(k)){
                    index.add(j + 1);
                    index.add(k + 1);
                }
            }
        }
        System.out.println(small);
        System.out.println(smallList);
        System.out.println(index);

        return index;
    }
}
