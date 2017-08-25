package me.yling.w5challengeroboresume0825.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Experience
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    @Size(min = 2)
    private String title;
    @NotEmpty
    @Size(min = 2)
    private String company;
    @NotEmpty
    @Size(min = 2)
    private String startdate;
    @NotEmpty
    @Size(min = 2)
    private String enddate;
    @NotEmpty
    @Size(min = 2)
    private String duty1;
    @NotEmpty
    @Size(min = 2)
    private String duty2;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getDuty1() {
        return duty1;
    }

    public void setDuty1(String duty1) {
        this.duty1 = duty1;
    }

    public String getDuty2() {
        return duty2;
    }

    public void setDuty2(String duty2) {
        this.duty2 = duty2;
    }
}
