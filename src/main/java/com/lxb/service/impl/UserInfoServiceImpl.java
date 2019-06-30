package com.lxb.service.impl;



import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import com.lxb.api.UserService;


/**
 * ${DESCRIPTION}
 *
 * @author Xiaobing.Lu
 * @create 2019-05-30 23:28
 **/
@Slf4j
@Service
public class UserInfoServiceImpl implements UserService {
    public String queryUserCodeByDubbo(String userCode){
        log.info("queryUserCodeByDubbo,userCode:{}", userCode);
        return userCode + "aa";
    }

}