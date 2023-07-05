package com.lhz.springtest.config;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * @author LHZ
 * @date 2023/7/5$ 1$
 */
//@Component
public class BeanClassJobHandler extends IJobHandler {

    @Override
    public ReturnT<String> execute(String param) throws Exception {

        XxlJobLogger.log("bean class jobhandler running...");

        return ReturnT.SUCCESS;

    }

}