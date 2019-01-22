package name.jchein.portfolio.common.web;


import java.io.File;
import java.time.Duration;
import java.util.Collections;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import name.jchein.portfolio.common.web.filter.ApiCorsFilter;
import name.jchein.portfolio.common.web.util.HttpExceptionHandler;


//@ComponentScan
@Configuration
public class EmbeddedWebApiConfiguration
{
	@Bean
	public ApiCorsFilter corsFilter()
	{
		return new ApiCorsFilter();
	}


	@Bean
	public HttpExceptionHandler httpExceptionHandler()
	{
		return new HttpExceptionHandler();
	}

	@Bean
	public ConfigurableServletWebServerFactory servletContainer() {
	    final TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
	        @Override
	        protected void postProcessContext(Context context) {
	            SecurityConstraint securityConstraint = new SecurityConstraint();
	            SecurityCollection collection = new SecurityCollection();
	            // Other options: "NONE" or "INTEGRAL"

	            collection.addPattern("/*");
	            securityConstraint.setUserConstraint("CONFIDENTIAL");
	            securityConstraint.addCollection(collection);
	            context.addConstraint(securityConstraint);
	        }
	    };

	    tomcat.addAdditionalTomcatConnectors(
	   	 redirectConnector());
	    tomcat.addAdditionalTomcatConnectors(
	   	 secureConnector());
	    tomcat.addAdditionalTomcatConnectors(
	   	 http2Connector());

	    tomcat.setSession(
	   	 persistentSession());

	    return tomcat;
	}

	@Bean
	private Connector redirectConnector() {
	    final Connector connector = new Connector("org.apache.coyote.http11.Http11Nio2Protocol");

	    connector.setScheme("http");
	    connector.setPort(8080);
	    connector.setSecure(false);
	    connector.setRedirectPort(8443);

	    return connector;
	}

	@Bean
	private Connector secureConnector() {
	    final Connector connector = new Connector("org.apache.coyote.http11.Http11Nio2Protocol");

	    connector.setScheme("https");
	    connector.setPort(8443);
	    connector.setSecure(true);

	    return connector;
	}

	@Bean
	private Connector http2Connector() {
	    final Connector connector = new Connector("org.apache.coyote.http2.Http2Protocol");

	    connector.setScheme("http");
	    connector.setPort(9090);
	    connector.setSecure(false);

	    return connector;
	}
	
	private Session persistentSession() {
		final Session session = new Session();
		
		session.setStoreDir(
			new File("/Users/jheinnic/Git/JchPtf/mavenrepo/common/web/target/sessionStore/"));
		session.setPersistent(true);
		session.setTrackingModes(Collections.singleton(Session.SessionTrackingMode.COOKIE));
		session.setTimeout(Duration.ofHours(1));

		return session;
	}
}
