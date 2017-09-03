package com.zhanlu.meta.web;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/3.
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/test/hello", method = RequestMethod.GET)
    public Map<String, Object> hello() {
        Map<String, Object> resultMap = Maps.newLinkedHashMap();
        resultMap.put("code", 200);
        return resultMap;
    }
}
