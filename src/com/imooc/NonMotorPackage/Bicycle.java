package com.imooc.NonMotorPackage;

public class Bicycle extends NonMotor {
	//�޲ι��췽��
	public Bicycle(){
		
	}
	 // �ڹ��췽���е��ø����ι��죬������Ը�ֵ
	public Bicycle(String brand,String color){
		super(brand, color);
	}

	// ��д���з�������������Ϊ������һ��**��ɫ�ģ�**�Ƶ����г�������**�������������ṩ
	public String work(){
		String str = "����һ��" + super.getColor() + "��ɫ�ģ�" + super.getBrand() + "�Ƶ����г���";
		return str;
	}

}
