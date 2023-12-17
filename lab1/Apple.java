public class Apple extends Food {
    private String variety;
    public static final String RED = "Red";
    public static final String GREEN = "Green";
    public static final String YELLOW = "Yellow";

    public Apple() {
        this.variety = "Default";
    }

    public Apple(String variety) {
        this.variety = variety;
        this.name = "Apple";
    }

    @Override
    public void consume() {
        System.out.println(variety + " " + name + " has been eaten.");
    }
}