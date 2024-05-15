import java.util.*;

public class Ex1 {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        inputList(arrayList);
        System.out.println(arrayList);
        rotateRight(arrayList);
        System.out.println(arrayList);

    }


    static void inputList(ArrayList<Integer> integer){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of Arraylist : ");
        int size = input.nextInt();
        System.out.println("Enter value : ");
        for(int i = 0 ; i < size; i++){
            int value = input.nextInt();
            integer.add(value);
        }

    }


    static void rotateRight(ArrayList<Integer> integer){

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        int front = integer.size()/2;
        int back = integer.size() - front;
        if(integer.size() % 2 != 0){
            back -= 1;
        }


        for(int i = 0 ; i < front; i++){
            queue.add(integer.get(i));
        }
        for(int i = back; i < integer.size(); i++){
            queue1.add(integer.get(i));
        }

        System.out.println(queue);
        System.out.println(queue1);


        if(integer.size() % 2 != 0){
            back += 1;
        }
        for(int i = 0 ; i < integer.size(); i++){


           if( i < back){
               int value = queue1.poll();
               integer.set(i, value);
           } else {
               int value = queue.poll();
               integer.set(i, value);
           }

        }
    }
}
