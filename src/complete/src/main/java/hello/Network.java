package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/* Copyright (C) 2017 Ilakkuvaselvi Manoharan - All Rights Reserved
 * 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Network {
	
    private String id;
    private String organizationId;
    private String type;
    private String name;
    private String timeZone;
    private String tags;
   
    public Network() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getOrgId() {
        return organizationId;
    }

    public void setOrgId(String organizationId) {
        this.organizationId = organizationId;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
    
    @Override
    public String toString() {
        return "Organization{" +
        		"id= " + id + '\'' +
        		"organizationId= " + organizationId + '\'' +
        		", type= " + type + '\'' +
                ", name= " + name + '\'' +
                ", timeZone= " + timeZone + '\'' +
                ", tags= " + tags +
                '}';
    
    
    }
}
