package intermediate.generic.zoo;

public class Redpanda implements Animal {

    private String name;

    public Redpanda(String name) {
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
