package service;

import entities.Game;
import entities.Gun;
import entities.Player;

import java.util.Random;

public class GunService {

    public void randomPosition (Gun gun, Game g1) {

        Player [] ArrayP = g1.getArrayP();
        Random random = new Random();

        gun.setActualP(random.nextInt(6) + 1);
        gun.setWaterP(random.nextInt(6) + 1);
        gun.setActualPP(0);
    }


    public boolean wed (Gun gun) {

        return gun.getWaterP() == gun.getActualP();
    }


    public void nextShot (Gun gun, Game g1) {

        Player [] ArrayP = g1.getArrayP();

        if (gun.getActualPP() > ArrayP.length) {
            gun.setActualPP(0);
        } else {
            gun.setActualPP(gun.getActualPP() + 1);
        }

        if (gun.getActualP() >= 6) {
            gun.setActualP(1);
        } else {
            gun.setActualP(gun.getActualP() + 1);
        }

    }

    public void print (Gun gun) {
        System.out.println(gun.toString());

    }
}
