package com.effective.rule03;

public class SingletonByPublicStaticVariable {
  public static final SingletonByPublicStaticVariable INSTANCE = new SingletonByPublicStaticVariable();
  
  private SingletonByPublicStaticVariable() {}
  
  public void test(){
    System.out.println("Singleton by public static final variable");
  }
  
}
