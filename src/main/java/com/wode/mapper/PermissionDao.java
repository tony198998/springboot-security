package com.wode.mapper;

import com.wode.entity.Permission;

import java.util.List;

/**
 * @description:
 * @author: jitao
 * @createDate: 2021/7/14
 */
public interface PermissionDao {

    Permission getById(Integer id);

    List<Permission> findAll();

    List<Permission> findByAdminUserId(Integer id);
}
