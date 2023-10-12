package com.hazrody.pixelWar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketLoggerHandler(), "/ws")
                .setAllowedOrigins("*");
    }
    @Bean
    public WebSocketLoggerHandler webSocketLoggerHandler() {
        return new WebSocketLoggerHandler();
    }

}
