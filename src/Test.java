import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        //adding 52 cards to deck
        ArrayList<Integer> list = new ArrayList<>();

        //add card to list method and shuffle
        User user = new User();
        User computer = new User();

        add_deck(list);
        dealing(list, user, computer);

        System.out.println("Note: 20 means J, 30 means Q and 40 is K");



        int point_user = user.points();
        int point_com = computer.points();

        if(point_com == 9){
            if( point_user != 9){
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("Computer Won!");
            } else {
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("Tied!");
            }

        } else if(point_com == 8){
            if(point_user != 8){
                if(point_user == 9){
                    System.out.println("Your Card: " + user.list + " = " + point_user);
                    System.out.println("Computer Card: " + computer.list + " = " + point_com );
                    System.out.println("You Won!");
                } else {
                    System.out.println("Your Card: " + user.list + " = " + point_user);
                    System.out.println("Computer Card: " + computer.list + " = " + point_com );
                    System.out.println("Computer Won!");
                }
            }

        } else if(point_user == 9){
            if(point_com != 9){
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("You Won!");
            }  else {
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("Tied!");
            }
        } else if(point_user == 8){
            if(point_com != 8){
                if(point_user == 9){
                    System.out.println("Your Card: " + user.list + " = " + point_user);
                    System.out.println("Computer Card: " + computer.list + " = " + point_com );
                    System.out.println("Computer Won!");
                } else {
                    System.out.println("Your Card: " + user.list + " = " + point_user);
                    System.out.println("Computer Card: " + computer.list + " = " + point_com );
                    System.out.println("You Won!");
                }
            } else {
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("Tied!");
            }

        } else if (point_com == point_user && (point_user == 8 || point_user == 9)){
            System.out.println("Your Card: " + user.list + " = " + point_user);
            System.out.println("Computer Card: " + computer.list + " = " + point_com );
            System.out.println("Tied!");
        } else {

            System.out.println("Your Card: " + user.list + " = " + point_user);
            System.out.println("Do you want to pull (y/n): ");
            Scanner input = new Scanner(System.in);
            String pull = input.nextLine();
            if(pull.equalsIgnoreCase("y")){
                point_user = user.pull(list);
            }



            Random rand = new Random();


            if(point_com <= 6){
                if(point_com < 4){
                    point_com = computer.pull(list);
                } else if( point_com == 4){
                    int chance = rand.nextInt(1, 11);
                    if(chance <= 8){
                        point_com = computer.pull(list);
                    }
                } else if( point_com == 5){
                    int chance = rand.nextInt(1, 11);
                    if(chance <= 4){
                        point_com = computer.pull(list);
                    }
                } else if( point_com == 6){
                    int chance = rand.nextInt(1, 11);
                    if(chance == 10){
                        point_com = computer.pull(list);
                    }
                }
            }


            if(point_com > point_user){
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("Computer Won!");
            } else if  ( point_user > point_com){
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("User Won!");
            } else if ( point_com >= 60){
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("Computer Won!");
            } else if(point_user >= 60){
                System.out.println("Your Card: " + user.list + " = " + point_user);
                System.out.println("Computer Card: " + computer.list + " = " + point_com );
                System.out.println("User Won!");
            }



        }







    }


    //method for adding deck
    static void add_deck(ArrayList<Integer> list){
        for(int i = 1 ; i <= 30; i++){

            if(i == 11){
                i = 20;
            } else if(i == 21){
                i = 30;
            } else if( i == 31){
                i = 40;
            }
            for(int j = 0; j < 4; j++){
                list.add(i);
            }
        }

        Collections.shuffle(list);
    }

    //method for dealing card
    static void dealing(ArrayList<Integer> list, User user, User computer){
        int turn = 0;
        int index = list.size() - 1;
        while(turn < 2){
            computer.list.add(list.remove(index));
            index--;
            user.list.add(list.remove(index));
            index--;
            turn++;
        }

    }


    static void check_boom(){}

}
