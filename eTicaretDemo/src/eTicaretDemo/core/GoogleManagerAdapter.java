package eTicaretDemo.core;

import eTicaretDemo.googleLogger.GoogleLoggerManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void googleAdapater(String Message) {
		GoogleLoggerManager googleLoggerManager = new GoogleLoggerManager();
		googleLoggerManager.googleLogger(Message);
		
	}

	

}
