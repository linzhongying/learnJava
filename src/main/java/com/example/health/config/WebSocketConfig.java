package com.example.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;
import java.util.Objects;

@Configuration
public class WebSocketConfig extends ServerEndpointConfig.Configurator{
    @Bean
    public ServerEndpointExporter serverEndpointExporter(){return new ServerEndpointExporter();}

    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        HttpSession httpSession= (HttpSession) request.getHttpSession();

        if (Objects.isNull(httpSession)) {
            throw new NullPointerException("httpSession为空, 请登录!");
        }
        sec.getUserProperties().put("httpSession",httpSession);
    }

}