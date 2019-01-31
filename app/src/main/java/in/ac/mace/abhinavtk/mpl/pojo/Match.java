package in.ac.mace.abhinavtk.mpl.pojo;

public class Match {

    private String team1;
    private String team2;
    private int team1goal;
    private int team2goal;
    private String datetime;
    private String team1stat;
    private String team2stat;
    private boolean live;

    public Match(){
        //empty
    }

    public Match(String team1, String team2,int team1goal,int team2goal, String datetime, String team1stat, String team2stat, boolean live) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1goal=team1goal;
        this.team2goal=team2goal;
        this.datetime = datetime;
        this.team1stat = team1stat;
        this.team2stat = team2stat;
        this.live = live;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getTeam1stat() {
        return team1stat;
    }

    public void setTeam1stat(String team1stat) {
        this.team1stat = team1stat;
    }

    public String getTeam2stat() {
        return team2stat;
    }

    public void setTeam2stat(String team2stat) {
        this.team2stat = team2stat;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public int getTeam1goal() {
        return team1goal;
    }

    public void setTeam1goal(int team1goal) {
        this.team1goal = team1goal;
    }

    public int getTeam2goal() {
        return team2goal;
    }

    public void setTeam2goal(int team2goal) {
        this.team2goal = team2goal;
    }
}
