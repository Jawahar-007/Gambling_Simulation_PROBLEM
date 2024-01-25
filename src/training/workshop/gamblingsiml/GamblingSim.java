package training.workshop.gamblingsiml;

import java.sql.SQLOutput;
import java.util.Random;
class GamblingSim {
    public int day_stake;
    public int game_stake;
    public int numOfDays;
    public int stake_amount;

    public GamblingSim() {
        day_stake = 100;
        game_stake = 1;
    }

    @Override
    public String toString() {
        return "stake{" + "Day_Stake =" +"Game_Stake = " + game_stake + '}';
    }

    public void betprobability() {
        int stake_amount = 0;
        int i;
        int daytotalwin = 0;
        int daytotalloose = 0;
        int betcheck;
        Random random = new Random();

        for (i = 1; i <= 100; i++) {
            betcheck = random.nextInt(2);
            if (betcheck == 1) {
                stake_amount += 1;
                daytotalwin ++;
                System.out.print("Stake Win: "+stake_amount+"DAY WIN " + daytotalwin);
                if (daytotalwin == 50) {
                    System.out.println("Resigning with win");
                    break;
                }
            } else {
                stake_amount += 1;
                daytotalloose++;
                System.out.println(" Total Stake Loss:" + daytotalloose);
                if (daytotalloose == 50) {
                    System.out.println("Lost 50%!!Dissatisfied!Leaving");
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        GamblingSim ob = new GamblingSim();
        ob.betprobability();
    }
}
