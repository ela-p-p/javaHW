package MealTracker;

public class Food {
    private double calories;
    private double carbohydrates;
    private double protein;
    private String name;

    Food(double calories, double carbohydrates, double protein, String name) {
        this.setCalories(calories);
        this.setCarbohydrates(carbohydrates);
        this.setProtein(protein);
        this.setName(name);
    }


//    private ArrayList<Category> getCategories;
//

    private double getCalories() { return this.calories; }

    private void setCalories(double calories) { this.calories = calories; }

    private double getCarbohydrates() { return this.carbohydrates;}

    private void setCarbohydrates(double carbohydrates) {this.carbohydrates = carbohydrates;}

    private double getProtein() { return this.protein;}

    private void setProtein(double protein) {this.protein = protein;}

    private String getName() {return this.name;}

    private void setName(String name) {this.name = name;}

//    private void addCategory () {}

    public void printFood () {

        System.out.println(String.format("%s has %.0f calories, %.0fg of protein, and %.0fg of carbohydrates.", this.name, this.calories, this.protein, this.carbohydrates));
    }
}

