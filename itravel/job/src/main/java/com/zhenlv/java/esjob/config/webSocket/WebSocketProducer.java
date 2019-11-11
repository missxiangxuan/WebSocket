package com.zhenlv.java.esjob.config.webSocket;

import com.zhenlv.java.esjob.mq.annotation.MqProducer;
import com.zhenlv.java.esjob.mq.enums.ProtoEnum;
import com.zhenlv.java.esjob.mq.product.MqBaseProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: cx
 * @date : 2019/11/8 18:23
 * @description:
 */
@MqProducer("WebSocketProducer")
@Slf4j
@Component
public class WebSocketProducer extends MqBaseProducer {
    @Override
    protected void setProducerGroup() {
        defaultMQProducer.setProducerGroup(ProtoEnum.MINIPROGRAM_GRAP_NOTICE.getProducerGroup());
    }
}
