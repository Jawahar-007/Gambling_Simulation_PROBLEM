package training.workshop.gamblingsiml;
class stake {
    public  int bet_start ;
    public  int lose_bet ;

    public stake(){
        bet_start = 100;
        lose_bet = 1;
    }

    @Override
    public String toString() {
        return "stake{" + "betstart=" + bet_start + ", lose bet=" + lose_bet + '}';
    }

    public static void main(String[] args) {
        stake ob = new stake();
        System.out.println(ob);
    }
}