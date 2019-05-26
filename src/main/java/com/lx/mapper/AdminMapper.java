package com.lx.mapper;

import com.lx.pojo.Admin;

import java.util.List;

public interface AdminMapper {
    public int adminAdd(Admin admin);
    public int adminUpdate(Admin admin);
    public void adminDelete(Admin admin);
    public List<Admin> adminListOne(Admin admin);
}
