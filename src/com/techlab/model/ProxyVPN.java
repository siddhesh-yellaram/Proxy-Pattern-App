package com.techlab.model;

public class ProxyVPN implements IVPN {
	private RealVPN realVpn;
	private String vpnName;

	public ProxyVPN(String vpnName) {
		this.vpnName = vpnName;
	}

	@Override
	public void display() {
		if(realVpn == null) {
			realVpn = new RealVPN(vpnName);
		}
		realVpn.display();
	}

}
