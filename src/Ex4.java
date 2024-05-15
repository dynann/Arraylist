import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(5);

        System.out.println("Before remove : ");
        System.out.println(list);
        removeInt(1, list);
        System.out.println("After remove:");
        System.out.println(list);
    }

    static void removeInt(int integer, ArrayList<Integer> list){
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i) == integer){
                list.remove(i);
            }
        }
    }
}
