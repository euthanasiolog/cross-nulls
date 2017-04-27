package com.piatr.cn;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by piatr on 18.04.17.
 */
public class GameMap {
    private String[] types = new String[9];

    public GameMap() {
        this.types = new String[9];
        for (int i=0;i<types.length;i++){types[i]="";}
    }
    public boolean checkWin(GameMap gameMap){
        String[] types = gameMap.getTypes();
        for (int i=0; i<7;i=i+3){
            if ((types[i].equals(types[i+1])&types[i].equals(types[i+2]))& !Objects.equals(types[i], "")) return true;
        }
        for (int i=0;i<3;i++){
            if ((types[i].equals(types[i+3])&types[i].equals(types[i+6]))& !Objects.equals(types[i], ""))return true;
        }
        if ((types[0].equals(types[4])&types[0].equals(types[8]))& !Objects.equals(types[0], ""))return true;
        if ((types[2].equals(types[4])&types[0].equals(types[6]))& !Objects.equals(types[2], ""))return true;
        return false;
    }

    public String[] getTypes() {
        return types;
    }

}
