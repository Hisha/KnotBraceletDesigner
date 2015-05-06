package com.hishatech.android.knotbraceletdesigner.db.model;

public class Bracelet {

    private Integer id;
    private String name;
    private String creator;
    private String filename;
    private Integer stringcount;
    private Integer rowcount;

    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String Creator) {
        this.creator = Creator;
    }

    public String getFileName() {
        return filename;
    }

    public void setFileName(String FileName) {
        this.filename = FileName;
    }

    public Integer getStringCount() {
        return stringcount;
    }

    public void setStringCount(Integer StringCount) {
        this.stringcount = StringCount;
    }

    public Integer getRowCount() {
        return rowcount;
    }

    public void setRowCount(Integer RowCount) {
        this.rowcount = RowCount;
    }

}
