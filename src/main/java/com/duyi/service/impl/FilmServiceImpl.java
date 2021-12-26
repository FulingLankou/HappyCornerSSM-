package com.duyi.service.impl;

import com.duyi.dao.FilmDao;
import com.duyi.entity.Film;
import com.duyi.service.FilmService;
import com.duyi.vo.FilmDetailVo;
import com.duyi.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDao filmDao;

    @Override
    public List<FilmVo> getList() {
        List<Film> films = filmDao.getList();
        List<FilmVo> result = new ArrayList<>();
        for (Film film : films) {
            FilmVo vo = new FilmVo();
            vo.setFilmId(film.getFilm_id());
            vo.setName(film.getName());
            vo.setDirector(film.getDirector());
            vo.setImgPath(film.getImg_path());

            result.add(vo);
        }
        return result;
    }

    @Override
    public FilmDetailVo findFilmById(String filmId) {
        Film film = filmDao.findFilmById(filmId);
        FilmDetailVo filmDetailVo = new FilmDetailVo(film);
        System.out.println(filmDetailVo.getName());
        return filmDetailVo;
    }

}
