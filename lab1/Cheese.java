public class Cheese extends Food {
    private String type;
    public static final String CHEDDAR = "Cheddar";
    public static final String MOZZARELLA = "Mozzarella";
    public static final String SWISS = "Swiss";

    public Cheese() {
        this.type = "Default";
    }

    public Cheese(String type) {
        this.type = type;
        this.name = "Cheese";
    }

    @Override
    public void consume() {
        System.out.println(type + " " + name + " has been eaten.");
    }
}