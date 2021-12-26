package com.duyi.service;

import com.duyi.vo.FilmDetailVo;
import com.duyi.vo.FilmVo;

import java.util.List;

public interface FilmService {
    List<FilmVo> getList();

    FilmDetailVo findFilmById(String filmInfo);

}
