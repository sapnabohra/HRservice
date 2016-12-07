package com.company.hr.service.representation;



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.company.hr.domain.model.Link;



@XmlRootElement(name = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class EmployeeRepresentation {
	
	private String gid;
	private String lastName;
	private String firstName;
	private List<Link> links = new ArrayList<>();

	public EmployeeRepresentation() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(String url, String rel, String method, String mediaType){
		Link link = new Link();
		link.setUrl(url);
		link.setRel(rel);
		link.setAction(method);
		link.setMediaType(mediaType);
		links.add(link);
	}

}
