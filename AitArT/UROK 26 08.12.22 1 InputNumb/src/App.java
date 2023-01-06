import java.util.Scanner;

public class App {
    private NumberProcessing processing;

    public App(NumberProcessing processing) {
        this.processing = processing;
    }

    public void userAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("0. exit 1. sum 2. average or num for find");
        int choise = sc.nextInt();

        switch (choise) {
            case 0:
                return;
            case 1:
                sum();
                break;
            case 2:
                avg();
                break;
            default:
                find(choise);

        }
    }

    private void sum() {
        System.out.println("the Sum is " + processing.sum());
    }

    private void avg() {
        System.out.println("The average is " + processing.avg());
    }
    private void find(int choise) {
        String msg = choise + (processing.find(choise) ? "  Найдено " : " Не найдено ");
        System.out.println(msg);
    }


}
