package oop.solid.l.bad;

public abstract class Player {

    private final String name;

    protected Player(String name) {
        this.name = name;
    }

    // Based on this declaration
    // You expect all player can do all of these behaviors
    public abstract void viewBattleRoyal();
    public abstract void joinBattleRoyal();
    public abstract void createBattleRoyal();
}
