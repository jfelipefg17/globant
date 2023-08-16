package entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    private  Player [] ArrayP;
    private Gun gun;


    public  Game() {

    }

    public Game(Player [] ArrayP, Gun gun) {
        this.ArrayP = ArrayP;
        this.gun = gun;
    }

    public Player [] getArrayP() {
        return ArrayP;
    }

    public void setArrayP(Player [] ArrayP) {
        this.ArrayP = ArrayP;
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
                "playerList=" + ArrayP +
                ", gun=" + gun +
                '}';
    }
}
