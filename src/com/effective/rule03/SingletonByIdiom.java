package com.effective.rule03;
/**
 * 
 * @Package Name : com.effective.rule03
 * @FileName : SingletonByIdiom.java
 * @Date : 2018. 5. 19. 
 * @User : AHN
 * @Description :
 */

public class SingletonByIdiom {

  private SingletonByIdiom() {}
  
  private static class Singleton {
    private static final SingletonByIdiom INSTANCE = new SingletonByIdiom();
  }
  
  public static SingletonByIdiom getInstance(){
    return Singleton.INSTANCE;
  }
  
  public void test(){
    System.out.println("Singleton By Idiom");
  }
  /*
   * 
   * 클래스 로드 시점에 초기화 되지만, 정적 클래스로 정의된 내부 클래스의 초기화는 해당 시점에 이뤄지지 않는 특성
   * 즉, getInstance를 통해 내부 클래스의 instance를 호출할 때, 뒤늦게 초기화 되어 객체를 할당
   * 
   * 이 방식이 thread safe 한 이유는 jvm의 클래스 초기화 과정에서 보장되는 원자적 특성을 이용
   * 
   * 
   * 
   */
}
