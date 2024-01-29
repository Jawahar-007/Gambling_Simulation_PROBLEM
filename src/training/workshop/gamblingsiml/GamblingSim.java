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
        return "stake{" + "Day_Stake =" +"Game_Stake = " + game_stake + '}';
    }

    public void betprobability() {
        int stake_amount ;
        int i;
        int totalwin = 0;
        int totalloose = 0;
        int prob_win_loss;
        Random random = new Random();

        for (i = 1; i <=numOfDays; i++) {
            prob_win_loss = random.nextInt(2);
            stake_amount = random.nextInt(day_stake);
            if (prob_win_loss == 1)
                totalwin += stake_amount;
            else
                totalloose += stake_amount;
            }
        int Total_amount = (totalwin-totalloose);
        if(Total_amount > 0)
            System.out.println("The Total Profit is " + Total_amount);

        else
            System.out.println("The Total Loss is " + Total_amount);
        }
    }
