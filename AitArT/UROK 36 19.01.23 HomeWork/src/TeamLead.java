public class TeamLead extends Worker {


    public TeamLead(String name, String status) {
        super(name, status);
    }


    @Override
    public String taskMsg(String status) {
        return null;
    }

    @Override
    public String doWork(String taskMsg) {


        return null;
    }


      @Override
    public String toString() {
        return "TeamLead | "+ super.toString();
    }
}