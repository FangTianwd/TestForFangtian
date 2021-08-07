package template;

import common.BizCallback;
import common.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author jiangshengcheng
 * @date 2021年08月07日 4:42 下午
 */
@Service
public class WebTemplate<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebTemplate.class);

    public CommonResult<T> process(final BizCallback<T> callback){
        final CommonResult<T> result = new CommonResult<>();

        try {
            //对业务参数信息进行检查
            callback.checkParam();

            //这里执行真正的业务逻辑
            T object = callback.doBusiness();

            result.setSuccess(true);
            result.setResultObject(object);

            return result;

        } catch (Exception e) {
            LOGGER.error("执行操作异常", e);

            result.setSuccess(false);
            result.setResultCode("");
            result.setResultMessage(e.getMessage());

            return result;
        }
    }
}
