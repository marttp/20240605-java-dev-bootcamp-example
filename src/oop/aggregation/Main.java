package oop.aggregation;

public class Main {

    public static void main(String[] args) {
        Racket racket = new Racket("DDD", 3.2);
        TennisPlayer player = new TennisPlayer("Mart", racket);
        System.out.println(STR."\{player.getName()} has a \{racket}");
    }
}
