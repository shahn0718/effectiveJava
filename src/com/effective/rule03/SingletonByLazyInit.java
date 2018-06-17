package com.effective.rule03;
/**
 * 
 * @Package Name : com.effective.rule03
 * @FileName : SingletonByLazyInit.java
 * @Date : 2018. 5. 19. 
 * @User : AHN
 * @Description :
 */

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
  
  /*
   *  객체는 getInstance 메소드 실행되고 객체가 생성 된 적이 없어야만 객체가 생성된다.
   *  동일시점에 getInstance가 호출될 때, 가령 multi thread 환경에서
   *  객체가 두개 이상 생성될 가능성이 있다.
   * 
   */
}
