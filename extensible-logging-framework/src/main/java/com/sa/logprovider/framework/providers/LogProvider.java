package com.sa.logprovider.framework.providers;

import com.sa.logprovider.framework.enums.LogProviderType;

/**
 * @author souadhik
 *
 */
public interface LogProvider{
	/**
	 * @param message
	 */
	public void Log(String message);
	/**
	 * @return
	 */
	public LogProviderType getProvideType();
}
