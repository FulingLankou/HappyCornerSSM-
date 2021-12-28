package com.duyi.dao;

import com.duyi.entity.Play;
import java.util.List;

public interface PlayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Play record);

    Play selectByPrimaryKey(Long id);

    List<Play> selectAll();

    int updateByPrimaryKey(Play record);
}