package soccerapp.entities;
public class Player {
    private String name;
    private String posit;
    private int goals;
    public Player() {

    }
    public Player(String name, String posit, int goals) {
        this.name = name;
        this.posit = posit;
        this.goals = goals;
    }    public String getName() {
        return name;
    }    public void setName(String name) {
        this.name = name;
    }    public String getPosit() {
        return posit;
    }
    public void setPosit(String posit) {
        this.posit = posit;
    }
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", posit='" + posit + '\'' +
                ", goals=" + goals +
                '}';
    }
}