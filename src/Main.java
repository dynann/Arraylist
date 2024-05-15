import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Character> charac = new ArrayList<>();

        System.out.println(charac);
        charac = chars(charac);
        System.out.println(charac);


        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);

        print(arrayList);

        System.out.println(arrayList);

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add(0, "Hello");
        stringList.add(1, "My");
        stringList.add(2, "is");
        stringList.add(3, "java");
        System.out.println(stringList);



    }

    static ArrayList<Character> chars(ArrayList<Character> rec){

        rec.add('s');
        rec.add('a');
        rec.add('d');

        if(rec.contains('a')){
            rec.remove(rec.indexOf('a'));
        }

        return rec;
    }


    static void print(ArrayList<Integer> list){
        list.add(39);
        System.out.println(list);

        if(list.contains(39)){
            list.remove(list.indexOf(39));
        }
    }
}