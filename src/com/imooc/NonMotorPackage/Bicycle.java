package com.imooc.NonMotorPackage;

public class Bicycle extends NonMotor {
	//无参构造方法
	public Bicycle(){
		
	}
	 // 在构造方法中调用父类多参构造，完成属性赋值
	public Bicycle(String brand,String color){
		super(brand, color);
	}

	// 重写运行方法，描述内容为：这是一辆**颜色的，**牌的自行车。其中**的数据由属性提供
	public String work(){
		String str = "这是一辆" + super.getColor() + "颜色的，" + super.getBrand() + "牌的自行车。";
		return str;
	}

}
