package com.lx.service;

import com.lx.pojo.House;
import com.lx.pojo.MaxMin;

import java.util.List;

public interface HouseService {
    public List<House> List(House house);
    public int Add(House house);
    public int Update(House house);
    public void Delete(House house);
    public int houseZtUpdate(House house);
}
