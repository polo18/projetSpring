package org.example.demo.ticket.webapp.bootstrapping;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ComponentScan("org.example.demo.ticket")
@ImportResource("classpath:/org/example/demo/ticket/webapp/bootstrapContext.xml")
public class SpringConfiguration {

}