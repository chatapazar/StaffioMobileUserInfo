package userinfo.restclient.dto;

import java.util.List;

public class ListLeaveTransactionDetail {
	private List<StaffioLeaveTransactionDetail> listTran;

	public List<StaffioLeaveTransactionDetail> getListTran() {
		return listTran;
	}

	public void setListTran(List<StaffioLeaveTransactionDetail> listTran) {
		this.listTran = listTran;
	}
}
