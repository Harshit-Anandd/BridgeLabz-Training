package com.functionalinterfaces.prototypecloning;

//Prototype class implementing Cloneable
public class PrototypeObject implements Cloneable {

	private String model;

	public PrototypeObject(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	@Override
	protected Object clone()
			throws CloneNotSupportedException {

		return super.clone();
	}
}
