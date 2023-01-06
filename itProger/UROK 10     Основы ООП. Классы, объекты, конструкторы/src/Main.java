public class Main {
    public static void main(String[] args) {
BMW m5=new BMW(false,300, "M5", 2500.23f, "Синий", true);
        m5.printAll();
        m5.startEngine();




        Audi obj= new Audi(){
            private boolean isWork;
            public void isDriven(){
                this.isWork=true;
            }
            public void printAll(){
                System.out.println(isWork);
            }
        };

    obj.printAll();
    obj.isDriven();
    obj.printAll();
    }

    private static class Audi {
    public void printAll(){}
        public void isDriven(){}
    }
}