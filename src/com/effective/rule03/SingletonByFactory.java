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
  
  /*
   *  싱글턴 패턴을 포기하는 상황에서 좀 더 유연하게 작동
   *  정적 팩터리를 사용하면 메소드를 사용하기 때문에, 내부 구현의 변화에 따른 클라이언트 코드의
   *  영향을 줄일 수 있다.
   *  
   *  제네릭 타입을 수용하기에 유용하다.
   *  
   */
}
