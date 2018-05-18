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
}
