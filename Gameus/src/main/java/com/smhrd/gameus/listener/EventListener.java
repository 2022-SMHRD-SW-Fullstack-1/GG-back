//package com.smhrd.gameus.listener;
//
//@Component
//public class EventListener {
//
//    private static final Logger logger = LoggerFactory.getLogger(EventListener.class);
//
//    private static Map<String, BrowserSession> browserSessionMap = new ConcurrentHashMap<String, BrowserSession>();
//
//    /**
//     * Handle session connected events.
//     *
//     * @param event the event
//     */
//    @EventListener
//    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
//        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
//
//        //GenericMessage msg = (GenericMessage) headerAccessor.getMessageHeaders().get("simpConnectMessage");
//
//        logger.info("Received a new web socket connection. Session ID : [{}]", headerAccessor.getSessionId());
//    }
//
//    /**
//     * Handle session disconnected events.
//     *
//     * @param event the event
//     */
//    @EventListener
//    public void handleWebSocketDisConnectListener(SessionDisconnectEvent event) {
//        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
//
//        String sessionId = findBrowserSessionId(headerAccessor.getSessionId());
//        if(sessionId != null) {
//            browserSessionMap.remove(headerAccessor.getSessionId());
//        }
//
//        logger.info("Web socket session closed. Message : [{}]", event.getMessage());
//    }
//
//    /**
//     * Find session id by session id.
//     *
//     * @param sessionId
//     * @return
//     */
//    public String findBrowserSessionId(String sessionId) {
//        String session = null;
//
//        for (Map.Entry<String, BrowserSession> entry : browserSessionMap.entrySet()) {
//            if (entry.getKey().equals(sessionId)) {
//                session = entry.getKey();
//            }
//        }
//
//        return session;
//    }
//
//    /**
//     * Register browser session.
//     *
//     * @param browserSession the browser session
//     * @param sessionId      the session id
//     */
//    public synchronized void registerBrowserSession(BrowserSession browserSession, String sessionId) {
//        browserSessionMap.put(sessionId, browserSession);
//    }
//
//    /**
//     * Find session ids by user name list.
//     *
//     * @param username the member id
//     * @return the list
//     */
//    public List<String> findSessionIdsByMemberId(String username) {
//        List<String> sessionIdList = new ArrayList<String>();
//
//        for (Map.Entry<String, BrowserSession> entry : browserSessionMap.entrySet()) {
//            if (entry.getValue().getUserId().equals(username)) {
//                sessionIdList.add(entry.getKey());
//            }
//        }
//
//        return sessionIdList;
//    }
//
//    /**
//     * Create headers message headers.
//     *
//     * @param sessionId the session id
//     * @return the message headers
//     */
//    public MessageHeaders createHeaders(String sessionId) {
//        SimpMessageHeaderAccessor headerAccessor = SimpMessageHeaderAccessor.create(SimpMessageType.MESSAGE);
//        headerAccessor.setSessionId(sessionId);
//        headerAccessor.setLeaveMutable(true);
//
//        return headerAccessor.getMessageHeaders();
//    }
//}