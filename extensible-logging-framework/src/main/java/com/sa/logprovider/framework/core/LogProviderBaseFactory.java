package com.sa.logprovider.framework.core;

import com.sa.logprovider.framework.enums.LogProviderType;
import com.sa.logprovider.framework.providers.LogProvider;

/**
 * @author souadhik
 *
 */
public abstract class LogProviderBaseFactory {
	/**
	 * @param message
	 * @param providerType
	 * @return
	 */
	public abstract LogProvider createProvider(String message,LogProviderType providerType);
}
