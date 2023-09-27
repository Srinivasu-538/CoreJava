package com.dl.encap;

public class RegisterImpl extends Register{

	public static void main(String[] args) {
		
		RegisterImpl impl = new RegisterImpl();
		impl.setFname("srini");
		impl.setLname("vasu");
		impl.setGender('M');
		impl.setAge(22);
		
		System.out.println(impl.getFname());
		System.out.println(impl.getLname());
		System.out.println(impl.getGender());
		System.out.println(impl.getAge());
		

		
	}
	

}
