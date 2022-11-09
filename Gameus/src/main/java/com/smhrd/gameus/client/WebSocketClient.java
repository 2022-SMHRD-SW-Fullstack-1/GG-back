//package com.smhrd.gameus.client;
//
//import org.springframework.messaging.converter.MappingJackson2MessageConverter;
//import org.springframework.web.socket.client.standard.StandardWebSocketClient;
//import org.springframework.web.socket.messaging.WebSocketStompClient;
//
//public class WebSocketClient {
//
//    private static final String URL = "ws://localhost:8080/websocket";
//
//    public static void main(String[] args) {
//        org.springframework.web.socket.client.WebSocketClient client = new StandardWebSocketClient();
//        WebSocketStompClient stompClient = new WebSocketStompClient(client);
//        stompClient.setMessageConverter(new MappingJackson2MessageConverter());
//
//        stompClient.connect(URL, new EcotrolSessionHandler());
//
//        new Scanner(System.in).nextLine(); // Don't close immediately.
//    }
//}