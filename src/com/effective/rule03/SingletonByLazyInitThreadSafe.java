package com.effective.rule03;

public class SingletonByLazyInitThreadSafe {
  
  private static SingletonByLazyInitThreadSafe INSTANCE;
  
  private SingletonByLazyInitThreadSafe() {
    
  }
  
  public static synchronized SingletonByLazyInitThreadSafe getInstance() {
    if(INSTANCE == null)
      INSTANCE = new SingletonByLazyInitThreadSafe();
    
    return INSTANCE;
  }
  
  public void test(){
    
    System.out.println("Singleton by thread safe initialize");
  }
  
}
