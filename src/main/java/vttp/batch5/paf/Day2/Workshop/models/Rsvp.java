package vttp.batch5.paf.Day2.Workshop.models;

import java.util.Date;

public class Rsvp {
    private String email;
    private Integer phone;
    private Date confirmDate;
    private String comments;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Rsvp(String email, Integer phone, Date confirmDate, String comments) {
        this.email = email;
        this.phone = phone;
        this.confirmDate = confirmDate;
        this.comments = comments;
    }

    public Rsvp() {

    }

    @Override
    public String toString() {
        return "Rsvp [email=" + email + ", phone=" + phone + ", confirmDate=" + confirmDate + ", comments=" + comments
                + "]";
    }

}
