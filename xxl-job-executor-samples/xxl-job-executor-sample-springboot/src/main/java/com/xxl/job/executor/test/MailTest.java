package com.xxl.job.executor.test;

import com.xxl.job.executor.mail.MailUtil;

import javax.mail.MessagingException;
import java.security.GeneralSecurityException;

/**
 * @description: 邮件测试
 * @author: Mr.He
 **/
public class MailTest {
    public static void main(String[] args) throws GeneralSecurityException, MessagingException {
        MailUtil.sendMailImageAndSlave("mrhe98@qq.com","mrhe98@qq.com","这是邮件标题","这是邮件内容","text/html;charset=UTF-8");
    }
}
