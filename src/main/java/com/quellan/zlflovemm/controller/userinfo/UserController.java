package com.quellan.zlflovemm.controller.userinfo;

import com.quellan.zlflovemm.entry.UserEntry;
import com.quellan.zlflovemm.service.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/16 17:14
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理相关接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("获取用户列表")
    @RequestMapping(value = "/list")
    public List<UserEntry> findUserList(){
        return userService.findUserList();
    }


    @ApiOperation("新增用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName",value = "用户名",defaultValue = "zlf"),
            @ApiImplicitParam(name="password",value = "密码",defaultValue = "zlf"),
            @ApiImplicitParam(name = "email",value = "邮箱",defaultValue = "11@qq.com")
    })
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addUser(@RequestParam(value = "userName")String uaserName,@RequestParam(value = "password")String password,@RequestParam(value = "email")String email){
        int falg=userService.addUser(uaserName,password,email);
        if(falg>0){
            return "success";
        }
        return "error";
    }

    @ApiOperation("删除用户信息")
    @ApiImplicitParam(name = "id",value = "1",defaultValue = "1")
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteUser(@RequestParam(value = "id")int id){
        if(userService.deleteUser(id)>0){
            return "success";
        }
        return "error";
    }


    @ApiOperation("获取用户列表2")
    @RequestMapping(value = "/list2",method = RequestMethod.GET)
    public List<UserEntry> findUserList2(){
        return userService.findUserList2();
    }

    @ApiOperation("新增用户信息2")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName",value = "用户名",defaultValue = "zlf"),
            @ApiImplicitParam(name="password",value = "密码",defaultValue = "zlf"),
            @ApiImplicitParam(name = "email",value = "邮箱",defaultValue = "11@qq.com")
    })
    @RequestMapping(value = "/add2",method = RequestMethod.GET)
    public String addUser2(@RequestParam(value = "userName")String uaserName,@RequestParam(value = "password")String password,@RequestParam(value = "email")String email){
        int falg= userService.addUser2(uaserName,password,email);
        if(falg>0){
            return "success";
        }
        return "error";
    }

    @ApiOperation("删除用户信息2")
    @ApiImplicitParam(name = "id",value = "1",defaultValue = "1")
    @RequestMapping(value = "/delete2",method = RequestMethod.GET)
    public String deleteUser2(@RequestParam(value = "id")int id){
        if(userService.deleteUser2(id)>0){
            return "success";
        }
        return "error";
    }



}
