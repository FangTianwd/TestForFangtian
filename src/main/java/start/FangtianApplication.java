package start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiangshengcheng
 * @date 2021年08月07日 3:34 下午
 */
@MapperScan(basePackages={"dao.mapper"})
@SpringBootApplication(scanBasePackages={"controller","manager","dao.mapper","template"})
public class FangtianApplication {

    public static void main(String[] args) {
        SpringApplication.run(FangtianApplication.class, args);
    }

}
