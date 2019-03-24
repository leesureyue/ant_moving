package com.leesure.controller;

import com.leesure.common.result.ListResult;
import com.leesure.common.result.PageResult;
import com.leesure.common.result.PlainResult;
import com.leesure.dao.entity.*;
import com.leesure.remote.intl.ShopServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yue on 2019/3/15.
 * 面向商店服务的接口
 * @author yue
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopServiceApi shopServiceApi;


    @RequestMapping("/register")
    public PlainResult<Long> registerShop(ShopInfo shopInfo){
        PlainResult<Long> result = shopServiceApi.registerShopInfo(shopInfo);
        return result;
    }

    @RequestMapping("/active")
    public PlainResult<Boolean> activeShop(ShopInfo shopInfo){
        PlainResult<Boolean> result = shopServiceApi.activeShop(shopInfo);
        return result;
    }


    @RequestMapping("/queryByConditions")
    public ListResult<ShopInfo> queryByConditions(@RequestParam("address") String address,
                                                  String name){
        return shopServiceApi.getShopInfoByCondition(address,name);
    }


    @RequestMapping("/getShopDetail")
    public PlainResult<ShopDetail> getShopDetail(@RequestParam("shopId") Long shopId){
        return shopServiceApi.getShopDetailById(shopId);
    }
    @RequestMapping("/getOrder")
    public PageResult<Order> getShopOrder(Long shopId){
        //todo 获取商店订单
        return null;
    }

    @RequestMapping("/changeOrderState")
    public PlainResult<Boolean> changeOrderState(@RequestParam("orderId") Long orderId,
                                                 @RequestParam("status")  String status){

        //todo 更新订单状态
        return null;
    }


    @RequestMapping("/getEvaluateList")
    public PageResult<Evaluate> getEvaluateList(){
        //todo 查询评价单列表
        return null;
    }

    @RequestMapping("/getServiceList")
    public PageResult<ShopService> getServiceList(@RequestParam("shopId") Long shopId){

        //todo 获取商店所属服务列表
        return null;

    }


}
