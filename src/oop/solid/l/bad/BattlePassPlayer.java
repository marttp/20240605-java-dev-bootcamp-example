package oop.solid.l.bad;

public class BattlePassPlayer  extends Player {

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

    @Override
    public void createBattleRoyal() {
        System.out.println("BattlePassPlayer can not create battle royal");
    }
}
