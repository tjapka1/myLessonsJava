public class Animals {
    public static void main(String[] args) {
        sunIsUp();
        int chickenWeight = 300;
        int pickWeight = 10000;
        System.out.println("я свинь " + " " + "хочу жрать" + pickWeight);
        System.out.println("I'm hungry chicken, I weight" + " " + chickenWeight + " BAWK");
        int kartof = 10;
        int wurms = 5;
        int egg = 10;
        chickenWeight = eatWorms(wurms, chickenWeight);
        System.out.println("Bawk-bawk, I had lunch. Now, I weight " + chickenWeight);
        chickenWeight = run(chickenWeight);
        sunIsDown();
        System.out.println("pohudel na 20"+ " i stal" + " " + chickenWeight);
    }
    static void sunIsUp() {
        System.out.println("Sun is up!");
    }
    static int eatkartof(int kartof, int oldWeight)
        int int newWeight = oldWeight + (numberOfWorms * 10);
        return newWeight;
    static int eatWorms(int numberOfWorms, int oldWeight) {
        int newWeight = oldWeight + (numberOfWorms * 10);
        return newWeight;
    }
    static void sunIsDown() {
        System.out.println("Sun is Down!");
    }

    static int run(int oldWeight) {
        int newWeight = oldWeight - 20;
        return newWeight;
    }

    static int eatEgg(int egg, int oldWeight){

    }

}