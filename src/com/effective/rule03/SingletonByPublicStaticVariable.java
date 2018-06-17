package com.effective.rule03;
/**
 * 
 * @Package Name : com.effective.rule03
 * @FileName : SingletonByPublicStaticVariable.java
 * @Date : 2018. 5. 19. 
 * @User : AHN
 * @Description :
 */
public class SingletonByPublicStaticVariable {
  public static final SingletonByPublicStaticVariable INSTANCE = new SingletonByPublicStaticVariable();
  
  private SingletonByPublicStaticVariable() {}
  
  public void test(){
    System.out.println("Singleton by public static final variable");
  }
  
  
  /*
   * 클래스가 로드될때 초기화를 통하여 INSTANCE 변수에 객체가 생성되어 할당
   * 선언만 보고 싱글턴 여부를 바로 알 수 있지만, 클래스가 로드될때 항상 객체가 생성
   * 객체가 생성될 때, 에러 처리 불가능, 객체 생성전에 로직이 필요한 경우 사용할 수 없다.
   * 
   */
}
