package dev.elshan.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes().
				route(p -> p.path("/bank/accounts/**").
						filters(f -> f.rewritePath("/bank/accounts/?(?<remaining>.*)","/${remaining}")).
						uri("lb://ACCOUNTS")).
				route(p -> p.path("/bank/cards/**").
						filters(f -> f.rewritePath("/bank/cards/?(?<remaining>.*)","/${remaining}")).
						uri("lb://CARDS")).
				route(p -> p.path("/bank/loans/**").
						filters(f -> f.rewritePath("/bank/loans/?(?<remaining>.*)","/${remaining}")).
						uri("lb://LOANS")).
				build();
	}

}
