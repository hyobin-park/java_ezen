package com.mycompany.ch07.first;

public class MobilePhoneEx {

	public static void main(String[] args) {

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.powerOn();
		
		Mobile mobile = new Mobile();
		
		mobile.powerOff();
		mobile.changeChannelDmb(1);
		mobile.aaa();
		
	}

}
