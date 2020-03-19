package com.client;

import com.factory.PhoneFactory;
import com.factory.PhoneName;

public class Client {

	public static void main(String[] args) {

		System.out.println(PhoneFactory.getPhone(PhoneName.Phone1, "2", "2", "normal", false, false));
		System.out.println(PhoneFactory.getPhone(PhoneName.Phone2, "4", "4", "good", true, false));
		System.out.println(PhoneFactory.getPhone(PhoneName.Phone3, "6", "6", "Excellent", true, true));

	}

}
