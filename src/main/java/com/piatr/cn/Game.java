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

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Game(String player1, String player2, String id) {
        this.id = id;
        this.gameMap = new GameMap();
        this.player1 = new Player(player1, Type.X);
        this.player2 = new Player(player2, Type.O);
    }
}
