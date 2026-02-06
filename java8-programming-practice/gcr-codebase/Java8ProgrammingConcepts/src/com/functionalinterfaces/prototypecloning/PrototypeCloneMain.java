package com.functionalinterfaces.prototypecloning;

public class PrototypeCloneMain {

	public static void main(String[] args)
			throws CloneNotSupportedException {

		PrototypeObject original =
				new PrototypeObject("VehicleModelX");

		PrototypeObject copy =
				(PrototypeObject) original.clone();

		System.out.println("Original: "
				+ original.getModel());
		System.out.println("Cloned: "
				+ copy.getModel());
	}
}
