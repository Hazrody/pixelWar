package com.hazrody.pixelWar.configuration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazrody.pixelWar.dao.entity.Pixel;
import com.hazrody.pixelWar.services.PixelService;
import com.hazrody.pixelWar.services.WebSocketSessionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class WebSocketLoggerHandler extends TextWebSocketHandler {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    PixelService pixelService;

    @Autowired
    WebSocketSessionsService webSocketSessionsService;

    public WebSocketLoggerHandler() {
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        webSocketSessionsService.addSession(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        webSocketSessionsService.removeSession(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) {
        String messageText = message.getPayload();
        System.out.println("Message WebSocket reçu : " + messageText);
        try {
            JsonNode jsonNode = objectMapper.readTree(messageText);
            pixelService.savePixel(new Pixel(jsonNode.get("x").asInt(), jsonNode.get("y").asInt(), jsonNode.get("color").asText()));
            webSocketSessionsService.broadcast(jsonNode.toString());
        } catch (Exception e) {
            System.out.println("Erreur lors de la désérialisation JSON : " + e.getMessage());
        }
    }
}
