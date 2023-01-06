abstract class Car {

    protected int speed;
    private String model;
    private float weight;
    private String color;
    private boolean isWork;

    class Driving {
        private boolean isDrive;
        Driving(boolean isDrive) {
            this.isDrive = isDrive;
        }
        void drive() {
            System.out.println(this.isDrive);
        }
    }
    Driving engine=new Driving(true);

    Car(){
        System.out.println("Объект был создан ");
        printAll();
    }
    Car(int speed){
        this.speed=speed;
    }
    Car (String model, float weight, String color, boolean isWork){
        this.model=model;
        this.weight=weight;
        this.color=color;
        this.isWork=isWork;

    }
    Car ( int speed, String model, float weight, String color, boolean isWork){
        this.speed=speed;
        this.model=model;
        this.weight=weight;
        this.color=color;
        this.isWork=isWork;

    }
    void setAll(String model, float weight, String color, boolean isWork){
        this.model=model;
        this.weight=weight;
        this.color=color;
        this.isWork=isWork;

    }
void printAll(){
        String isWork = this.isWork? "работает" : "не работает";
        System.out.println( "Автомобиль марки | "+ this.model +", имеет скорость: " + this. speed +
                                        " Bec: " + this.weight + ". Его цвет " + this.color+" и он " + isWork);
    }

    abstract void startEngine();


}
