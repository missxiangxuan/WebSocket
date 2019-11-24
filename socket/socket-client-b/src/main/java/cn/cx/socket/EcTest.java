package cn.cx.socket;

import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

public class EcTest {
    public static String initmsg = "{'cmd':'login','data':{'username':'xinji','password':'PASSWORD'}}"
            .replaceAll("'", "\"").replaceAll("PASSWORD", "1402");
    public static void main(String[] args) throws URISyntaxException {
        System.out.println("Start");
        new SimpleWss(new URI("wss://127.0.0.1:8001/socketserver/websocket")) {
            @Override
            public void onClose(int arg0, String arg1, boolean arg2) {
                System.out.println("onClose");
            }

            @Override
            public void onError(Exception arg0) {
                System.out.println("onError");

            }

            @Override
            public void onMessage(String arg0) {
                System.out.println("onMessage");
                this.send(arg0);
            }

            @Override
            public void onOpen(ServerHandshake arg0) {
                System.out.println("onOpen");
                this.send(initmsg);
            }}.connect();

    }

}
