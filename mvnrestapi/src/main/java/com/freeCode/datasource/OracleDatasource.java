///00000001 OK
package com.freeCode.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import com.zaxxer.hikari.HikariDataSource;

public class OracleDatasource {
	@Bean
	@ConfigurationProperties("app.datasource")
	public HikariDataSource hikariDataSource() {
		return DataSourceBuilder
			   .create()
			   .type(HikariDataSource.class)
			   .build();
	}

}
