package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		// TODO Auto-generated method stub
		return  Arrays.asList("Noodels","snake","cockroach");
	}

}
