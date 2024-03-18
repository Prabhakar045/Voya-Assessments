package com.voya.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstrument {

	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println(song+"playing song using violin");
	}

}
