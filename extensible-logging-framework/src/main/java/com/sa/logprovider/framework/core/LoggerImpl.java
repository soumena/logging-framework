package com.sa.logprovider.framework.core;

import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sa.logprovider.framework.enums.LogProviderType;
import com.sa.logprovider.framework.providers.LogProvider;

/**
 * @author souadhik
 *
 */
@Service
public class LoggerImpl implements Logger{

	/**
	 * 
	 */
	@Autowired
	private LogProviderFactory logProviderFactory;


	/**
	 * 
	 */
	@Value("${application.logger.provides}")
	private List<String> allowedProviderTypes;


	/**
	 *
	 */
	@Override
	public void logMessage(String message) {

		allowedProviderTypes
		.forEach(ap->{

			if(EnumUtils.isValidEnum(LogProviderType.class, ap.toUpperCase())) {

				LogProviderType providerType = LogProviderType.valueOf(ap.toUpperCase());				
				LogProvider provider = logProviderFactory.createProvider(message, providerType);

				if(Objects.isNull(provider)) {
					System.out.println("\033[31;1mNo Provider implementation found for Log Provider: " + ap + "!\033[0m");
				}
				else {
					provider.Log(message);
				}
			}
			else {
				System.out.println("\033[31;1mUnknown Provider Type: " + ap + "!\033[0m");	
			}
		});
	}

}
