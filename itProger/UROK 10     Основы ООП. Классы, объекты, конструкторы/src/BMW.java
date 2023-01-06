public class BMW extends Car{
    private boolean isMPerfomance=false;

    BMW(boolean isMPerfomance, int speed, String model, float weight, String color, boolean isWork){
        super(speed,model, weight,color, isWork);
        this.isMPerfomance=isMPerfomance;
    }

  void printAll(){
      super.printAll();
      String isMPerfom = isMPerfomance ? "является" : "не является";
      System.out.println ("Машина " + isMPerfom + " М перфомансе");
      super.engine.drive();
  }

    @Override
    void startEngine() {
        System.out.println("Машина заводиться с кнопки !!");
    }


}
