package com.piatr.cn;

/**
 * Created by piatr on 18.04.17.
 */
public class Game {
    private String id;
    private Player player1;
    private Player player2;
    private GameMap gameMap;


    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public String getId() {
        return id;
    }

    public Game(String player1, String player2, String id) {
        this.id = id;
        this.gameMap = new GameMap();
        this.player1 = new Player(player1, Type.X);
        this.player2 = new Player(player2, Type.O);
    }
}
