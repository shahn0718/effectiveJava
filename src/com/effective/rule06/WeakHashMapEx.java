package com.effective.rule06;

import java.util.WeakHashMap;

/**
 * 
 * @Package Name : com.effective.rule06
 * @FileName : WeakHashMap.java
 * @Date : 2018. 6. 18.
 * @User : AHN
 * @Description : WeakHashMap Example
 */

public class WeakHashMapEx {
  
  
  
  public static void main(String[] args) {
    WeakHashMap<Data, String> map = new WeakHashMap<Data,String>();
    Data dataObj = new Data("FOO");
    map.put(dataObj, dataObj.value);
    System.out.println("map contains dataObject ? " + map.containsKey(dataObj));

    // -- now make someDataObject elligible for garbage collection...
    dataObj = null;

    for (int i = 0; i < 10000; i++) {
      if (map.size() != 0) {
        System.out.println("At iteration " + i 
            + " the map still holds the reference on dataObject");
      } else {
        System.out.println(
            "dataObject has finally been garbage collected at iteration " + i 
            + ", hence the map is now empty");
        break;
      }
    }

  }
  static class Data{
    String value;
    Data(String value){
      this.value = value;
    }
  }
}
