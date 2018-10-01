package br.com.zup.dp.repository.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "br.com.zup.dp.data")
@EnableJpaRepositories(basePackages = "br.com.zup.dp")
public class DpRepositoryConfiguration {
}
