package com.example.community.config;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import javax.websocket.EndpointConfig;

@ServerEndpoint(value="/chat/{user}",configurator=WebSocketConfig.class)
@Component
public class WebSocketServer {

    /*private ChatMessageService chatMessageService;*/
    private Session session;
    // 使用map来收集session，key为roomName，value为同一个房间的用户集合
    // concurrentMap的key不存在时报错，不是返回null
    // Map列表下有多个Set房间，Set房间有多个Session用户
    private static final Map<String, Session> doctor = new ConcurrentHashMap<String,Session>();
    private static final Map<String, Session> student = new ConcurrentHashMap<String, Session>();

    // 用户进入房间
    // 房间名称，操作id 1 代表创建 2代表加入  request获取登录用户 session获取在线用户
    @OnOpen
    public void onOpen(@PathParam("roomName") String roomName, Session session,EndpointConfig config) throws IOException {
         /*HttpSession httpSession = (HttpSession) session.getUserProperties().get("httpSession");
         User user = (User)httpSession.getAttribute("user");
        //User user = (User) session.getUserProperties().get("httpSession");
        // 将session按照房间名来存储，将各个房间的用户隔离
        if (!rooms.containsKey(roomName)) {
            // 创建房间不存在时，创建房间
            Set<Session> room = new HashSet<>();
            // 添加用户
            room.add(session);
            users.put(session,user.getUsername());
            rooms.put(roomName, room);
        } else {
            // 房间已存在，直接添加用户到相应的房间
            rooms.get(roomName).add(session);
            users.put(session,user.getUsername());
        }
        httpSession =(HttpSession)config.getUserProperties().get("httpSession");
        ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(httpSession.getServletContext());
        chatMessageService = (ChatMessageService) context.getBean("chatMessageServiceImpl");*/
    }

    @OnClose
    public void disConnect(@PathParam("roomName") String roomName, Session session) {
        /*System.out.println("用户退出");
        users.remove(session);
        rooms.get(roomName).remove(session);
        // 房间没人 关闭房间
        if(rooms.get(roomName).size()==0){
            rooms.remove(roomName);
        }
        System.out.println("a client has disconnected!");
        */
    }

    @OnMessage
    public void receiveMsg(@PathParam("roomName") String roomName,
                           String msg, Session session) throws Exception {
  /*      System.out.println("sendMess");
        //创建时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        String message;
        //可以在此保存数据到数据库
        chatMessageService.saveMessage(users.get(session),roomName,"<div class='mess_left'>发送人:" + users.get(session) + ",时间" + time + " ->" + msg + "</div>");
        for (Session session1 : rooms.get(roomName)) {
            message = "<div class='mess_left'>发送人:" + users.get(session) + ",时间" + time + " ->" + msg + "</div>";
            //发送
            session1.getBasicRemote().sendText(message);
        }*/

    }
/*
    public static boolean getRoom(String roomName){
        return rooms.containsKey(roomName);
    }

    // 获取某个房间的在线成员
    public static List<String> getOnlineUser(String roomName){
        List<String> list = new ArrayList<String>();
        Set<Session> sessions = rooms.get(roomName);
        for(Session u : sessions){
            list.add(users.get(u));
        }
        return list;
    }*/
}