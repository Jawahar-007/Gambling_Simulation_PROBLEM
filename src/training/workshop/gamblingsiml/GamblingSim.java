package training.workshop.gamblingsiml;

import java.sql.SQLOutput;
import java.util.Random;
class stake {
    public int day_stake;
    public int game_stake;
    public int numOfDays;
    public int stake_amount;

    public stake() {
        day_stake = 100;
        game_stake = 1;
    }

    @Override
    public String toString() {
        return "stake{" + "Day_Stake =" +"Game_Stake = " + game_stake + '}';
    }
}

    public class GamblingSim {


    public void betprobability() {
        int stake_amount = 0;
        int i;
        int daytotalwin = 0;
        int daytotalloose = 0;
        Random random = new Random();
        daytotalloose = random.nextInt(2);
            for (i = 1; i <= 100; i++) {
                if (daytotalwin == 1) {
                    stake_amount += 1;
                    System.out.print("Stake Win: " + daytotalwin);
                } else {
                    stake_amount += 1;
                    System.out.println(" Total Stake Loss:" + daytotalloose);
                }
            }
         if(stake_amount >= 50)
            System.out.println("Won 50% Stake!!Satisfied ! Leave");
         else
            System.out.println("Lost 50%!!Dissatisfied!Leaving");
        }

    public static void main(String[] args){
        GamblingSim ob = new GamblingSim();
        ob.betprobability();
    }
}
