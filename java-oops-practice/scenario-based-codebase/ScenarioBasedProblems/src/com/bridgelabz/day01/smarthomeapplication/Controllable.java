package com.bridgelabz.day01.smarthomeapplication;

//1. Interface for Control
public interface Controllable {
	void turnOn();
	void turnOff();
	String getStatus();
}