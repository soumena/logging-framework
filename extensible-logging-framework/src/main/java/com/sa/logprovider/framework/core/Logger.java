package com.sa.logprovider.framework.core;

/**
 * @author souadhik
 *
 */
@FunctionalInterface
public interface Logger {
	/**
	 * @param message
	 */
	public void logMessage(String message);
}
