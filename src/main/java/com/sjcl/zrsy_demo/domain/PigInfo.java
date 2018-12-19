package com.sjcl.zrsy_demo.domain;

/**
 * 后备公猪
 */
public class PigInfo {
    private String earId;
    private String breed;
    private String column;
    private String ringNumber;
    private String matingWeek;
    private String remarks;
    private String pigstyId;
    private String ERC721ID;

    public PigInfo() {
    }

    public String getPigstyId() {
        return pigstyId;
    }

    public void setPigstyId(String pigstyId) {
        this.pigstyId = pigstyId;
    }

    public String getEarId() {
        return earId;
    }

    public void setEarId(String earId) {
        this.earId = earId;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }

    public String getMatingWeek() {
        return matingWeek;
    }

    public void setMatingWeek(String matingWeek) {
        this.matingWeek = matingWeek;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getERC721ID() {
        return ERC721ID;
    }

    public void setERC721ID(String ERC721ID) {
        this.ERC721ID = ERC721ID;
    }
}
