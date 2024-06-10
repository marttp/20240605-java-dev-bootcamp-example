package oop.solid.l.bad;

public class FreePlayer extends Player {

    public FreePlayer(String name) {
        super(name);
    }

    @Override
    public void viewBattleRoyal() {
        System.out.println("FreePlayer can view battle royal");
    }

    @Override
    public void joinBattleRoyal() {
        System.out.println("FreePlayer can not join battle royal");
    }

    @Override
    public void createBattleRoyal() {
        System.out.println("FreePlayer can not create battle royal");
    }
}
