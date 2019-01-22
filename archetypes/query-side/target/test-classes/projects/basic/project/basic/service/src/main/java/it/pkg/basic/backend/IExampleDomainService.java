package name.jchein.portfolio.services.basic.backend;

import io.eventuate.EntityWithIdAndVersion;
import name.jchein.portfolio.services.basic.domain.Example;

public interface IExampleDomainService
{

	EntityWithIdAndVersion<Example> createExample(
		String exampleUuid,
		String pilotUuid,
		String firstName,
		String middleName,
		String lastName);

}
