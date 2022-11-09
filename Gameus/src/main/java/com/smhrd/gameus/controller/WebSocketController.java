//package com.smhrd.gameus.controller;
//
//@Controller
//public class WebSocketController {
//
//    /**
//     * The constant logger.
//     */
//    private static final Logger logger = LoggerFactory.getLogger(WebSocketController.class);
//
//    /**
//     * The Session listener.
//     */
//    @Autowired
//    private EcotrolEventListener sessionListener;
//
//    @Autowired
//    private MemberService memberService;
//
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//
//    @MessageMapping("/test")
//    public void test(SimpMessageHeaderAccessor headerAccessor, final SimpleJsonResponse message) {
//        logger.info("Init - SessionID : [{}], Message : [{}]", headerAccessor.getSessionId(), message);
//    }
//
//    /**
//     * <pre>
//     * 로그인 한 사용자가 웹 소켓 통신을 할 수 있도록 url 정보를 리턴한다.
//     * e.g) /user/queue/alarm/{uuid}
//     * </pre>
//     *
//     * @param headerAccessor
//     * @param message
//     * @return
//     */
//    @MessageMapping("/login")
//    @SendToUser(WS_QUEUE_ALARM)
//    public SimpleJsonResponse login(SimpMessageHeaderAccessor headerAccessor, final SimpleJsonResponse message) {
//        logger.info("Login - SessionID : [{}], Message : [{}]", headerAccessor.getSessionId(), message.toString());
//
//        SimpleJsonResponse response = new SimpleJsonResponse(WS_CODE_LOGIN_RESPONSE);
//        if (message.getResultCode() == WS_CODE_LOGIN) {
//            try {
//                String authToken = (String) message.getData();
//
//                if ("REFRESH_TOKEN".equals(jwtTokenUtil.getAuthFromToken(authToken))) {
//                    throw new Exception("token is not authorized.");
//                }
//
//                String username = jwtTokenUtil.getUsernameFromToken(authToken);
//
//                MemberManagement member = memberService.getMember(username);
//
//                if (member == null) {
//                    throw new Exception("member does not exists.");
//                }
//
//                String uuid = headerAccessor.getSessionId();
//
//                BrowserSession browserSession = new BrowserSession();
//                browserSession.setSessionId(headerAccessor.getSessionId());
//                browserSession.setUserId(member.getId());
//                browserSession.setUuid(uuid);
//
//                // register session
//                sessionListener.registerBrowserSession(browserSession, headerAccessor.getSessionId());
//
//                response.setStatus(true);
//                response.setData(WS_QUEUE_USER + WS_QUEUE_ALARM + "/" + uuid);
//            } catch (Exception e) {
//                logger.error("Unhandled exception occurred while handle /app/login.", e);
//
//                response.setStatus(false);
//                response.setResultMessage(e.getMessage());
//            }
//        } else {
//            response.setStatus(false);
//            response.setResultMessage("Message code must be [" + WS_CODE_LOGIN + "] for /app/login.");
//        }
//
//        return response;
//    }
//
//    /**
//     * Heartbeat.
//     *
//     * @param message the message
//     * @throws Exception the exception
//     */
//    @MessageMapping("/heartbeat")
//    public void heartbeat(SimpMessageHeaderAccessor headerAccessor, final SimpleJsonResponse message) throws Exception {
//        logger.info("Heartbeat - SessionID : [{}], Message : [{}]", headerAccessor.getSessionId(), message);
//    }
//
//    /**
//     * Handle exception string.
//     *
//     * @param exception
//     * @return
//     */
//    @MessageExceptionHandler
//    @SendToUser(WS_QUEUE_ERROR)
//    public String handleException(Throwable exception) {
//        return exception.getMessage();
//    }
//}