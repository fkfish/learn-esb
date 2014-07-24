package com.github.core.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RmiServer {
	
	private static final Logger logger = LoggerFactory.getLogger(RmiServer.class);
	
	public static void main(String[] args) {
		publish();
	}
	
	public static void publish() {
		publish(8888);
	}
	
	public static void publish(int port) {
		try {
			LocateRegistry.createRegistry(port);
		} catch (RemoteException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return;
		}
		
	}

}
