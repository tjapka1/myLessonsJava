public class TeamLead extends Worker {


    public TeamLead(String name, String status) {
        super(name, status);
        taskMsg(super.getStatus());
    }


    @Override
    public String taskMsg(String status) {
        String outputStr="";

        return doWork(outputStr);
    }

    @Override
    public String doWork(String taskMsg) {
        String outputStr = "";
        
        try {
            outputStr="was";
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (TeamLeadUnavailableNowException e){
            System.out.println("TeamLeadUnavailableNowException");
        }
        return outputStr;
    }


      @Override
    public String toString() {
        return "TeamLead | "+ super.toString() ;
    }
}