#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.event;


import io.eventuate.Event;
import io.eventuate.EventEntity;


@EventEntity(entity="${package}.domain.Example")
public interface ExampleEvent extends Event
{
}
