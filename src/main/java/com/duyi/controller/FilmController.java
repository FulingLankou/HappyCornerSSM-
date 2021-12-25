package com.duyi.controller;

import com.duyi.service.FilmService;
import com.duyi.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping("/filmList")
    @ResponseBody
    public List<FilmVo> getList(){
        return filmService.getList();
    }

    @RequestMapping("/home")
    public String home(HttpServletRequest request, Model model){
        System.out.println("request.contextPath:"+request.getContextPath());
        List<FilmVo> filmVoList = filmService.getList();
        model.addAttribute("filmVoList",filmVoList);
        return "home";
    }

}
