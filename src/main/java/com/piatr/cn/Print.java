package com.piatr.cn;

import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by piatr on 18.04.17.
 */
public interface Print {
    void print(HttpServletRequest request, ModelMap modelMap, Type type, Game game);
}
