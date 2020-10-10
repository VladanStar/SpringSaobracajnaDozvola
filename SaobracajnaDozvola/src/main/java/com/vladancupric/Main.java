package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Auto automobil = (Auto)context.getBean("automobil");
		Osoba vlasnik = (Osoba)context.getBean("vlasnik");
		SaobracajnaDozvola saobracajnaDozvola = (SaobracajnaDozvola)context.getBean("saobracajnaDozvola");
		System.out.println(saobracajnaDozvola.toString());
		
		
		((FileSystemXmlApplicationContext)context).close();

	}

}
