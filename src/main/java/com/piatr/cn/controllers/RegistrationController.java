package com.piatr.cn.controllers;

import com.piatr.cn.RegForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by piatr on 28.04.17.
 */
@Controller
public class RegistrationController {
    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg(ModelMap modelMap){
        RegForm regForm = new RegForm();
        modelMap.put("regForm", regForm);
        return "registration";
    }
    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String registration(@Valid final RegForm regForm, ModelMap modelMap,final BindingResult bindingResult){
        if (bindingResult.hasErrors())return "registration";
        else if (regForm.getPassword().equals(regForm.getConfirmPassword())) {
            modelMap.addAttribute("name", regForm.getName());
            return "hello";
        } return "registration";
    }
}
