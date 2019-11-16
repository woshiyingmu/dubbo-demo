package com.lxb.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author Xiaobing.Lu
 * @create 2019-11-13 23:17
 **/
@Slf4j
@Component
public class FanoutMqListener2 implements MessageListener {
    public void onMessage(Message message) {
        System.out.println("fanoutMqConsumer2: " + new String(message.getBody()));
    }
}
