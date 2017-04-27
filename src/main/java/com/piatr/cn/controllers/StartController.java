package com.piatr.cn.controllers;

import com.piatr.cn.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by piatr on 15.04.17.
 */
@Controller
public class StartController {
    private static final String PLAYER1 = "player1";
    private static final String PLAYER2 = "player2";
    private static ArrayList<Game> games = new ArrayList<Game>();

    @RequestMapping(value = "/")
    public String helloPage(){
        return "registration";
    }

    @RequestMapping(value = "/start")
    public String startNewGame(HttpServletRequest request, ModelMap modelMap){
        String id = request.getRemoteAddr();
        games.add(new Game(request.getParameter(PLAYER1), request.getParameter(PLAYER2), id));
        modelMap.addAttribute("type", "X");
        modelMap.addAttribute("nextName", request.getParameter(PLAYER1));
        for(int i=0;i<9;i++){
            modelMap.addAttribute("index"+String.valueOf(i+1), "");
        }
        return "index";
    }
    static Game findGame(String id){
        for (Game game : games) {
            if (id.equals(game.getId())) return game;
        }
           return null;
    }
}