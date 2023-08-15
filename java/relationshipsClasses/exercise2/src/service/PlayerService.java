package service;

import entities.Gun;

public class PlayerService {

    GunService gs1 = new GunService();

    public void shot (Gun gun) {
        boolean ss = gs1.wed(gun);

        if (ss == true) {

        }
    }
}
