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
        int total_amt;
        int day_max_profit = 0;
        int day_max_loose = 0;
        int prob_win_loss;
        Random random = new Random();

        for (i = 1; i <= numOfDays; i++) {
            prob_win_loss = random.nextInt(2);
            stake_amount = random.nextInt(day_stake);
            if (prob_win_loss == 1)
                day_max_profit += stake_amount;
            else
                day_max_loose += stake_amount;
            total_amt = day_max_profit - day_max_loose;
            if (day_max_profit > day_max_loose)
                System.out.println("Maximum Profit " + day_max_profit + " $ You can Continue next month");
            else
                System.out.println("Maximum Loss of " + day_max_loose + " $ Stop Gambling");
        }
    }
}