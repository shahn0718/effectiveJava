package com.effective.rule03;

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
}
