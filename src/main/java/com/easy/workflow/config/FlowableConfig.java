package com.easy.workflow.config;

import org.flowable.engine.ProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowableConfig {

    @Bean
    public ProcessEngineConfiguration processEngineConfiguration(){
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        configuration.setJdbcUrl("jdbc:mysql://rm-uf62h6o3tcrd8bte6.mysql.rds.aliyuncs.com:3306/easy_workflow?allowMultiQueries=true&useUnicode=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&autoReconnect=true&nullCatalogMeansCurrent=true");
        configuration.setJdbcUsername("develop_user");
        configuration.setJdbcPassword("developadmin@123");
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        configuration.setAsyncExecutorActivate(false);
//        configuration.setMailServerHost("mail.my-corp.com");
//        configuration.setMailServerPort(5025);
        return configuration;
    }
}
