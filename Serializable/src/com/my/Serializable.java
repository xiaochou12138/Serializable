package com.my;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public interface Serializable {
	  try {
		  TestBean testBean = new TestBean();
		  testBean.property1 = "属性22882288";
		  testBean.property2 = "属性6666";
		  testBean.desc = "我是testbean";
		  ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/sdcard/aaatest.txt"));
		  objectOutputStream.writeObject(testBean);
	  }catch (IOException e) {
		  e.printStackTrace();
	  }
	  
	


}


