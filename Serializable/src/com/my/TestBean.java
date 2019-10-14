package com.my;

public class TestBean extends BaseBean {
	public String desc;

	@Override
	public String toString() {
		return "TestBean {" +"desc='" + desc + '\'' +", property1='" + property1 + '\'' +", property2='" + property2 + '\'' +'}';
	}
	

}
