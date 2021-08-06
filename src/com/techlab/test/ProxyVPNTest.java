package com.techlab.test;

import com.techlab.model.IVPN;
import com.techlab.model.ProxyVPN;

public class ProxyVPNTest {

	public static void main(String[] args) {
		IVPN vpn = new ProxyVPN("Nord");
		
		//vpn.exe file loaded from disk.
		vpn.display();
		
		//vpn.exe file not be loaded from disk as it is already loaded or initialized.
		vpn.display();
	}

}
