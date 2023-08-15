package service;

import entities.Gun;

import java.util.Random;

public class GunService {



    public void randomPosition (Gun gun) {
        Random random = new Random();

        gun.setActualP(random.nextInt(6) + 1);
        gun.setWaterP(random.nextInt(6) + 1);
    }

    public boolean wed (Gun gun) {

            if (gun.getWaterP() == gun.getActualP()) {
                return true;
            } else {
                return false;
        }
    }

    public boolean nextShot (Gun gun) {
        boolean awr;
        if (gun.getActualP() <= 6) {
            gun.setActualP(gun.getActualP() + 1);
            awr = wed(gun);
        } else {
            gun.setActualP(1);
            awr = wed(gun);
        }

        return awr;
    }

    public void print (Gun gun) {
        gun.toString();
    }


}
