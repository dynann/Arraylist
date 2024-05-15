import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Integers, and enter 0 to ends : ");
        int a = 0;
        do {
            a = input();
            if(a != 0){
                list.add(a);
            }
        } while(a != 0);

        int maxi = max(list);
        System.out.println("Largest Number is: " + maxi);

    }

    public static int input(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static int sort(ArrayList<Integer> list){

        ArrayList<Integer> unsortedList = new ArrayList<>();
        unsortedList = list;

        int last_index = 0;
        for(int i = 0 ; i < unsortedList.size(); i++){
            int temp = unsortedList.get(i);
            int j = i - 1;
            while(j >= 0 && unsortedList.get(j) > temp){
                unsortedList.set(j + 1, unsortedList.get(j));
                j--;
            }
            unsortedList.set(j + 1, temp);
            last_index = i;
        }

        System.out.println(unsortedList);
        return unsortedList.get(last_index);
    }

    public static Integer max(ArrayList<Integer> list){
        return sort(list);
    }
}
