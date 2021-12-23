package com.duyi.controller;

import com.duyi.service.FilmService;
import com.duyi.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping("/getList")
    @ResponseBody
    public List<FilmVo> getList(){
        return filmService.getList();
    }
}
