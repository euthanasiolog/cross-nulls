package com.piatr.cn.controllers;

import com.piatr.cn.Game;
import com.piatr.cn.GameMap;
import com.piatr.cn.Print;
import com.piatr.cn.Type;
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

    public String print(HttpServletRequest request, ModelMap modelMap, Type type, Game game) {
        int index = Integer.parseInt(request.getParameter(INDEX));
        GameMap gameMap = game.getGameMap();
        Type[] types = gameMap.getTypes();
        types[index]=type;
        for (int i=0;i<types.length;i++){
            modelMap.addAttribute("index"+String.valueOf(i+1), types[i].name());
        }
        return "index";
    }

    @RequestMapping(value = "/play", params = "X")
    public void printX (HttpServletRequest request, ModelMap modelMap){
        String id = request.getRemoteAddr();
        Game game = StartController.findGame(id);
        modelMap.addAttribute(NEXT_NAME, game.getPlayer2().getName());
        modelMap.addAttribute("type","O");
        print(request, modelMap, Type.X, game);
    }
    @RequestMapping(value = "/play", params = "O")
    public void printO (HttpServletRequest request, ModelMap modelMap){
        String id = request.getRemoteAddr();
        Game game = StartController.findGame(id);
        modelMap.addAttribute(NEXT_NAME, game.getPlayer1().getName());
        modelMap.addAttribute("type","X");
        print(request, modelMap, Type.O, game);
    }
}
