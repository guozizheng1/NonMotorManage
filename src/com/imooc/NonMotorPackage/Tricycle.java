package com.imooc.NonMotorPackage;

public class Tricycle extends NonMotor {
	// ���޲ι�����ʵ�ֶ���������ֵ�����޸�
	public Tricycle(){
		this.wheel = 3;
	}

	// ��д���з�������������Ϊ�����ֳ���һ����**�����ӵķǻ�����������**�������������ṩ
	public String work(){
		String str = "���ֳ���һ����" + this.wheel + "�����ӵķǻ�������";
		return str;
	}

}
