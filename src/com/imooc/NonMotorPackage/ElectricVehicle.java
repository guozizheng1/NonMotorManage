package com.imooc.NonMotorPackage;

public class ElectricVehicle extends NonMotor {
	// ˽�����ԣ����Ʒ��
	private String batteryBrand;
	
	//�޲ι���
	public ElectricVehicle(){
		
	}
	
    // ���е�get***/set***����������Է�װ
	public String getBatteryBrand() {
		return batteryBrand;
	}

	public void setBatteryBrand(String batteryBrand) {
		this.batteryBrand = batteryBrand;
	}
	// ��д���з�������������Ϊ������һ��ʹ��**�Ƶ�صĵ綯��������**�������������ṩ
	public String work(){
		String str = "����һ��ʹ��" + this.getBatteryBrand() + "�Ƶ�صĵ綯����";
		return str;
	}

}
