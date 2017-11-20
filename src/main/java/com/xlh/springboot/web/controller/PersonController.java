package com.xlh.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xlh.springboot.domain.Person;
import com.xlh.springboot.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@Autowired
    private JavaMailSender javaMailSender;
	
	public PersonController() {
		System.out.println(" 我是 PersonController，我被实例化了 ");
	}

	@RequestMapping("/person")
	public Person test() {
		return personService.getPerson();
	}
	
	@RequestMapping("/freemarker")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("index");//模板文件的名称，不需要指定后缀
        mv.addObject("key","hello freemaker");
        return mv;
    }
	
	@RequestMapping("/sendEmail")
	public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("xxxx@qq.com");//发送者.
        message.setTo("xxxx@163.com");//接收者.
        message.setSubject("测试邮件（邮件主题）");//邮件主题.
        message.setText("这是邮件内容");//邮件内容.
        javaMailSender.send(message);//发送邮件
		return "send email success";
	}
}
