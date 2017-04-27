package com.piatr.cn.controllers;

import com.piatr.cn.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by piatr on 15.04.17.
 */
@Controller
public class CNController implements Print{
    private static final String INDEX = "index";
    private static final String NEXT_NAME = "nextName";

    public void print(HttpServletRequest request, ModelMap modelMap, Type type, Game game, Player player) {
        int index = Integer.parseInt(request.getParameter(INDEX));
        GameMap gameMap = game.getGameMap();
        String[] types = gameMap.getTypes();
        if(types[index - 1].equals(""))
        {types[index-1]=type.name();
        }else modelMap.addAttribute("type",type.name());
        for (int i=0;i<types.length;i++){
            modelMap.addAttribute("index"+String.valueOf(i+1), types[i]);
        }
    }

    @RequestMapping(value = "/play", params = "X")
    public String printX (HttpServletRequest request, ModelMap modelMap){
        String id = request.getRemoteAddr();
        Game game = StartController.findGame(id);
        if (game.getGameMap().checkWin(game.getGameMap()))
        {modelMap.addAttribute("win", game.getPlayer1().getName());}
        else{
            modelMap.addAttribute(NEXT_NAME, game.getPlayer2().getName());
            modelMap.addAttribute("type","O");
        }
        print(request, modelMap, Type.X, game, game.getPlayer1());
        return "index";
    }

    @RequestMapping(value = "/play", params = "O")
    public String printO (HttpServletRequest request, ModelMap modelMap){
        String id = request.getRemoteAddr();
        Game game = StartController.findGame(id);
        if (game.getGameMap().checkWin(game.getGameMap()))
        { modelMap.addAttribute("win", game.getPlayer2().getName());}
        else{
            modelMap.addAttribute(NEXT_NAME, game.getPlayer1().getName());
            modelMap.addAttribute("type","X");
        }
        print(request, modelMap, Type.O, game, game.getPlayer2());
        return "index";
    }
}
