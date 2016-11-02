package com.lin.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * mq消息解耦合，消息监听器
 */
@Component("messageReceiver")
public class MessageConsumer implements MessageListener
{

    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Override
    public void onMessage(Message message)
    {
        // 这里一般调用rpc service 服务
        logger.info("receive message:{}", message);
    }

}
