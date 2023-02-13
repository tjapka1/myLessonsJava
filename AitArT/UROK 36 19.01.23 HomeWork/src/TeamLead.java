public class TeamLead extends Worker {


    public TeamLead(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "TeamLead | "+ super.toString() ;
    }

    @Override
    public void setAvailable() {

    }

    @Override
    public void setNotAvailable() {

    }

    @Override
    public void setBusy() {

    }
}