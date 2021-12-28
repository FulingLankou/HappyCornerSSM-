package com.duyi.controller;

import com.duyi.service.FilmService;
import com.duyi.vo.FilmDetailVo;
import com.duyi.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
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
    public String home(Model model){
        List<FilmVo> filmVoList = filmService.getList();
        model.addAttribute("filmVoList",filmVoList);
        return "home";
    }

    @RequestMapping("/filmInfo")
    public String filmInfo(@RequestParam String filmId, Model model){
        FilmDetailVo detailVo = filmService.findFilmById(filmId);
        model.addAttribute("detailVo",detailVo);
        
        return "detail";
    }


}
