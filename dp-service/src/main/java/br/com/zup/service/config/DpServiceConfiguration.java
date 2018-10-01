package br.com.zup.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("br.com.zup.service")
@Import({DpServiceConfiguration.class})
public class DpServiceConfiguration {
}
