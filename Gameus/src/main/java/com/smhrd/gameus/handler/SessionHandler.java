//package com.smhrd.gameus.handler;
//
//import org.springframework.messaging.simp.stomp.StompCommand;
//import org.springframework.messaging.simp.stomp.StompHeaders;
//import org.springframework.messaging.simp.stomp.StompSession;
//import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SessionHandler extends StompSessionHandlerAdapter {
//
//    /**
//     * The constant logger.
//     */
//    private static final Logger logger = LoggerFactory.getLogger(SessionHandler.class);
//
//    /**
//     * The Session.
//     */
//    private StompSession session;
//
//    /**
//     * After connected.
//     *
//     * @param session          the session
//     * @param connectedHeaders the connected headers
//     */
//    @Override
//    public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
//        logger.info("New session established : " + session.getSessionId());
//        this.session = session;
//
//        subscribe(WS_QUEUE_USER + WS_QUEUE_REPLY);
//        subscribe(WS_QUEUE_USER + WS_QUEUE_ERROR);
//    }
//
//    /**
//     * Handle exception.
//     *
//     * @param session   the session
//     * @param command   the command
//     * @param headers   the headers
//     * @param payload   the payload
//     * @param exception the exception
//     */
//    @Override
//    public void handleException(StompSession session, StompCommand command, StompHeaders headers, byte[] payload, Throwable exception) {
//        logger.error("Got an exception. Reason : {}", exception.getMessage());
//        logger.error("StompHeaders : [{}], Payload : [{}]", headers, new String(payload));
//    }
//
//    /**
//     * Gets payload type.
//     *
//     * @param headers the headers
//     * @return the payload type
//     */
//    @Override
//    public Type getPayloadType(StompHeaders headers) {
//        return SimpleJsonResponse.class;
//    }
//
//    /**
//     * Handle frame.
//     *
//     * @param headers the headers
//     * @param payload the payload
//     */
//    @Override
//    public void handleFrame(StompHeaders headers, Object payload) {
//        SimpleJsonResponse msg = (SimpleJsonResponse) payload;
//        logger.info("Received Message : [{}]", msg);
//    }
//
//    /**
//     * Subscribe.
//     *
//     * @param destination the destination
//     */
//    public synchronized void subscribe(String destination) {
//        session.subscribe(destination, this);
//        logger.debug("[{}] Subscribed.", destination);
//    }
//}