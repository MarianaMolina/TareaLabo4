package com.example.demo.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message ="ups no puedes agregar un producto porque eres un robot, favor hacer click en regresar")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	

}
