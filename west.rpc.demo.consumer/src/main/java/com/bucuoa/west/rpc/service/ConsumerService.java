package com.bucuoa.west.rpc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	
//	@Autowired
	@Resource(name="echoService2")
	private EchoService echoService;
	
	@Resource(name="echoService3")
	private EchoService echoService3;
	
//	@PostConstruct
//	public void init(){
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//		echoService1 = 	(EchoService)ctx.getBean("echoService1");
//	}
	
	public void print3()
	{
		String result;
		try {
			result = echoService3.echo("hi fk 3");
			
			System.out.println(result);
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}
	
	public void print()
	{
		String result;
		try {
			result = echoService.echo("hi fk");
			
			System.out.println(result);
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//		echoService1 = 	(EchoService)ctx.getBean("echoService1");
//		
//		result = echoService1.echo("hi fk");
			
//		System.out.println(result);
	}

}
