import java.util.LinkedList;

public class Vector {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();


        list.add(1);   // add integer to link list
        list.addFirst(3); //add integer to the head of list
        list.addLast(4); //add integer to the tail of list
        System.out.println(list);
        list.clear(); // remove all the integer form the list
        System.out.println(list);
        System.out.println(list.get(0));



        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);

        int a = list.getFirst(); //return the first element of list
        int b = list.getLast(); //return the last element of the list


        //retrieve but not remove the first element from the list
        //return null if empty
        System.out.println(list.peekFirst());

        //retrieve but not remove the last element from the list
        //return null if empty
        System.out.println(list.peekLast());


        //check if list contains specific number
        if(list.contains(1)){
            System.out.println("list has 1");
        }


    }
}
