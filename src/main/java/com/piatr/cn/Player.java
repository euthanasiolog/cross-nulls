package com.piatr.cn;

/**
 * Created by piatr on 15.04.17.
 */
public class Player {
    private String name;
    private Enum<Type> type;

    public Player(String name, Enum<Type> type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<Type> getType() {
        return type;
    }

    public void setType(Enum<Type> type) {
        this.type = type;
    }
}
