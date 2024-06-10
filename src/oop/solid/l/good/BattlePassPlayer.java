package oop.solid.l.good;

public class BattlePassPlayer extends Player implements JoinBattleRoyal {

    public BattlePassPlayer(String name) {
        super(name);
    }

    @Override
    public void viewBattleRoyal() {
        System.out.println("BattlePassPlayer can view battle royal");
    }

    @Override
    public void joinBattleRoyal() {
        System.out.println("BattlePassPlayer can join battle royal");
    }
}
