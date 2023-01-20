package com.context;

import com.beans.MyBean;
import com.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	/**
	 *
	 * XML, Annotations
	 */
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

			MyBean b1 = context.getBean(MyBean.class);
			System.out.println(b1);
		}

	}

}
