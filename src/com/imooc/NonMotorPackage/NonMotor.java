package com.imooc.NonMotorPackage;

public class NonMotor {
	// ˽�����ԣ�Ʒ�ơ���ɫ������(Ĭ��2��)�����Σ�Ĭ�� 1����
	private String brand;
	private String color;
	public int wheel = 2;
	private int seat = 1;
	
	// �޲ι��췽��
	public NonMotor() {
		
	}
	// ˫�ι��췽������ɶ�Ʒ�ƺ���ɫ�ĸ�ֵ
	public NonMotor(String brand, String color) {
		this.setBrand(brand);
		this.setColor(color);
	}

	// �Ĳι��췽�����ֱ���������Ը�ֵ
	public NonMotor(String brand, String color, int wheel, int seat) {
		this.setBrand(brand);
		this.setColor(color);
		this.setWheel(wheel);
		this.setSeat(seat);
	}
   
    // ���е�get***/set***����������Է�װ
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		if(wheel<1){
			this.wheel = 2;
		}else{
			this.wheel = wheel;
		}
		
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		if(seat<=0){
			this.seat = 1;
		}else{
			this.seat = seat;
		}
	}

		// ���������У���������Ϊ������һ��**��ɫ�ģ�**�Ƶķǻ���������**�����ӣ���**�����εķǻ�����������**�������������ṩ
		public String work() {
			String str = "����һ��" + this.getColor() + "��ɫ�ģ�"  + this.getBrand() + "���ӵķǻ���������" + this.getWheel() + "�����εķǻ�������";
			return str;
		}

}
