package com.portal.admin.controller;

import com.portal.api.controller.user.HelloControllerApi;
import com.portal.grace.result.GraceJSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloControllerApi {

    final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    public Object hello() {
        return GraceJSONResult.ok();
    }

    @Override
    public Object Redis() {
        return null;
    }

}
