package com.sa.logprovider.framework.core;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.sa.logprovider.framework.enums.LogProviderType;
import com.sa.logprovider.framework.providers.LogProvider;

/**
 * @author souadhik
 *
 */
@Service
public class LogProviderFactoryImpl extends LogProviderBaseFactory implements LogProviderFactory{

	/**
	 * 
	 */
	private @Autowired @Lazy List<LogProvider> logProviderList;

	/**
	 * Lazy instantiation of the Provider beans based on Provider type
	 */
	@Override
	public LogProvider createProvider(String message,LogProviderType providerType) {

		Optional<LogProvider> filteredlogProvider = logProviderList
				.stream()
				.filter(p->p.getProvideType().equals(providerType)).findFirst();

		return filteredlogProvider.isPresent()?filteredlogProvider.get():null;
	}

}
