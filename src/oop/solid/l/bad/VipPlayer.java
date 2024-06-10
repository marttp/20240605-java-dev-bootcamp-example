package oop.solid.l.bad;

public class VipPlayer extends Player {

    public VipPlayer(String name) {
        super(name);
    }

    @Override
    public void viewBattleRoyal() {
        System.out.println("VipPlayer can view battle royal");
    }

    @Override
    public void joinBattleRoyal() {
        System.out.println("VipPlayer can join battle royal");
    }

    @Override
    public void createBattleRoyal() {
        System.out.println("VipPlayer can create battle royal");
    }
}
