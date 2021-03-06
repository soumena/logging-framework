package com.sa.logprovider.framework.providers;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.sa.logprovider.framework.enums.LogProviderType;

/**
 * @author souadhik
 *
 */
@Lazy
@Service
public class DBLogProviderImpl implements LogProvider{
	
	/**
	 *
	 */
	@Override
	public void Log(String message) {
		System.out.format("\033[33mHello from %s Provider! - %s\n",this.getProvideType(),message);
	}
	
	/**
	 *
	 */
	@Override
	public LogProviderType getProvideType() {
		return LogProviderType.DATABASE;
	}
}
