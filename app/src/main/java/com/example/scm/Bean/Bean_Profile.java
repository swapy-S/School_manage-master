package com.example.scm.Bean;

public class Bean_Profile {
    private int SID;
    private String SNAME;
    private String FNAME;
    private String FCONTACT;
    private String MNAME;
    private String MCONTACT;
    private String ADD;
    private String CLASS;
    private String TNAME;
    private String DOB;
    private byte[] studentdisp;

    public byte[] getStudentdisp() {
        return studentdisp;
    }

    public void setStudentdisp(byte[] studentdisp) {
        this.studentdisp = studentdisp;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getTNAME() {
        return TNAME;
    }

    public void setTNAME(String TNAME) {
        this.TNAME = TNAME;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getADD() {
        return ADD;
    }

    public void setADD(String ADD) {
        this.ADD = ADD;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getSNAME() {
        return SNAME;
    }

    public void setSNAME(String SNAME) {
        this.SNAME = SNAME;
    }

    public String getFNAME() {
        return FNAME;
    }

    public void setFNAME(String FNAME) {
        this.FNAME = FNAME;
    }

    public String getFCONTACT() {
        return FCONTACT;
    }

    public void setFCONTACT(String FCONTACT) {
        this.FCONTACT = FCONTACT;
    }

    public String getMNAME() {
        return MNAME;
    }

    public void setMNAME(String MNAME) {
        this.MNAME = MNAME;
    }

    public String getMCONTACT() {
        return MCONTACT;
    }

    public void setMCONTACT(String MCONTACT) {
        this.MCONTACT = MCONTACT;
    }
}
