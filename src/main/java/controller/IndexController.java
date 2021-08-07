package controller;

import common.BizCallback;
import common.CommonResult;
import manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import template.WebTemplate;

import java.util.List;

/**
 * @author jiangshengcheng
 * @date 2021年08月07日 3:51 下午
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private WebTemplate webTemplate;
    @Autowired
    private UserManager userManager;

    @GetMapping("/index.html")
    public @ResponseBody String index(){
        return "world";
    }
    @GetMapping("user")
    public @ResponseBody CommonResult<List<String>> listUserId(){
        return webTemplate.process(new BizCallback<List<String>>() {
            @Override
            public void checkParam() {

            }

            @Override
            public List<String> doBusiness() {
                return userManager.listUserId();
            }
        });
    }

}
