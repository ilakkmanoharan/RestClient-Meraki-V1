package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.*;

/* Copyright (C) 2017 Ilakkuvaselvi Manoharan - All Rights Reserved
 * 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Admin {
	
    private String id;
    private String name;
    private String email;
    private String orgAccess;
    private Map<String, String> tags;
   
    public Admin() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getOrgAccess() {
        return orgAccess;
    }

    public void setOrgAccess(String orgAccess) {
        this.orgAccess = orgAccess;
    }
    
    public Map<String,String> getTags() {
        return tags;
    }

    public void setTags(Map<String,String> tags) {
        this.tags = tags;
    }
    
    @Override
    public String toString() {
        return "Admin{" +
        		"id= " + id + '\'' +
        		"name= " + name + '\'' +
        		"email= " + email + '\'' +
        		"orgAccess= " + orgAccess + 
                '}';
    
    
    }
}
