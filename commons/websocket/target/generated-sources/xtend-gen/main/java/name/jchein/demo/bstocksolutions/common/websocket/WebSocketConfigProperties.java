package name.jchein.demo.bstocksolutions.common.websocket;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("websocket.threads")
@Accessors
@SuppressWarnings("all")
public class WebSocketConfigProperties {
  @Accessors
  public static class ThreadPoolConfigProperties {
    private int coreSize;
    
    private int maxSize;
    
    private int queueCapacity;
    
    @Pure
    public int getCoreSize() {
      return this.coreSize;
    }
    
    public void setCoreSize(final int coreSize) {
      this.coreSize = coreSize;
    }
    
    @Pure
    public int getMaxSize() {
      return this.maxSize;
    }
    
    public void setMaxSize(final int maxSize) {
      this.maxSize = maxSize;
    }
    
    @Pure
    public int getQueueCapacity() {
      return this.queueCapacity;
    }
    
    public void setQueueCapacity(final int queueCapacity) {
      this.queueCapacity = queueCapacity;
    }
  }
  
  private final WebSocketConfigProperties.ThreadPoolConfigProperties inbound = new WebSocketConfigProperties.ThreadPoolConfigProperties();
  
  private final WebSocketConfigProperties.ThreadPoolConfigProperties outbound = new WebSocketConfigProperties.ThreadPoolConfigProperties();
  
  @Pure
  public WebSocketConfigProperties.ThreadPoolConfigProperties getInbound() {
    return this.inbound;
  }
  
  @Pure
  public WebSocketConfigProperties.ThreadPoolConfigProperties getOutbound() {
    return this.outbound;
  }
}
