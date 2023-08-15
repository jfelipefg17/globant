package entities;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> playerList = new ArrayList<>();
    private Gun gun;


    public  Game() {

    }

    public Game(ArrayList<Player> playerList, Gun gun) {
        this.playerList = playerList;
        this.gun = gun;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        return "Game{" +
                "playerList=" + playerList +
                ", gun=" + gun +
                '}';
    }
}
