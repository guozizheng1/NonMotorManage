package com.imooc.NonMotorPackage;

public class ElectricVehicle extends NonMotor {
	// 私有属性：电池品牌
	private String batteryBrand;
	
	//无参构造
	public ElectricVehicle(){
		
	}
	
    // 公有的get***/set***方法完成属性封装
	public String getBatteryBrand() {
		return batteryBrand;
	}

	public void setBatteryBrand(String batteryBrand) {
		this.batteryBrand = batteryBrand;
	}
	// 重写运行方法，描述内容为：这是一辆使用**牌电池的电动车。其中**的数据由属性提供
	public String work(){
		String str = "这是一辆使用" + this.getBatteryBrand() + "牌电池的电动车。";
		return str;
	}

}
