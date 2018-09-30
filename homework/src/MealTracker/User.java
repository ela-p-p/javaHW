package MealTracker;

class User {

//   static int targetAdherence = 0;

    private String fullName;

    private String email;

    private double age;

    private String gender;

    private double targetCalories;

//    public void targetAdherence;


    User(String fullName, String email, double age, String gender, double targetCalories) {
        this.setFullName(fullName);
        this.setEmail(email);
        this.setAge(age);
        this.setGender(gender);
        this.setTargetCalories(targetCalories);
   };

    public String getFullName() {
        return this.fullName;
    }
    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }
    private void setEmail(String email) {
        this.email = email;
    }

    public double getAge() {return this.age;}
    private void setAge(double age) {
        this.age = age;
    }

    public String getGender() {return this.gender;}
    private void setGender(String gender) {
        this.gender = gender;
    }

    public double getTargetCalories() {return this.targetCalories;}
    private void setTargetCalories(double targetCalories) {
        this.targetCalories = targetCalories;
    }


    public void userData() {

        System.out.println(String.format("Meal Tracker for %s, who is a %.0f year old %s.  Recommened daily caloric intake is: %.0f.", this.fullName, this.age, this.gender, this.targetCalories));
    }


}

