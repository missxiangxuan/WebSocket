package cn.cx.socket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: cn.cn.cx
 * @date : 2019/11/7 15:35
 * @description:
 */
@ServerEndpoint("/websocket")
@Component
@Slf4j
public class WebSocketServer{

    private static final ConcurrentHashMap<String, Session> ONLINE_SESSION = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(Session session){
        String sessionId = session.getId();
        ONLINE_SESSION.put(sessionId,session);
        log.info(sessionId+"加入链接服务端 A");
    }

    @OnClose
    public void onClose(Session session) {
        String sessionId = session.getId();
        ONLINE_SESSION.remove(sessionId);
        log.info(sessionId+"断开链接服务端 A");
    }

    /**
     * 向某个用户发送消息
     * @param session 某一用户的session对象
     * @param message
     */
    @OnMessage
    public static void sendMessage(Session session, String message) {
        if(session == null) {
            return;
        }
        RemoteEndpoint.Async async = session.getAsyncRemote();
        //发送消息
        async.sendText(message);
    }



}
