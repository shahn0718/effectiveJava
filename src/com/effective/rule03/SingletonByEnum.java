package com.effective.rule03;

/**
 * 
 * @Package Name : com.effective.rule03
 * @FileName : SingletonByEnum.java
 * @Date : 2018. 5. 18. 
 * @User : AHN
 * @Description : Effective Java 에서 생각하는 유용한 방법
 */
public enum SingletonByEnum {
  INSTANCE;
  
  public void test(){
    System.out.println("Singleton by enum");
  }
  
  /*
   *  열거형을 싱글턴 패턴에 이용하는 방식
   *  원소가 하나인 enum 자료형을 정의 다른 method 들은 class작성과 동일
   *  
   *  단 한번의 인스턴스 생성을 보장하며, 사용이 간편, 직렬화가 자동으로 처리
   *  직렬화가 아무리 복잡하게 이루어져도 여러 객체가 생길 일이 없으며,
   *  리플렉션을 통해 싱글턴을 깨트릴 수도 없다.
   *  
   *  그리고 multi thread 로부터 안전하다
   * 
   */
}
