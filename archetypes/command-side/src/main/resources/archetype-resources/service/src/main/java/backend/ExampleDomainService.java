#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.backend;


import io.eventuate.EntityWithIdAndVersion;
import io.eventuate.sync.AggregateRepository;
import name.jchein.common.validation.constraints.UUIDString;
import name.jchein.portfolio.common.es.eventuate.IUUIDExtension;

import ${package}.domain.CreateExample;
import ${package}.domain.Example;
import ${package}.domain.ExampleCommand;


public class ExampleDomainService
implements IExampleDomainService
{
   private final AggregateRepository<Example, ExampleCommand> exampleRepository;
   private final IUUIDExtension uuidExtension;


   public ExampleDomainService( AggregateRepository<Example, ExampleCommand> exampleRepository, IUUIDExtension uuidExtension )
   {
      this.exampleRepository = exampleRepository;
      this.uuidExtension = uuidExtension;
   }


   @Override
   public EntityWithIdAndVersion<Example> createExample(
      @UUIDString String exampleUuid,
      @UUIDString String pilotUuid,
      String firstName,
      String middleName,
      String lastName)
   {
      return this.exampleRepository.save(CreateExample.build((bldr) -> {
         bldr.pilotUuid(pilotUuid)
             .firstName(firstName)
             .middleName(middleName)
             .lastName(lastName);
      }), this.uuidExtension.toSaveOptions(exampleUuid));
   }
}
