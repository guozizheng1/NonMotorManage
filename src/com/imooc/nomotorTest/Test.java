package com.imooc.nomotorTest;

import com.imooc.NonMotorPackage.Bicycle;
import com.imooc.NonMotorPackage.ElectricVehicle;
import com.imooc.NonMotorPackage.NonMotor;
import com.imooc.NonMotorPackage.Tricycle;

public class Test {

	public static void main(String[] args) {
		System.out.print("父类信息测试：");
		NonMotor nm = new NonMotor("天宇", "红", 4, 2);
		System.out.println(nm.work());
		System.out.print("自行车类信息测试：");
		Bicycle bi = new Bicycle();
		bi.setBrand("捷安特");
		bi.setColor("黄");
		System.out.println(bi.work());;
		System.out.print("电动车类信息测试：");
		ElectricVehicle ev = new ElectricVehicle();
		ev.setBatteryBrand("飞鸽");
		System.out.println(ev.work());
		System.out.print("三轮车类信息测试：");
		Tricycle tric = new Tricycle();
		System.out.println(tric.work());

	}

}
