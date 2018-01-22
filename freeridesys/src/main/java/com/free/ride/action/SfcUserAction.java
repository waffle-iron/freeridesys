package com.free.ride.action;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.free.ride.bean.SfcUser;

/**
 * 用户控制层
 * 类名:SfcUserAction ;
 * @date: 2018-1-20 上午9:43:35 ;
 * @title: 类功能描述注释;
 * @author:zxc;
 * @version:v1.0
 */
@Controller
@RequestMapping("sfcuser")
@Api(value="/sfcuser",tags="测试顺风车用户信息接口")
public class SfcUserAction
{

    @RequestMapping(value="testsfcuser",method=RequestMethod.GET)
    @ApiOperation(value="测试顺风车用户",notes="获取顺风车用户信息",httpMethod="GET",response=SfcUserAction.class)
    public ResponseEntity<SfcUser> getInfo(){
        SfcUser sfcUser = new SfcUser();
        sfcUser.setcId(1);
        sfcUser.setcId(1);
        sfcUser.setCreateTime(new Date());
        sfcUser.setGeoHash("118");
        sfcUser.setNickName("测试");
        sfcUser.setPhoneNo("18673013400");
        return ResponseEntity.ok(sfcUser);
    }
    
}
