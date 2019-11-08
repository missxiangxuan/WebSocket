package cn.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cx
 * @date : 2019/10/8 14:53
 * @info：
 */
@RestController
@RequestMapping("/test")
public class WeChatController {

    @RequestMapping("/hi")
    public String hi(){
        return "hello wechat";
    }
}
