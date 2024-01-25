package training.workshop.gamblingsiml;

import java.util.Random;
class stake {
    public int day_stake;
    public int game_stake;

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
    public int stake_amount;

    public void betprobability() {
        int stake_amount = 0;
        int i;
        int daytotalwin = 0;
        int daytotalloose = 0;
        Random random = new Random();
            daytotalloose = random.nextInt(2);
            if (daytotalloose == 1) {
                stake_amount -= 1;
                System.out.print("Stake Loose: "+ daytotalloose);
            } else {
                stake_amount += 1;
                System.out.println( " Total Win Stake :" + daytotalwin);
            }
        }

    public static void main(String[] args){
        GamblingSim ob = new GamblingSim();
        ob.betprobability();

    }
}
