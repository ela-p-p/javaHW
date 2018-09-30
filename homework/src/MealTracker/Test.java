package MealTracker;

class Test {

    public static void main(String[] args) {

        User ela = new User("Ela Porter", "ela@awesome.com", 40, "female", 1800);
        ela.userData();

        Food broccoli = new Food(34, 7, 2.8,  "broccoli");
        broccoli.printFood();

        Meal steakBroccoli = new Meal (332, 13, 25, 28, "steak tenderloin and broccoli,");
        steakBroccoli.viewFoods();
    }
}



