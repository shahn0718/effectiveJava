package com.effective.rule07;
/**
 * 
 * @Package Name : com.effective.rule07
 * @FileName : Foo.java
 * @Date : 2018. 7. 4. 
 * @User : AHN
 * @Description :
 */
public class Foo {
  private final Object finalizerGuardian = new Object() {
    @Override protected void finalize() throws Throwable{
      //바깥 Foo 객체를 종료시킴
    }
  };
  // .. 이하생략
}
