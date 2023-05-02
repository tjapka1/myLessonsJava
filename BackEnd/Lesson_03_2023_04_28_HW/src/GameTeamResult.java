public class GameTeamResult {
    private String team;
    private int goals;

    public GameTeamResult(String team, int goals) {
        this.team = team;
        this.goals = goals;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return team + " " + goals ;
    }
}
