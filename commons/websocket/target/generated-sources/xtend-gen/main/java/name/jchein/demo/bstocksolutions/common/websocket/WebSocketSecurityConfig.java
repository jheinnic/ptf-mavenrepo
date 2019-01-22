package name.jchein.demo.bstocksolutions.common.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.messaging.MessageSecurityMetadataSourceRegistry;
import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer;

@Configuration
@SuppressWarnings("all")
public class WebSocketSecurityConfig extends AbstractSecurityWebSocketMessageBrokerConfigurer {
  @Override
  protected void configureInbound(final MessageSecurityMetadataSourceRegistry messages) {
    messages.anyMessage().permitAll();
  }
  
  /**
   * Disables CSRF for Websockets.
   */
  @Override
  protected boolean sameOriginDisabled() {
    return true;
  }
}
