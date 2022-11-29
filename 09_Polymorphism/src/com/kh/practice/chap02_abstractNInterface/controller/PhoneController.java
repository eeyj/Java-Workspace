package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {

	private String[] result = new String[2];

	public String[] method() {

		Phone[] p1 = new Phone[2];

		p1[0] = new GalaxyNote9();
		p1[1] = new V40();

		int count = 0;
		for (Phone phone : p1) {

			if (phone instanceof V40) {
				result[count++] = ((V40) phone).printInformation();
			} else {
				result[count++] = ((GalaxyNote9) phone).printInformation();

			}

		}

		return result;

	}

}
