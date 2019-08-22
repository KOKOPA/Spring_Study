package com.test02;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

// 메세지 국제화를 위해 사용
// MessageSourceAware 는 번들이 지정한 properties 파일을 setMessageSoure()로 전달한다.

// ResourceBundleMessageSource의 setBaseName()을 통해 전달받은 파일을 setMessageSource()를 자동으로 호출해서 매핑한다.

// MessageSourceAware와 ResourceBundleMessageSource는 쌍으로 사용한다...

public class MemberInfo implements MessageSourceAware {

	// 전달된 properties
	// 변수 = 값을 읽어서 파싱
	private MessageSource message;
	
	// 이 메소드는 생성자 호출과 동시에 작업됨
	public MemberInfo() {
		System.out.println("멤버 생성");
	}
	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("컨테이너가 메세지 설정을 수행중...");
		this.message = messageSource;
	}
	
	
	// 이 메소드는 
	public void display(Locale locale) {
		String name = message.getMessage("member.name", null, locale);
		String birthplace = message.getMessage("member.birthplace", null, locale);
		String hobby = message.getMessage("member.hobby", null, locale);
		String age = message.getMessage("member.age", new Object[] {"13"}, null, locale);
		
		System.out.println(locale);
		System.out.println(name);
		System.out.println(birthplace);
		System.out.println(hobby);
		System.out.println(age);
	}

}



/*

BeanNameAware's setBeanName
BeanClassLoaderAware's setBeanClassLoader
BeanFactoryAware's setBeanFactory
EnvironmentAware's setEnvironment
EmbeddedValueResolverAware's setEmbeddedValueResolver
ResourceLoaderAware's setResourceLoader 						(only applicable when running in an application context)
ApplicationEventPublisherAware's setApplicationEventPublisher 	(only applicable when running in an application context)
MessageSourceAware's setMessageSource 							(only applicable when running in an application context)
ApplicationContextAware's setApplicationContext 				(only applicable when running in an application context)
ServletContextAware's setServletContext 						(only applicable when running in a web application context)
postProcessBeforeInitialization methods of BeanPostProcessors
InitializingBean's afterPropertiesSet
a custom init-method definition
postProcessAfterInitialization methods of BeanPostProcessors

*/











