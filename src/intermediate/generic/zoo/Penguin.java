package intermediate.generic.zoo;

public class Penguin implements Animal {

    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
