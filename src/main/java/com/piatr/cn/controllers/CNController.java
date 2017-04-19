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
    private String checkWin(GameMap gameMap){
        String[] types = gameMap.getTypes();
        for (int i=0; i<7;i=i+3){
        if (types[i].equals(types[i+1])|types[i].equals(types[i+2])) return types[i];
        }
        for (int i=0;i<3;i++){
            if (types[i].equals(types[i+3])|types[i].equals(types[i+6]))return types[i];
        }
        if (types[0].equals(types[4])|types[0].equals(types[8]))return types[0];
        if (types[2].equals(types[4])|types[0].equals(types[6]))return types[2];
        return null;
    }

    public void print(HttpServletRequest request, ModelMap modelMap, Type type, Game game) {
        int index = Integer.parseInt(request.getParameter(INDEX));
        GameMap gameMap = game.getGameMap();
        String[] types = gameMap.getTypes();
        types[index]=type.name();
        if(checkWin(gameMap)!=null)modelMap.addAttribute(NEXT_NAME, type.name()+"WIN!");
        for (int i=0;i<types.length;i++){
            modelMap.addAttribute("index"+String.valueOf(i+1), types[i]);
        }
    }

    @RequestMapping(value = "/play", params = "X")
    public String printX (HttpServletRequest request, ModelMap modelMap){
        String id = request.getRemoteAddr();
        Game game = StartController.findGame(id);
        if (game != null) {
            modelMap.addAttribute(NEXT_NAME, game.getPlayer2().getName());
        }else  modelMap.addAttribute(NEXT_NAME, "");
        modelMap.addAttribute("type","O");
        print(request, modelMap, Type.X, game);
        return "index";
    }

    @RequestMapping(value = "/play", params = "O")
    public String printO (HttpServletRequest request, ModelMap modelMap){
        String id = request.getRemoteAddr();
        Game game = StartController.findGame(id);
        if (game != null) {
            modelMap.addAttribute(NEXT_NAME, game.getPlayer1().getName());
        }else  modelMap.addAttribute(NEXT_NAME, "");
        modelMap.addAttribute("type","X");
        print(request, modelMap, Type.O, game);
        return "index";
    }
}
