package com.learnit.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.learnit.repository")
@EntityScan(basePackages = {"com.learnit.model.po"})
@EnableTransactionManagement
public class JpaConfig {
}
