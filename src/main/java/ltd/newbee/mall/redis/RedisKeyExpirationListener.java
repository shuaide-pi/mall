package ltd.newbee.mall.redis;

import ltd.newbee.mall.common.Constants;
import ltd.newbee.mall.rabbitmq.RabbitmqConstant;
import org.checkerframework.checker.units.qual.C;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * redis中的key过期时异步回调接口的监听器
 */
@Component
public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public RedisKeyExpirationListener(RedisMessageListenerContainer listenerContainer){
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        String orderKey = message.toString();
        //订单超时信息处理
        if(orderKey.startsWith(Constants.PAY)){
            String[] key = orderKey.split("\\.");
            String orderNo = key[2];
            toMq(orderNo);
        }
    }

    //将过期订单的订单No传到mq中，后台监听并在数据库中进行删除
    private void toMq(String orderNo){
        rabbitTemplate.convertAndSend(RabbitmqConstant.ORDER_EXCHANGE,
                RabbitmqConstant.ORDER_DELETE_ROUTE_KEY,
                orderNo
                );
    }
}
