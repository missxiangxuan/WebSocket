package cn.cx.socket;


import lombok.extern.slf4j.Slf4j;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * @author: cn.cn.cx
 * @date : 2019/11/7 17:44
 * @description:
 */
@Slf4j
public class MyWebSocketClient extends WebSocketClient {

        public MyWebSocketClient(URI serverUri) {
            super(serverUri);
        }

        @Override
        public void onOpen(ServerHandshake arg0) {
            // TODO Auto-generated method stub
            log.info("客户端A 加入链接");
        }

        @Override
        public void onClose(int arg0, String arg1, boolean arg2) {
            // TODO Auto-generated method stub
            log.info("客户端A 断开链接",arg1);
        }

        @Override
        public void onError(Exception arg0) {
            // TODO Auto-generated method stub
            log.info("客户端A 发生异常",arg0);
        }

        @Override
        public void onMessage(String msg) {
            // TODO Auto-generated method stub
            log.info("-------- 客户端接A 收到接收到服务端数据： " + msg + "--------");
        }


}
