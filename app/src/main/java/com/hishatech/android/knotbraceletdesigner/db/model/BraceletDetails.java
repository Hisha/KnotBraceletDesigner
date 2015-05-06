package com.hishatech.android.knotbraceletdesigner.db.model;

public class BraceletDetails {

    private Integer id;
    private Integer braceletid;
    private String stringletter;
    private Integer rownumber;
    private String hexcolor;

    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    public Integer getBraceletID() {
        return braceletid;
    }

    public void setBraceletID(Integer BraceletID) {
        this.braceletid = BraceletID;
    }

    public String getStringLetter() {
        return stringletter;
    }

    public void setStringLetter(String StringLetter) {
        this.stringletter = StringLetter;
    }

    public Integer getRowNumber() {
        return rownumber;
    }

    public void setRowNumber(Integer RowNumber) {
        this.rownumber = RowNumber;
    }

    public String getHexColor() {
        return hexcolor;
    }

    public void setHexColor(String HexColor) {
        this.hexcolor = HexColor;
    }

}
