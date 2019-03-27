package pe.com.pelispaceapp.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"pe.com.pelispaceapp.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
//	 Change the below based on the DBMS you choose
//	private final static String DATABASE_URL = "jdbc:postgresql://ec2-23-21-106-241.compute-1.amazonaws.com:5432/du1i2imbpn198?sslmode=require";
//	private final static String DATABASE_DRIVER = "org.postgresql.Driver";
//	private final static String DATABASE_DIALECT = "org.hibernate.dialect.PostgreSQLDialect";
//	private final static String DATABASE_USERNAME = "hgdhskaerhjlfx";
//	private final static String DATABASE_PASSWORD = "4a37c703a11349e29cbd7794c4493cbdf5b30c260d2921876f2c0d49578638fa";
	
	private final static String DATABASE_URL = "jdbc:mysql://us-cdbr-iron-east-03.cleardb.net:3306/heroku_c1c3836146d5a45?reconnect=true";
	private final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME = "b427ac34e4e08b";
	private final static String DATABASE_PASSWORD = "f9e8ea55";
		
		// dataSource bean will be available
		@Bean("dataSource")
		public DataSource getDataSource() {
			
			BasicDataSource dataSource = new BasicDataSource();
			
			// Providing the database connection information
			dataSource.setDriverClassName(DATABASE_DRIVER);
			dataSource.setUrl(DATABASE_URL);
			dataSource.setUsername(DATABASE_USERNAME);
			dataSource.setPassword(DATABASE_PASSWORD);
			return dataSource;
		}

		// sessionFactory bean will be available
		@Bean
		public SessionFactory getSessionFactory(DataSource dataSource) {
			
			LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
			builder.addProperties(getHibernateProperties());
			builder.scanPackages("pe.com.pelispaceapp.dto");
			return builder.buildSessionFactory();
			
		}
		
		// All the hibernate properties will be returned in this method	
		private Properties getHibernateProperties() {
			
			Properties properties = new Properties();
			properties.put("hibernate.dialect", DATABASE_DIALECT);		
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.format_sql", "true");
			
			//properties.put("hibernate.hbm2ddl.auto", "create");
			
			return properties;
		}
		// transactionManager bean
		@Bean
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			return transactionManager;
		}
}
