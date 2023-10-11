import org.springframework.format.annotation.DateTimeFormat;

public class Admin {

    private int idr;
    private String name;
    private String phoneNumber;
    private String officeLocation;
    private DateTimeFormat creationDate;
    private String createdBy;
    private String UpdatedDate;
    private String updatedBy;
    public Admin(int idr, String name, String phoneNumber, String officeLocation, DateTimeFormat creationDate,
            String createdBy, String updatedDate, String updatedBy) {
        this.idr = idr;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.officeLocation = officeLocation;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        UpdatedDate = updatedDate;
        this.updatedBy = updatedBy;
    }
    public int getIdr() {
        return idr;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOfficeLocation() {
        return officeLocation;
    }
    public DateTimeFormat getCreationDate() {
        return creationDate;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public String getUpdatedDate() {
        return UpdatedDate;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setIdr(int idr) {
        this.idr = idr;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
    public void setCreationDate(DateTimeFormat creationDate) {
        this.creationDate = creationDate;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public void setUpdatedDate(String updatedDate) {
        UpdatedDate = updatedDate;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    
}
