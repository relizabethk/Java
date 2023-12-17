public class Potatoes extends Food {
    private String type;
    public static final String FRIED = "Fried";
    public static final String BOILED = "Boiled";
    public static final String FRIES = "Fries";

    public Potatoes() {
        this.type = "Default";
    }

    public Potatoes(String type) {
        this.type = type;
        this.name = "Potatoes";
    }

    @Override
    public void consume() {
        System.out.println(type + " " + name + " has been eaten.");
    }
}