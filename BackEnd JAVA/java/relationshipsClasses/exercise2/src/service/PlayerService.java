package service;

import entities.Game;
import entities.Gun;


public class PlayerService {

    public boolean shot (Gun gun, GunService gs1, Game g1) {
        return gs1.wed(gun);
    }
}
