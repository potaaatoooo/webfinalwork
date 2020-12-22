package com.ly.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
    private String gid;

    private String gbarcode;

    private String gname;

    private String gclass1;

    private String gclass2;

    private BigDecimal gprimprice;

    private BigDecimal glowestprice;

    private BigDecimal gadprice;

    private String gspeci;

    private String gorigin;

    private String gunit;

    private String gsupply;

    private String gstatus;

    private static final long serialVersionUID = 1L;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public String getGbarcode() {
        return gbarcode;
    }

    public void setGbarcode(String gbarcode) {
        this.gbarcode = gbarcode == null ? null : gbarcode.trim();
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGclass1() {
        return gclass1;
    }

    public void setGclass1(String gclass1) {
        this.gclass1 = gclass1 == null ? null : gclass1.trim();
    }

    public String getGclass2() {
        return gclass2;
    }

    public void setGclass2(String gclass2) {
        this.gclass2 = gclass2 == null ? null : gclass2.trim();
    }

    public BigDecimal getGprimprice() {
        return gprimprice;
    }

    public void setGprimprice(BigDecimal gprimprice) {
        this.gprimprice = gprimprice;
    }

    public BigDecimal getGlowestprice() {
        return glowestprice;
    }

    public void setGlowestprice(BigDecimal glowestprice) {
        this.glowestprice = glowestprice;
    }

    public BigDecimal getGadprice() {
        return gadprice;
    }

    public void setGadprice(BigDecimal gadprice) {
        this.gadprice = gadprice;
    }

    public String getGspeci() {
        return gspeci;
    }

    public void setGspeci(String gspeci) {
        this.gspeci = gspeci == null ? null : gspeci.trim();
    }

    public String getGorigin() {
        return gorigin;
    }

    public void setGorigin(String gorigin) {
        this.gorigin = gorigin == null ? null : gorigin.trim();
    }

    public String getGunit() {
        return gunit;
    }

    public void setGunit(String gunit) {
        this.gunit = gunit == null ? null : gunit.trim();
    }

    public String getGsupply() {
        return gsupply;
    }

    public void setGsupply(String gsupply) {
        this.gsupply = gsupply == null ? null : gsupply.trim();
    }

    public String getGstatus() {
        return gstatus;
    }

    public void setGstatus(String gstatus) {
        this.gstatus = gstatus == null ? null : gstatus.trim();
    }
}