package com.companyname.springapp.business.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PriceIncrease {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Min(value = 0, message = "El valor debe se mayor o igual a 0")
	@Max(value = 50, message = "El valor debe se menor o igual a 50")
	private int percentage;

	public void setPercentage(int i) {
		percentage = i;
		logger.info("Percentage set to " + i);
	}

	public int getPercentage() {
		return percentage;
	}

}
