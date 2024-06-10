package oop.solid.l;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
         * Liskov's Substitution Principle (LSP)
         * Derived types must be completely substitutable for their base types.
         * Objects of subclasses must behave in the same way as the objects of superclasses.
         * */

        // BAD

//        List<oop.solid.l.bad.Player> players = List.of(
//                new oop.solid.l.bad.FreePlayer("Mart Free"),
//                new oop.solid.l.bad.BattlePassPlayer("Mart BattlePass"),
//                new oop.solid.l.bad.VipPlayer("Mart VIP")
//        );
//
//        for (oop.solid.l.bad.Player p : players) {
//            p.joinBattleRoyal();
//        }

        // GOOD
        List<oop.solid.l.good.ViewBattleRoyal> playersWhoCanView = List.of(
                new oop.solid.l.good.FreePlayer("Mart Free"),
                new oop.solid.l.good.BattlePassPlayer("Mart BattlePass"),
                new oop.solid.l.good.VipPlayer("Mart VIP")
        );
        // Only accept view behavior elements
        for (oop.solid.l.good.ViewBattleRoyal p : playersWhoCanView) {
            p.viewBattleRoyal();
        }

        List<oop.solid.l.good.JoinBattleRoyal> playersWhoCanJoin = List.of(
                new oop.solid.l.good.BattlePassPlayer("Mart BattlePass"),
                new oop.solid.l.good.VipPlayer("Mart VIP")
        );
        // Only accept join behavior elements
        for (oop.solid.l.good.JoinBattleRoyal p : playersWhoCanJoin) {
            p.joinBattleRoyal();
        }

        List<oop.solid.l.good.CreateBattleRoyal> playersWhoCanCreate = List.of(
                new oop.solid.l.good.VipPlayer("Mart VIP")
        );
        // Only accept create behavior elements
        for (oop.solid.l.good.CreateBattleRoyal p : playersWhoCanCreate) {
            p.createBattleRoyal();
        }
    }
}
