package com.portal.user.controller;
import com.portal.api.controller.user.HelloControllerApi;
import com.portal.grace.result.GraceJSONResult;
import com.portal.utils.RedisOperator;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.GregorianCalendar;

@RestController
public class HelloController implements HelloControllerApi {
    final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private RedisOperator redis;
    public Object hello(){
        //logger.debug("debug: hello~");
        logger.info("info: hello~");
        logger.warn("warn: hello~");
        logger.error("error: hello~");
        return GraceJSONResult.ok();
    }


    public Object Redis() {
        //logger.debug("debug: hello~");
        redis.set("age","18");
        return GraceJSONResult.ok(redis.get("age"));
    }


}
