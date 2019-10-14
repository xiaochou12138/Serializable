package com.my;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public interface deserialization {
	
	ObjectInputStream objectInputStream = null;
	try {
		objectInputStream = new ObjectInputStream(new FileInputStream("/sdcard/aaatest.txt"));
		TestBean testBean = (TestBean) objectInputStream.readObject();
		 Log.i(TAG,"deserialization"+testBean.toString());
	}catch (Exception e) {

        e.printStackTrace();
	}

}
