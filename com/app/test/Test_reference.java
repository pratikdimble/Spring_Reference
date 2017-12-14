package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.address;
import com.app.model.employee;

public class Test_reference {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/cfgs/config.xml");
			Object ob=ctx.getBean("emp");
				employee e=(employee)ob;
	/*	Object ob=ctx.getBean("addrobj");
		address e=(address)ob;
		employee e1=(employee)ob;
							System.out.println("\t\t"+e1);*/
					System.out.println("\t\t"+e);
					

	}

}
