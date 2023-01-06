public class Panda {
    private double weight;
    private int age;
    private boolean isMale;
    private String name ="Shusha";
    private Toy[] toys;
    private  boolean isInGooDMood;

public Panda(String name, int age, boolean isMale, Toy[]toys, boolean isInGooDMood){
    this.isInGooDMood=false;
}

    public Panda(double weight, int age, boolean isMale, String name, Toy[] toys, boolean isInGooDMood) {
        this.weight = weight;
        this.age = age;
        this.isMale = isMale;
        name = name;
        this.toys = toys;
        this.isInGooDMood = isInGooDMood;
    }

    public double getWeight() {
        return weight;
    }
public int getAge(){
    return age;
}

    public boolean isMale() {
        return isMale;
    }

    public String getName() {
        return name;
    }

    public Toy[] getToys() {
        return toys;
    }

    public boolean isInGooDMood() {
        return isInGooDMood;
    }
public void setWeight(double weight){
    this.weight=weight;
}

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setName(String name) {
        name = name;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }

    public void setInGooDMood(boolean inGooDMood) {
        isInGooDMood = inGooDMood;
    }

    public String toString() {
        String allToys = "";
        for (int i = 0; i < toys.length; i++) {
            if (i == toys.length-1) {
                allToys= allToys + toys[i] + ".";
            } else {
                allToys= allToys + toys[i] + ", ";
            }
        }
        return "Panda " + name + " is " + age + " years old. Favourite toys are: " + allToys;
    }

}
