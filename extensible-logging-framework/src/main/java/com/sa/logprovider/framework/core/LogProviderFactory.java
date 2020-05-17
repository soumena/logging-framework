package com.sa.logprovider.framework.core;

import com.sa.logprovider.framework.enums.LogProviderType;
import com.sa.logprovider.framework.providers.LogProvider;

/**
 * @author souadhik
 *
 */
@FunctionalInterface
public interface LogProviderFactory {
	
	/**
	 * @param message
	 * @param providerType
	 * @return
	 */
	LogProvider createProvider(String message,LogProviderType providerType);
}
