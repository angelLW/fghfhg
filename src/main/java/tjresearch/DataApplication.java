package tjresearch;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;

import com.github.pagehelper.PageHelper;

@SpringBootApplication
public class DataApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}
	


}
