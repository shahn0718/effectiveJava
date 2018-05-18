package com.effective.rule03;

public class SingletonByLazyInit {
  private static SingletonByLazyInit INSTANCE;
  private SingletonByLazyInit() {}
  
  public static SingletonByLazyInit getInstance(){
    if(INSTANCE == null)
      INSTANCE = new SingletonByLazyInit();
    
    return INSTANCE;
  }
  
  public void test() {
    System.out.println("Singleton by lazy Initialization");
  }
}
