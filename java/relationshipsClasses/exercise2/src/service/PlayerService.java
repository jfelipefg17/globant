package service;

import entities.Game;
import entities.Gun;
import entities.Player;

import java.util.ArrayList;

public class PlayerService {


    public boolean shot (Gun gun, GunService gs1, Game g1) {

        boolean ss = gs1.wed(gun);


        if (ss) {
            return true;
        } else {

            return false;
        }
    }


}
