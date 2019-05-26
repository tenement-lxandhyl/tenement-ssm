package com.lx.mapper;

import com.lx.pojo.House;
import com.lx.pojo.MaxMin;

import java.util.List;

public interface HouseMapper {
    public List<House> houseList(House house);
    public int houseAdd(House house);
    public int houseUpdate(House house);
    public void houseDelete(House house);
    public int houseZtUpdate(House house);
}
