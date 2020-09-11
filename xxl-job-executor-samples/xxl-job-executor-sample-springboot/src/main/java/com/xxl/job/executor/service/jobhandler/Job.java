package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import com.xxl.job.executor.mail.MailUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
/**
 * @description:
 * @author: Mr.He
 **/
@Component
@Slf4j
public class Job {

    @XxlJob(value = "job")
    public ReturnT<String> job (String param) throws Exception {
        MailUtil.Mail mail = new MailUtil.Mail();
        mail.setFromMail("mrhe98@qq.com");
        mail.setToMail("mrhe98@qq.com");
        mail.setTitle("hello");
        mail.setMsg("你好");
        mail.setType("text/html;charset=UTF-8");
        Thread thread = new Thread(new MailUtil(mail));
        thread.start();
        XxlJobLogger.log("XXL-JOB, Hello World.");
        for (int i = 0; i < 5; i++) {
            log.info("记录日志："+i);
        }
        return ReturnT.SUCCESS;
    }
}
