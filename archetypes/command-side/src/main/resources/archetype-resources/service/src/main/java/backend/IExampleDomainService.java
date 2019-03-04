#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.backend;


import io.eventuate.EntityWithIdAndVersion;
import ${package}.domain.Example;


public interface IExampleDomainService
{
   EntityWithIdAndVersion<Example> createExample(
      String exampleUuid,
      String pilotUuid,
      String firstName,
      String middleName,
      String lastName);
}
