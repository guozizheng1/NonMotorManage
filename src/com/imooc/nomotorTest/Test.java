package com.imooc.nomotorTest;

import com.imooc.NonMotorPackage.Bicycle;
import com.imooc.NonMotorPackage.ElectricVehicle;
import com.imooc.NonMotorPackage.NonMotor;
import com.imooc.NonMotorPackage.Tricycle;

public class Test {

	public static void main(String[] args) {
		System.out.print("������Ϣ���ԣ�");
		NonMotor nm = new NonMotor("����", "��", 4, 2);
		System.out.println(nm.work());
		System.out.print("���г�����Ϣ���ԣ�");
		Bicycle bi = new Bicycle();
		bi.setBrand("�ݰ���");
		bi.setColor("��");
		System.out.println(bi.work());;
		System.out.print("�綯������Ϣ���ԣ�");
		ElectricVehicle ev = new ElectricVehicle();
		ev.setBatteryBrand("�ɸ�");
		System.out.println(ev.work());
		System.out.print("���ֳ�����Ϣ���ԣ�");
		Tricycle tric = new Tricycle();
		System.out.println(tric.work());

	}

}
