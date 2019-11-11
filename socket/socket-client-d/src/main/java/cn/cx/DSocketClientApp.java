package cn.cx;

import cn.cx.socket.MyWebSocketClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author: cn.cn.cx
 * @date : 2019/11/7 17:16
 * @description:
 */
@SpringBootApplication
public class DSocketClientApp {

    public static void main(String[] args) {
        SpringApplication.run(DSocketClientApp.class,args);
    }


    @Bean
    public MyWebSocketClient webSocketClient() {
        try {
            MyWebSocketClient webSocketClient = new MyWebSocketClient(new URI("ws://127.0.0.1:8001/ES/weixinWebSocket"));
            webSocketClient.connect();
            return webSocketClient;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

}
