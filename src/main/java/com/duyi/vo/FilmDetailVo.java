package com.duyi.vo;

import com.duyi.entity.Film;

import java.util.Date;

public class FilmDetailVo {
    private long id;
    private String filmId;  // filmId 驼峰也可  需要额外配置
    private String name;
    private String director;
    private String player;
    private String type;
    private String country;
    private int length;
    private String synopsis;
    private Date playTime;
    private String imgPath;

    public FilmDetailVo() {
    }

    public FilmDetailVo(Film film){
        this.id = film.getId();
        this.filmId = film.getFilm_id();
        this.name = film.getName();
        this.director = film.getDirector();
        this.player = film.getPlayer();
        this.type = film.getType();
        this.country = film.getCountry();
        this.length = film.getLength();
        this.synopsis = film.getSynopsis();
        this.playTime = film.getPlay_time();
        this.imgPath = film.getImg_path();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
