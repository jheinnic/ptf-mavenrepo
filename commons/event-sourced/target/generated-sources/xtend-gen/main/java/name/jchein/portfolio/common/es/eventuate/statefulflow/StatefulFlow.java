package name.jchein.portfolio.common.es.eventuate.statefulflow;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import name.jchein.portfolio.common.es.eventuate.statefulflow.StatefulFlowProcessor;
import org.eclipse.xtend.lib.macro.Active;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Active(StatefulFlowProcessor.class)
public @interface StatefulFlow {
}
