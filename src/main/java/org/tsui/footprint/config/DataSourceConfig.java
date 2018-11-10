package org.tsui.footprint.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * 数据库连接池配置类
 *
 * @author cuiyunhong
 */
@Configuration
@MapperScan(basePackages = "org.tsui.footprint")
public class DataSourceConfig {
    private static final Logger LOG = LoggerFactory.getLogger(DataSourceConfig.class);

    /**
     * 阿里巴巴数据库连接池
     */
    private DruidDataSource dataSource;

    @Bean(destroyMethod = "close")
    public DataSource dataSource(@Value("${spring.datasource.username}") String username,
                                 @Value("${spring.datasource.password}") String password) {
        this.dataSource = new DruidDataSource();
        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)) {
            this.dataSource.setUsername(username);
            this.dataSource.setPassword(password);
        }
        LOG.debug("DataSourceConfig_dataSource: Druid datasource has been initialized successfully.");
        return this.dataSource;
    }

    @PreDestroy
    public void close() {
        if (null != this.dataSource) {
            this.dataSource.close();
        }
    }

}
