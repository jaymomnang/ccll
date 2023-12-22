package routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import repos.*;
import models.*;
import controllers.*;

@Configuration
public class routers {
    @Bean
    public RouterFunction<ServerResponse> route(NewsletterHandler handler) {
        return RouterFunctions.route(GET("/api/newsletters"), handler::getAllNewsletters)
                .andRoute(GET("/api/newsletters/{title}"), handler::getNewsletterByTitle)
                .andRoute(POST("/api/newsletters"), handler::createNewsletter)
                .andRoute(PUT("/api/newsletters/{id}"), handler::updateNewsletter)
                .andRoute(DELETE("/api/newsletters/{id}"), handler::deleteNewsletter);
    }

}