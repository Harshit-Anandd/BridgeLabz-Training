package com.streams.foreach;
import java.util.Arrays;
import java.util.List;

public class IoTSensor {

	public static void main(String[] args) {

		List<Integer> readings =
				Arrays.asList(45, 70, 90, 30);

		readings.stream()
		.filter(r -> r > 60)
		.forEach(System.out::println);
	}
}
