package com.piatr.cn;

import java.util.ArrayList;

/**
 * Created by piatr on 18.04.17.
 */
public class GameMap {
    private String[] types = new String[9];

    public GameMap() {
        this.types = new String[9];
        for (int i=0;i<types.length;i++){types[i]="";}
    }

    public String[] getTypes() {
        return types;
    }

}
