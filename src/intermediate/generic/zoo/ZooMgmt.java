package intermediate.generic.zoo;

public class ZooMgmt {

    public static void main(String[] args) {
        Enclosure<Penguin> penguinEnclosure = new Enclosure<>();
        penguinEnclosure.addMember(new Penguin("p1"));
        penguinEnclosure.addMember(new Penguin("p2"));
        penguinEnclosure.addMember(new Penguin("p3"));
        penguinEnclosure.addMember(new Penguin("p4"));

        Enclosure<Redpanda> redpandaEnclosure = new Enclosure<>();
        redpandaEnclosure.addMember(new Redpanda("r1"));
        redpandaEnclosure.addMember(new Redpanda("r2"));

        System.out.println();
        System.out.println("Penguin members");
        for (var p : penguinEnclosure.getAllNameOfMembers()) {
            System.out.println(p);
        }
        System.out.println();
        System.out.println("Redpanda members");
        for (var r : redpandaEnclosure.getAllNameOfMembers()) {
            System.out.println(r);
        }
    }
}
