package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bucuoa.west.rpc.service.ConsumerService;
import com.bucuoa.west.rpc.service.EchoService;

public class ConsumerStartUp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		TestService(ctx);
		
		System.out.println("consumer is started");

//		LockSupport.park();
	}

	public static void TestService(ApplicationContext ctx) {
		
		ConsumerService eservice = (ConsumerService) ctx.getBean("consumerService");
		eservice.print();
		eservice.print();
		eservice.print();
		eservice.print();
		eservice.print();
		eservice.print();
		eservice.print();
		eservice.print3();
		eservice.print();
		eservice.print();
		eservice.print3();
		eservice.print();
		eservice.print3();
		eservice.print();
		eservice.print();
		eservice.print3();
		eservice.print();
		eservice.print3();
		eservice.print();
		
		
//		for(int i = 1 ; i<=12; i ++)
		{
//			EchoService service = (EchoService) ctx.getBean("echoService"+i);
//			System.out.println(Thread.currentThread().getName()+":"+service.echo("hah my first rpc!"+i));
//			
//			ConsumerService eservice = (ConsumerService) ctx.getBean("consumerService");
//			eservice.print();
//			System.out.println(Thread.currentThread().getName()+":");
		}
//		EchoService service2 = (EchoService) ctx.getBean("echoService2");
//		System.out.println(service2.echo("hah my second rpc!"));
//		
//		
//		EchoService service3 = (EchoService) ctx.getBean("echoService3");
//		System.out.println(service3.echo("hah my third rpc!"));
	}
}
