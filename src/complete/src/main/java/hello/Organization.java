package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization {
	
	
    private String id;
    private String name;
    private Admin admin;
    private String samlConsumerUrl;
    private String licenseState;
    private String snmp;
    private String vpnPeers;
    private String networks;
    private String configTemplates;
    private String inventory;
   
    public Organization() {
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
    
    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    public String getSamlConsumerUrl() {
        return samlConsumerUrl;
    }

    public void setSamlConsumerUrl(String samlConsumerUrl) {
        this.samlConsumerUrl = samlConsumerUrl;
    }
  
    public String getLicenseState() {
        return licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }
    
    public String getSnmp() {
        return snmp;
    }

    public void setSnmp(String snmp) {
        this.snmp = snmp;
    }
    
    public String getVpnPeers() {
        return vpnPeers;
    }

    public void setVpnPeers(String vpnPeers) {
        this.vpnPeers = vpnPeers;
    }
    
    public String getListOfNetworks() {
        return networks;
    }

    public void setListOfNetworks(String networks) {
        this.networks = networks;
    }
    
    public String getConfigTemplates() {
        return configTemplates;
    }

    public void setConfigTemplates(String configTemplates) {
        this.configTemplates = configTemplates;
    }
    
    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public String toString() {
        return "Organization{" +
        		"id= " + id + '\'' +
                ", name= " + name + 
                '}';
    
    }
}
