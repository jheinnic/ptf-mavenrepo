#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package name.jchein.portfolio.services.${parentArtifactId}.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity="name.jchein.portfolio.services.${parentArtifactId}.domain.Example")
public interface ExampleEvent extends Event {
	
}
