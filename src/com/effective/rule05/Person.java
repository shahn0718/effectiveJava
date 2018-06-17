package com.effective.rule05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @Package Name : com.effective.rule05
 * @FileName : Person.java
 * @Date : 2018. 6. 17. 
 * @User : AHN
 * @Description :
 */
public class Person {
  /*
  private final Date birthDate;
  
 
  
  //다른 필드와 메서드, 생성자는 생략
  
  
  public boolean isBabyBoomer(){
    
    Calendar gmtCal =Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    // 생성 비용이 높은 객체를 쓸데없이 생산한다.
    gmtCal.set(1946, Calendar.JANUARY, 1,0,0,0);
    Date boomStart = gmtCal.getTime();
    gmtCal.set(1965, Calendar.JANUARY, 1,0,0,0);
    Date boomEnd = gmtCal.getTime();
    
    return birthDate.compareTo(boomStart) >= 0 &&
        birthDate.compareTo(boomEnd) < 0;
  }
  */
}
