package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SimpleCalculator calculator = (SimpleCalculator) context.getBean("simpleCalc");
        int res1= calculator.add(10, 5);
        System.out.println("Результатом додавання є "+res1);
        int res2= calculator.subtract(10, 5);
        System.out.println("Результатом віднімання є "+res2);
    }
}
