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
        numOfDays = 20;
    }

    @Override
    public String toString() {
        return "stake{" + "Day_Stake =" + "Game_Stake = " + game_stake + '}';
    }

    public void betprobability() {
        int stake_amount;
        int i;
        int Max_Profit = 0;
        int Max_Loose = 0;
        int day_max_profit = 0;
        int day_max_loose = 0;
        int prob_win_loss;
        Random random = new Random();

        for (i = 1; i <= numOfDays; i++) {
            prob_win_loss = random.nextInt(2);
            stake_amount = random.nextInt(day_stake);
            if (prob_win_loss == 1) {
                if (Max_Profit < stake_amount) {
                    Max_Profit = stake_amount;
                    day_max_profit = i;
                }
            } else {
                if (Max_Loose < stake_amount) {
                    Max_Loose = stake_amount;
                    day_max_loose = i;
                }
            }
        }
        System.out.println("Maximum Profit of " + Max_Profit + " On Day: " + day_max_profit);
        System.out.println("Maximum Loss of " + Max_Loose + " On Day: " + day_max_loose);
    }
}