package com.bingove.layui.config;

/**
 * Criminal 数据源
 *
 * @author sqs
 * @date 2018年3月26日
 */
/*@Configuration
@MapperScan(basePackages = CriminalDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "criminalSqlSessionFactory")
public class CriminalDataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(CriminalDataSourceConfig.class);

    *//**
     * 精确到 criminal 目录，以便跟其他数据源隔离
     *//*
    static final String PACKAGE = "com.xhs.center.dao.a";
    static final String MAPPER_LOCATION = "classpath:mapper/a/*.xml";

    @Bean(name = "criminalDataSource")
    @ConfigurationProperties("spring.datasource.druid.criminal")
    public DataSource criminalDataSource() {
        logger.info("初始化第二个 MySQL 数据源");
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "criminalTransactionManager")
    public DataSourceTransactionManager criminalTransactionManager() {
        return new DataSourceTransactionManager(criminalDataSource());
    }

    @Bean(name = "criminalSqlSessionFactory")
    public SqlSessionFactory criminalSqlSessionFactory(@Qualifier("criminalDataSource") DataSource criminalDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(criminalDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(CriminalDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }


}*/
