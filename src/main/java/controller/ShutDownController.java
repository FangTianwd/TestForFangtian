package controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangshengcheng
 * @date 2021年08月18日 5:05 下午
 */
@RestController
public class ShutDownController implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @GetMapping(value = "shutdown")
    public void shutdown(){
        ConfigurableApplicationContext cyx = (ConfigurableApplicationContext) this.context;
        cyx.close();
    }

}
