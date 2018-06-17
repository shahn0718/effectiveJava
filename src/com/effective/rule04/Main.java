package com.effective.rule04;
/**
 * 
 * @Package Name : com.effective.rule04
 * @FileName : Main.java
 * @Date : 2018. 6. 17. 
 * @User : AHN
 * @Description : Rule 04
 */
public class Main {

  private Main(){
    // 기본 생성자가 자동 생성되지 못하도록 하여 객체 생성 방지
    throw new AssertionError();
  }
  
  public static void main(String[] args){
    Main main = new Main();
    
  }
}
