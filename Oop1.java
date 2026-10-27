import  java.util.*;





class Restaurant {

    private Map<String, Double> menuItems;
    private List<Integer> ratings;

    // Constructor
    public Restaurant() {
        menuItems = new HashMap<>();
        ratings = new ArrayList<>();
    }

    // Add menu item with price
    public void addItem(String item, double price) {
        menuItems.put(item, price);
        System.out.println(item + " added successfully.");
    }

    // Remove menu item
    public void removeItem(String item) {
        if (menuItems.remove(item) != null) {
            System.out.println(item + " removed successfully.");
        } else {
            System.out.println(item + " not found.");
        }
    }

    // Display menu
    public void displayMenu() {
        System.out.println("\nRestaurant Menu:");

        for (Map.Entry<String, Double> entry : menuItems.entrySet()) {
            System.out.println(entry.getKey() + " - Rs. " + entry.getValue());
        }
    }

    // Add customer rating (1 to 5)
    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        } else {
            System.out.println("Rating must be between 1 and 5.");
        }
    }

    // Calculate average rating
    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        int sum = 0;

        for (int rating : ratings) {
            sum += rating;
        }

        return (double) sum / ratings.size();
    }
}

public class Oop1{ 
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        restaurant.addItem("Pizza", 250);
        restaurant.addItem("Burger", 120);
        restaurant.addItem("Pasta", 180);

        restaurant.displayMenu();

        restaurant.removeItem("Burger");

        restaurant.addRating(4);
        restaurant.addRating(5);
        restaurant.addRating(3);

        System.out.println("\nAverage Rating: "
                + restaurant.calculateAverageRating());
    }
}
