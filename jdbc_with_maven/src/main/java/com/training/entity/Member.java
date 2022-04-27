package com.training.entity;

import java.time.LocalDate;

public class Member {
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int memberId, String membername, String memberAddress, LocalDate accountOpenDate,
			String memberShipType, double feespaid, double penaltyAmount) {
		super();
		this.memberId = memberId;
		this.membername = membername;
		this.memberAddress = memberAddress;
		this.accountOpenDate = accountOpenDate;
		this.memberShipType = memberShipType;
		this.feespaid = feespaid;
		this.penaltyAmount = penaltyAmount;
	}
	private int memberId;
	private String membername;
	private String memberAddress;
	private LocalDate accountOpenDate;
	private String memberShipType;
	private double feespaid;
	private double penaltyAmount;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public String getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}
	public double getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(double feespaid) {
		this.feespaid = feespaid;
	}
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", membername=" + membername + ", memberAddress=" + memberAddress
				+ ", accountOpenDate=" + accountOpenDate + ", memberShipType=" + memberShipType + ", feespaid="
				+ feespaid + ", penaltyAmount=" + penaltyAmount + "]";
	}
	

}
