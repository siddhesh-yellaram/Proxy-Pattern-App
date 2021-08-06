package com.techlab.model;

public class RealVPN implements IVPN{

	private String vpnName;
	
	public RealVPN(String vpnName) {
		this.vpnName = vpnName;
		loadFromFile(vpnName);
	}

	@Override
	public void display() {
		System.out.println("Connected "+vpnName+" VPN To Server!!!");
	}
	
	public void loadFromFile(String vpnName) {
		System.out.println("Loading "+vpnName+" VPN File!!!");
	}
}
