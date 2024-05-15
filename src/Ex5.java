import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the name of three people : ");
        int time = 0;
        boolean check = true;
        do {

            while(time < 3){
                list.add(input());
                time++;
            }

            if (time >= 3){
                check = answer();
                if(check){
                    list.add(input());
                }
            }

        } while (check);

        System.out.println(list);

    }

    static String input(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    static boolean answer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to invite another person Yes/No: ");
        String response = input.nextLine();
        input.close();
        if(response.equalsIgnoreCase("No")){
            return false;
        }
        else if(response.equalsIgnoreCase("Yes")){
            return true;
        }
        return false;
    }
}
