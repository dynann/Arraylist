import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Integers, Enter 0 for exit: ");
        int integer;
        do {
            integer = enter();
            if (integer != 0 && checkDuplicate(integer, list)) {
                list.add(integer);
            }
        } while(integer != 0);

        System.out.println(list);
    }

    static int enter(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static boolean checkDuplicate(int integers, ArrayList<Integer> list){
        for(int element : list){
            if(integers == element) return false;
        }
        return true;
    }
}
