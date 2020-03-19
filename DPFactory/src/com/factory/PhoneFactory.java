package com.factory;

import com.factory.impl.Phone1;
import com.factory.impl.Phone2;
import com.factory.impl.Phone3;

public class PhoneFactory {

	public PhoneFactory() {

	}

	public static Phone getPhone(PhoneName pn, String ram, String storage, String processor, boolean isBluetoothEnabled,
			boolean isWiFiEnabled) {

		switch (pn) {
		case Phone1:
			return new Phone1(ram, storage, processor, isBluetoothEnabled, isWiFiEnabled);
		case Phone2:
			return new Phone2(ram, storage, processor, isBluetoothEnabled, isWiFiEnabled);
		case Phone3:
			return new Phone3(ram, storage, processor, isBluetoothEnabled, isWiFiEnabled);
		default:
			throw new IllegalArgumentException("Unexpected value: " + pn);
		}
	}

}
