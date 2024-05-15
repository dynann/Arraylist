import java.util.ArrayList;
import java.util.Arrays;

public class second {
    public static void main(String[] args){

        // 2 dimensional arraylist
        ArrayList<ArrayList<Character>> arrayList = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList('a', 'b')),
                        new ArrayList<>(Arrays.asList('c', 'd' )),
                        new ArrayList<>(Arrays.asList('e', 'f'))
                )
        );

        System.out.println(arrayList);

        ArrayList<ArrayList<Integer>> integer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        ArrayList<Integer> inner1 = new ArrayList<>();
        inner.add(1);
        inner.add(2);
        inner.add(3);
        inner1.add(1);
        inner1.add(2);
        inner1.add(3);
        inner1.add(4);
        integer.add(inner);
        integer.add(inner1);
        System.out.println(integer);

        // iterate through 2d arraylist
        for(int i = 0 ; i < integer.size(); i++){
            for(int j = 0 ; j < integer.get(i).size(); j++){
                System.out.printf("%-3d", integer.get(i).get(j));
            }
            System.out.println();
        }

        // another way using foreach

        for(ArrayList<Integer> list : integer){
            for(int element: list){
                System.out.printf("%-3d", element);
            }
            System.out.println();
        }


    }
}
