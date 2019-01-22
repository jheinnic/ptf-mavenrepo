package name.jchein.portfolio.services.basic.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity="name.jchein.portfolio.services.basic.domain.Example")
public interface ExampleEvent extends Event {
	
}
