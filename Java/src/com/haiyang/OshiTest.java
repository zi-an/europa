package com.haiyang;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class OshiTest {
	public static void main(String[] args) {
		SystemInfo systemInfo = new SystemInfo();
		OperatingSystem os = systemInfo.getOperatingSystem();
		HardwareAbstractionLayer hal = systemInfo.getHardware();

		System.out.println(os.getManufacturer() + os.getFamily()
				+ os.getVersion());
		
		System.out.println((hal.getMemory().getAvailable()/(1024*1024))+"M");
		System.out.println(hal.getMemory().getTotal()/(1024*1024)+"M");
		
		System.out.println(hal.getPowerSources()[0].getName());
		System.out.println(hal.getPowerSources()[0].getTimeRemaining());
		
		System.out.println(hal.getProcessors()[0].getIdentifier());
		System.out.println(hal.getProcessors()[0].getVendor());
		//System.out.println(hal.getProcessors()[0].getFamily());
		//System.out.println(hal.getProcessors()[0].getModel());
		//System.out.println(hal.getProcessors()[0].getStepping());
		
	}
}
