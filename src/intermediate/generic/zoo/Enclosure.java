package intermediate.generic.zoo;

import java.util.ArrayList;
import java.util.List;

public class Enclosure<T extends Animal> {

    private List<T> members;

    public Enclosure() {
        this.members = new ArrayList<>(10);
    }

    public void addMember(T member) {
        this.members.add(member);
    }

    public List<String> getAllNameOfMembers() {
        List<String> result = new ArrayList<>();
        for (var m : members) {
            result.add(m.getName());
        }
        return result;
    }
}
