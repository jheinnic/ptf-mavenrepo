package name.jchein.demo.bstocksolutions.common.websocket;

import name.jchein.demo.bstocksolutions.common.websocket.WebSocketConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
@EnableConfigurationProperties(WebSocketConfigProperties.class)
@SuppressWarnings("all")
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
  @Autowired
  private WebSocketConfigProperties poolConfig;
  
  @Override
  public void registerStompEndpoints(final StompEndpointRegistry registry) {
    registry.addEndpoint("/events").withSockJS();
  }
  
  @Override
  public void configureMessageBroker(final MessageBrokerRegistry config) {
    config.enableSimpleBroker("/events");
  }
  
  @Override
  public void configureClientInboundChannel(final ChannelRegistration config) {
    final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    final WebSocketConfigProperties.ThreadPoolConfigProperties inbound = this.poolConfig.getInbound();
    executor.setCorePoolSize(inbound.getCoreSize());
    executor.setMaxPoolSize(inbound.getMaxSize());
    executor.setQueueCapacity(inbound.getQueueCapacity());
    executor.initialize();
    config.taskExecutor(executor);
  }
  
  @Override
  public void configureClientOutboundChannel(final ChannelRegistration config) {
    final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    final WebSocketConfigProperties.ThreadPoolConfigProperties outbound = this.poolConfig.getOutbound();
    executor.setCorePoolSize(outbound.getCoreSize());
    executor.setMaxPoolSize(outbound.getMaxSize());
    executor.setQueueCapacity(outbound.getQueueCapacity());
    executor.initialize();
    config.taskExecutor(executor);
  }
}
