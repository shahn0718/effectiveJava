package com.effective.rule03;
/**
 * 
 * @Package Name : com.effective.rule03
 * @FileName : SingletonByStaticBlock.java
 * @Date : 2018. 5. 19. 
 * @User : AHN
 * @Description :
 */

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

  
  /*
   * static 초기화 블록은 클래스가 로딩 될 때 최초 한번만 실행
   * 1번과 비교하여 객체를 생성하기 전에 로직 담을 수 있기 때문에,
   * 객체 생성 로직 또는 에러처리 구문이나 초기변수 셋팅등의 코드 작성이 가능
   * 
   * 클래스가 로드되는 시점에 무조건 객체가 생성된다.
   * 
   * 
   * 
   */
}
