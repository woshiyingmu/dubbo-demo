package com.lxb.mq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author Xiaobing.Lu
 * @create 2019-11-13 23:15
 **/
@Slf4j
@Component
public class FanoutMqListener1 implements MessageListener {
    public void onMessage(Message message) {
        System.out.println("fanoutMqConsumer1: " + new String(message.getBody()));
    }

}
