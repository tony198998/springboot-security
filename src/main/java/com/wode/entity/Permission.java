package com.wode.entity;

import lombok.Data;

/**
 * 权限实体
 *
 * @description:
 * @author: jitao
 * @createDate: 2021/7/14
 */
@Data
public class Permission {

    private int id;

    //权限名称
    private String name;

    //权限描述
    private String descritpion;

    //授权链接
    private String url;

    //父节点id
    private int pid;
}
