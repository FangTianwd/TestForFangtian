package actuator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author jiangshengcheng
 * @date 2021年08月18日 5:29 下午
 */
@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("index1","自定义标签1");
        map.put("index2","自定义标签2");
        builder.up().withDetails(map);
    }
}
