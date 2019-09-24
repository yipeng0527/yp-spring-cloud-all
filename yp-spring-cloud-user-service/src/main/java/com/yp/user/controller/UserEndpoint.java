package com.yp.user.controller;

import com.yp.common.bean.product.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ex-yipeng
 * @version Id: UserEndpoint.java, v 0.1 2019/9/24 16:00 ex-yipeng Exp $
 */
@RestController
@RequestMapping("/user")
public class UserEndpoint {

    private final static Logger log = LoggerFactory.getLogger(UserEndpoint.class);

    @Value("${server.port:2200}")
    private int serverPort = 2200;

    @RequestMapping(value = "/{loginName}",method = RequestMethod.GET)
    public User detail(@PathVariable String loginName) {
        String memos = "I come from " + serverPort;
        return new User(loginName, loginName, "18627059089", memos);
    }
}
