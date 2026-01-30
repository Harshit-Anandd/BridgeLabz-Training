package com.streams.pipedstreams;
import java.io.*;

public class CommunicationManager {
	public void startPipedCommunication() {
		try {
			final PipedOutputStream pos = new PipedOutputStream();
			final PipedInputStream pis = new PipedInputStream(pos);

			Thread writer = new Thread(() -> {
				try {
					String msg = "Hello from Writer Thread!";
					System.out.println("[Writer] Sending: " + msg);
					pos.write(msg.getBytes());
					pos.close();
				} catch (IOException e) { 
					e.printStackTrace(); 
				}
			});

			Thread reader = new Thread(() -> {
				try {
					int data;
					System.out.print("[Reader] Received: ");
					while ((data = pis.read()) != -1) {
						System.out.print((char) data);
					}
					System.out.println();
					pis.close();
				} catch (IOException e) { 
					e.printStackTrace(); 
				}
			});

			writer.start();
			reader.start();

			writer.join();
			reader.join();

		} catch (Exception e) { 
			e.printStackTrace(); 
		}
	}
}