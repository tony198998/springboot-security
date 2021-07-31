package com.wode.mapper;

import com.wode.entity.SysUser;

public interface UserDao {
     SysUser findByUserName(String username);
}