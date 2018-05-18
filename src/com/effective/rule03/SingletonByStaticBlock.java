package com.effective.rule03;

public class SingletonByStaticBlock {
  
  private static final SingletonByStaticBlock INSTANCE;
  static {
    INSTANCE = new SingletonByStaticBlock();
  }
  
  public static SingletonByStaticBlock getInstance(){
    return INSTANCE;
  }
  
  public void test(){
    System.out.println("Singleton by static block");
  }
}
