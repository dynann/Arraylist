import java.util.*;

public class Ex13 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= 300; i++){
            if(i == 11){
                i = 100;
            } else if(i == 101){
                i = 200;
            } else if( i == 201){
                i = 300;
            }


            for(int j = 0; j < 4; j++){
                list.add(i);
            }
        }

        Collections.shuffle(list);

        int user = 0;
        int computer = 0;
        int turn = 0;
        int a = list.size() - 1;

        //dealing process
        while(turn < 2){
            computer += list.remove(a);
            a--;
            user += list.remove(a);
            a--;
            turn++;
        }


        if(computer == 8 || computer == 9 || user == 8 || user == 9 ){
            if( computer == 9 && user == 8){
                System.out.println("Computer Card: " + computer);
                System.out.println("Your Card: " + user);
                System.out.println("Computer Won");
            } else if (user == 9 && computer == 8) {
                System.out.println("Computer Card: " + computer);
                System.out.println("Your Card: " + user);
                System.out.println("You Won");
            } else if ( computer == user){
                System.out.println("Computer Card: " + computer);
                System.out.println("Your Card: " + user);
                System.out.println("Tied");
            }
        } else {

            int final_user = userDecision(list, user);
            int final_computer = computerDecision(list, computer);
        }

    }

    static int userDecision(ArrayList<Integer> list, int user){

        int point = user_pointCalculation(user);

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to pull?, (y/n) : ");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("y")){
            int pull = list.remove(0);
            user_pullSetting(pull);
            point += pull;
            point = user_pullCalculation(point, pull);
            return point;
        } else return point;

    }

    //computer decision
    static int computerDecision(ArrayList<Integer> list, int computer){

        Random rand = new Random();

        int point = com_pointCalculation(computer);
        if(point < 4){
            int pull = list.remove(0);
            point += pull;
            point = com_pullCalculation(point, pull);
            return point;
        } else if ( point == 4){
            int chance = rand.nextInt(1, 11);
            if(chance <= 8){
                int pull = list.remove(0);
                point += pull;
                point = com_pullCalculation(point, pull);
                return point;
            }
        } else if(point == 5){
            int chance = rand.nextInt(1, 11);
            if(chance <= 4){
                int pull = list.remove(0);
                point += pull;
                point = com_pullCalculation(point, pull);
                return point;
            }
        } else if( point == 6){
            int chance = rand.nextInt(1, 11);
            if(chance == 1){
                int pull = list.remove(0);
                point += pull;
                point = com_pullCalculation(point, pull);
                return point;
            }
        }


        return point;
    }

    //Calculate point of user and computer
    static int user_pointCalculation(int user){

        if(user >= 10){

            if(user == 200){
                System.out.println("Your Card: JJ");
            } else if( user == 400){
                System.out.println("Your Card: QQ");
            } else if( user == 600){
                System.out.println("Your Card: KK");
            } else if( user == 300){
                System.out.println("Your Card: QJ");
            } else if( user == 400){
                System.out.println("Your Card: KJ");
            } else if( user == 500){
                System.out.println("Your Card: QK");
            }
            else {
                user = user % 10;
                System.out.println("Your Card: "+ user);
            }
        } else {
            System.out.println("Your Card: " + user);
        }

        return user;
    }

    static int user_pullCalculation(int user, int pull){

        if(user >= 10){

            if(user == 500){
                if( pull == 200){
                    System.out.println("Your Card: QJQ");
                } else if( pull == 300 || pull == 100){
                    System.out.println("Your Card: KJJ");
                }
            } else if( user == 400){
                System.out.println("Your Card: JJQ");
            } else if( user == 600){
                if(pull == 200){
                    System.out.println("Your Card: QQQ");
                } else {
                    System.out.println("Your Card: JKQ");
                }
            } else if( user == 300){
                System.out.println("Your Card: JJJ");
            } else if( user == 900){
                System.out.println("Your Card: KKK");
            } else if(user == 700){
                System.out.println("Your Card: KQQ");

            } else if(user == 800){
                System.out.println("Your Card: KKQ");
            } else if(user == 700){
                System.out.println("Your Card: KKJ");
            }

            else {
                user = user % 10;
                System.out.println("Your Card: "+ user);
            }
        } else {
            System.out.println("Your Card: " + user);
        }

        return user;

    }

    static void user_pullSetting(int pull){
        if(pull < 10){
            System.out.println("Your pull card is: " + pull);
        } else if ( pull == 100){
            System.out.println("Your pull card is J");
        } else if ( pull == 200){
            System.out.println("Your pull card is Q");
        } else if ( pull == 300){
            System.out.println("Your pull card is K");
        }
    }


    static int com_pointCalculation(int user){

        if(user >= 10){

            if(user == 200){
                System.out.println("Your Card: JJ");
            } else if( user == 400){
                System.out.println("Your Card: QQ");
            } else if( user == 600){
                System.out.println("Your Card: KK");
            } else if( user == 300){
                System.out.println("Your Card: QJ");
            } else if( user == 400){
                System.out.println("Your Card: KJ");
            } else if( user == 500){
                System.out.println("Your Card: QK");
            }
            else {
                user = user % 10;
                System.out.println("Your Card: "+ user);
            }
        } else {
            System.out.println("Your Card: " + user);
        }

        return user;
    }

    static int com_pullCalculation(int user, int pull){

        if(user >= 10){

            if(user == 500){
                if( pull == 200){
                    System.out.println("Computer Card: QJQ");
                } else if( pull == 300 || pull == 100){
                    System.out.println("Your Card: KJJ");
                }
            } else if( user == 400){
                System.out.println("Computer Card: JJQ");
            } else if( user == 600){
                if(pull == 200){
                    System.out.println("Computer Card: QQQ");
                } else {
                    System.out.println("Computer Card: JKQ");
                }
            } else if( user == 300){
                System.out.println("Computer Card: JJJ");
            } else if( user == 900){
                System.out.println("Computer Card: KKK");
            } else if(user == 700){
                System.out.println("Computer Card: KQQ");

            } else if(user == 800){
                System.out.println("Computer Card: KKQ");
            } else if(user == 700){
                System.out.println("Computer Card: KKJ");
            }

            else {
                user = user % 10;
                System.out.println("Computer Card: "+ user);
            }
        } else {
            System.out.println("Computer Card: " + user);
        }

        return user;

    }

    static void com_pullSetting(int pull){
        if(pull < 10){
            System.out.println("Computer pull card is: " + pull);
        } else if ( pull == 100){
            System.out.println("Computer pull card is J");
        } else if ( pull == 200){
            System.out.println("Computer pull card is Q");
        } else if ( pull == 300){
            System.out.println("Computer pull card is K");
        }
    }



    static void setWinner(int user, int computer){
    }

}
