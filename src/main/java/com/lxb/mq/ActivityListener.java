package com.lxb.mq;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.utils.SerializationUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.rabbitmq.client.Channel;

import java.io.UnsupportedEncodingException;

/**
 * ${DESCRIPTION}
 *
 * @author Xiaobing.Lu
 * @create 2019-11-10 17:24
 **/

@Slf4j
@Component
public class ActivityListener implements ChannelAwareMessageListener {


    @Transactional
    public void onMessage(Message message,Channel channel) {

        try {
            log.info("message:{}", JSON.toJSON(new String(message.getBody(),"UTF-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
