package com.company.project.module.websocket;

/**
 * @Author: Lides
 * @Date: 2019/9/19 22:43
 */

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/checkcenter")
public class CheckCenterController {


    /**
     * 主动向客户端发送消息()
     * @param cid       自定义的用户id,当为null时群发
     * @param message   消息
     * @return
     */

    @GetMapping ("/socket/push/{cid}")
    public Result pushToWeb(@PathVariable String cid, @RequestParam("message") String message) {
        try {
            WebSocketServer.sendInfo(message,cid);
        } catch (IOException e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(cid+"#"+e.getMessage());
        }
        return ResultGenerator.genSuccessResult(cid);
    }
}

