package com.effective.rule07;
/**
 * 
 * @Package Name : com.effective.rule07
 * @FileName : TerminationMethod.java
 * @Date : 2018. 7. 4. 
 * @User : AHN
 * @Description : 
 */
class FooEx{
  
  FooEx(String name){
    name = this.name;
  }
  
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
public class TerminationMethod {

 
  
  public static void main(String[] args){
    FooEx foo = new FooEx("ASH");
    try{
      
    }finally{
     // foo.terminate();
    }
  }
}
