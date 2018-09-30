package MealTracker;

public class Meal {
    private double calories;
    private double fat;
    private double carbohydrates;
    private double protein;
    private String name;
//    private DateTime MealTime;


    Meal(double calories, double fat, double carbohydrates, double protein, String name) {
        this.setCalories(calories);
        this.setFat(fat);
        this.setCarbohydrates(carbohydrates);
        this.setProtein(protein);
        this.setName(name);
    }

    private double getCalories() { return this.calories; }

    private void setCalories(double calories) { this.calories = calories; }

    private double getFat() { return this.fat; }

    private void setFat(double fat) { this.fat = fat; }

    private double getCarbohydrates() { return this.carbohydrates;}

    private void setCarbohydrates(double carbohydrates) {this.carbohydrates = carbohydrates;}

    private double getProtein() { return this.protein;}

    private void setProtein(double protein) {this.protein = protein;}

    private String getName() {return this.name;}

    private void setName(String name) {this.name = name;}


    public void viewFoods () {
        System.out.println(String.format("Dinner tonight will be %s which has %.0f calories, %.0fg of fat, %.0fg of protein, and %.0fg of carbohydrates.", this.name, this.calories, this.fat, this.protein, this.carbohydrates));
    }
}