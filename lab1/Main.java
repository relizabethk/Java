import java.util.Scanner;

//Potatoes/Fried Cheese/Cheddar Apple/Red

public class Main {

    public static int countFoodType(Food[] food, String targetTypeName) {
    
        Food targetFood;
        switch (targetTypeName) {
            case "Potatoes":
                targetFood = new Potatoes();
                break;
            case "Cheese":
                targetFood = new Cheese();
                break;
            case "Apple":
                targetFood = new Apple();
                break;
            default:
                throw new IllegalArgumentException("Unknown food type: " + targetTypeName);
        }
    
        int count = 0;
        for (Food f : food) {
            if (f != null && f.equals(targetFood)) {
                count++;
            }
        }
        return count;
    }
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input breakfast:");
        try{
            Food[] food = new Food[12];
            String buff = scan.nextLine();
            String[] input = buff.split(" ");
            int itemSoFar = 0;
            for(String arg : input){
                String[] parts = arg.split("/");
                    if(parts[0].equals("Potatoes")){
                        if(parts[1].equals("Fried"))
                        food[itemSoFar] = new Potatoes(Potatoes.FRIED);
                    else if(parts[1].equals("Boiled"))
                        food[itemSoFar] = new Potatoes(Potatoes.BOILED);
                    else 
                        food[itemSoFar] = new Potatoes(Potatoes.FRIES);
                    itemSoFar++;
                }
                else if(parts[0].equals("Cheese")){
                    if(parts[1].equals("Cheddar"))
                        food[itemSoFar] = new Cheese(Cheese.CHEDDAR);
                    else if(parts[1].equals("Mozzarella"))
                        food[itemSoFar] = new Cheese(Cheese.MOZZARELLA);
                    else 
                        food[itemSoFar] = new Cheese(Cheese.SWISS);
                    itemSoFar++;
                }
                else if(parts[0].equals("Apple")){
                    if(parts[1].equals("Red"))
                        food[itemSoFar] = new Apple(Apple.RED);
                    else if(parts[1].equals("Green"))
                        food[itemSoFar] = new Apple(Apple.GREEN);
                    else 
                        food[itemSoFar] = new Apple(Apple.YELLOW);
                    itemSoFar++;
                }
            }
            
            for (int i = 0; i < itemSoFar; i++) {
                if(food[i] != null){
                    food[i].consume();
                }
            }

            System.out.println("Input the type of product to count:");
            String targetType = scan.nextLine();
            
            int count = countFoodType(food, targetType);
            System.out.println("Count of " + targetType + ": " + count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
