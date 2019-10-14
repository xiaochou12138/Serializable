package com.myBean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.text.View;


@SuppressWarnings("serial")
public class TestBean extends BaseBean implements Serializable {
	public String desc;
	public static final int serialVersionUID=1;
	public TestBean(String id){
		super(id);
		
	}
	@Override
	public String toString() {
		return "TestBean {" + " desc='"+desc+'\''+",property1='"+property1+'\''+",property2='"+property2+'\''+",property3="+property3+'}';
		
	}
	private void writeObject(java.io.ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();//先序列化对象
		out.writeUTF(property1);//再序列化父类的域
	    out.writeUTF(property2);
	    out.writeInt(property3); 
	    }
	
	  private void readObject(java.io.ObjectInputStream in)   throws IOException, ClassNotFoundException {
		  in.defaultReadObject();//先反序列化对象
	       property1 = in.readUTF();//再反序列化父类的域
	       property2 = in.readUTF();
	       property3=  in.readInt(); 
		  
	  }
	  public void serialization(View view){
		  try {
			  
	            TestBean testBean = new TestBean("");
	            testBean.property1 = "属性88999988-property1__";
	            testBean.property2 = "属性88999988-property2__";
	            testBean.desc = "我是testbean88999988-desc__";
	            testBean.property3 = 88888803;
	 
	            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/sdcard/aaatest.txt"));
	            objectOutputStream.writeObject(testBean);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 
		  
		  
	  }
	  public void deserialization(View view) {
		  ObjectInputStream objectInputStream = null;
		  try {
	            objectInputStream = new ObjectInputStream(new FileInputStream("/sdcard/aaatest.txt"));
	            TestBean testBean = (TestBean) objectInputStream.readObject();
	            Log.i(TAG,"deserialization"+testBean.toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		  
	  }

}
