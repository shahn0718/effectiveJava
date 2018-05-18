package com.effective.rule03;
/**
 * 
 * @Package Name : com.effective.rule03
 * @FileName : SingletonByFactory.java
 * @Date : 2018. 5. 18. 
 * @User : AHN
 * @Description :
 */
public class SingletonByFactory {

  private static final SingletonByFactory INSTANCE = new SingletonByFactory();
  
  private SingletonByFactory(){
    
  }
  
  public static SingletonByFactory getInstance(){
    return INSTANCE;
  }
  
  public void test(){
    System.out.println("Singleton by factory method");
  }
}
