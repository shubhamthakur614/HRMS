package com.hrms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_leave")
public class Leaves
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="leave_id")
	private int lid;
	@Column(name="emp_id")
	private int eid;
	@Column(name="leave_Resone")
	private String leaveResone;
	@Column(name="from_Date")
	private String fromDate;
	@Column(name="to_Date")
	private String toDate;
	@Column(name="description")
	private String description;
	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getLeaveResone() {
		return leaveResone;
	}
	public void setLeaveResone(String leaveResone) {
		this.leaveResone = leaveResone;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
