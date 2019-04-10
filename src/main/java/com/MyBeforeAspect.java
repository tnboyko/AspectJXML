package com;

import org.aspectj.lang.JoinPoint;

public class MyBeforeAspect {

    public void init(JoinPoint jp){
        System.out.println("Операція "+jp.getSignature().getName());
    }

}