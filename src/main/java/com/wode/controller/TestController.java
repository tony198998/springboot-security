package com.wode.controller;

import com.wode.entity.Permission;
import com.wode.mapper.PermissionDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @description:
 * @author: jitao
 * @createDate: 2021/7/14
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Resource
    private PermissionDao permissionDao;

    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public String testOne() {
        return "one";
    }

    @RequestMapping(value = "/permission", method = RequestMethod.GET)
    public Permission testPermission(Integer id) {
        log.info("入参：" + id);
        return permissionDao.getById(id);
    }

}
