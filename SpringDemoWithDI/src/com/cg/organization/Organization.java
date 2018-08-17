package com.cg.organization;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.cg.organization.pojo.Address;

public class Organization {
	private String name;
	private Address address;
	private double marketValue;
	private LocalDate established;
	private int employeeCount;
	private Set<String> globalPresence;
	private List<String> boardMembers;
	private Map<String,String> projectManager;
	private Properties proxyServer ;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	public Organization() {
		
	}
	
	
	public Organization(String name, Address address, double marketValue, String established, int employeeCount) {
		this.name = name;
		this.address = address;
		this.marketValue = marketValue;
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.established = LocalDate.parse(established, dateTimeFormatter); 
		
		this.employeeCount = employeeCount;
	}
	
	
	public void setProxyServer(Properties p) {
		this.proxyServer = p;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public LocalDate getEstablished() {
		return established;
	}
	public void setEstablished(LocalDate established) {
		this.established = established;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public Set<String> getGlobalPresence() {
		return globalPresence;
	}
	public void setGlobalPresence(Set<String> globalPresence) {
		this.globalPresence = globalPresence;
	}
	public List<String> getBoardMembers() {
		return boardMembers;
	}
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}
	public Map<String, String> getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Map<String, String> projectManager) {
		this.projectManager = projectManager;
	}
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", established="
				+ established + ", employeeCount=" + employeeCount + ", globalPresence=" + globalPresence
				+ ", boardMembers=" + boardMembers + ", projectManager=" + projectManager + ", proxyServer="
				+ proxyServer + "]";
	}
	
	
	
}
