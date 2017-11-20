package springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xlh.springboot.Application;


/**
 * 该测试用例的运行可能会出现 Could not open ServletContext resource [/applicationContext.xml]错误
 * 首先将PersonService和PersonController中的@Autowired注解注释掉，再将Application中的@ImportResource注解注释掉
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class EmailTest {
    @Autowired
    private JavaMailSender javaMailSender;
    @Test
    public void testSend(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("xxxx@qq.com");//发送者.
        message.setTo("xxxx@163.com");//接收者.
        message.setSubject("测试邮件（邮件主题）");//邮件主题.
        message.setText("这是邮件内容");//邮件内容.
        javaMailSender.send(message);//发送邮件
    }
}



