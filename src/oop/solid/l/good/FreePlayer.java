package oop.solid.l.good;

public class FreePlayer extends Player {

    public FreePlayer(String name) {
        super(name);
    }

    @Override
    public void viewBattleRoyal() {
        System.out.println("FreePlayer can view battle royal");
    }
}
