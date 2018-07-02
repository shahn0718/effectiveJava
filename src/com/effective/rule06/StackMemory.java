package com.effective.rule06;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 
 * @Package Name : com.effective.rule06
 * @FileName : StackMemory.java
 * @Date : 2018. 6. 17. 
 * @User : AHN
 * @Description :
 */
// 자체적으로 관리하는 메모리가 있는 클래스를 만들 때는 메모리 누수가 발생하지 않도록 주의해야한다.
// 캐시(Cache)도 메모리 누수가 흔히 발생하는 장소
// 메모리 누수가 흔히 발견되는  또 한곳은 리스너(listener) 등의 역호출자 (callBack)다. 
public class StackMemory {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;
  
  public StackMemory(){
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }
  
  public void push(Object e){
    ensureCapacity();
    elements[size++] = e;
  }
  
  public Object pop(){
    if(size ==0)
      throw new EmptyStackException();
    Object results = elements[--size];
    elements[size] = null;
    //pop된 객체에 대한 참조는 그 즉시 null로 한다.
    //실수로 그 참조를 사용하더라도 NullPointerException이 발생 -> 오작동 대신 바로 종료된다는 장점
    return results;
  }
  
  /**
   *  적어도 하나 이상의 원소를 담을 공간을 보장한다.
   *  배열의 길이를 늘려야할 때마다 대략 두배씩 늘인다.
   */
  
  private void ensureCapacity(){
    if(elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size + 1);
  }
}
