package strategy.simpleifelse;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 10:47 上午
 * 简单if else可通过实例化bean之后 初始化map 实现
 * 其中Function是可接收参数与返回参数的函数式接口
 */
public class BizService {
    private Map<String, Function<String,String>> checkResultDispatcher = new HashMap<>();

    @PostConstruct
    public void checkResultDispatcherInit(){
        checkResultDispatcher.put("条件一",order -> String.format("%s执行条件一"));
        checkResultDispatcher.put("条件二",order -> String.format("%s执行条件二"));

    }
    public String getCheckResultSuper(String order){
        Function<String, String> function = checkResultDispatcher.get(order);
        if (function != null){
            return function.apply(order);
        }
        return "不在业务处理逻辑范围内";
    }

    public static void main(String[] args) {
        String s = new BizService().getCheckResultSuper("条件一");
        System.out.println(s);
    }
}
