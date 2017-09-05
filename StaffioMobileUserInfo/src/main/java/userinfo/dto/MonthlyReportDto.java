package userinfo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class MonthlyReportDto extends SimpleDto implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -8597899463823064952L;

	private String monthly;
	private BigDecimal amount;
	public String getMonthly() {
		return monthly;
	}
	public void setMonthly(String monthly) {
		this.monthly = monthly;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

}
