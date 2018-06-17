package com.effective.rule03;
/**
 * 
 * @Package Name : com.effective.rule03
 * @FileName : SingletonByLazyInitThreadSafe.java
 * @Date : 2018. 5. 19. 
 * @User : AHN
 * @Description :
 */
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
  /*
   * 
   * getInstance method에 synchronized 를 선언해 여러 thread가 동시에 접근하지 못하도록 한다.
   * 
   * 역시 thread가 getInstance를 호출하게 되면 높은 비용으로 프로그램 성능 저하
   * 
   * 
   * 
   * 
   */
}
