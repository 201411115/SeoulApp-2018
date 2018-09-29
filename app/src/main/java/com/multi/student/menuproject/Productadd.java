package com.multi.student.menuproject;

public class Productadd {
    private int imgID1;
    private int imgID2;
    private int imgID3;
    private String name;



    public Productadd(int imgID1,int imgID2,int imgID3, String name) {
        this.imgID1 = imgID1;
        this.imgID2 = imgID2;
        this.imgID3 = imgID3;
        this.name = name;


    }



    public int getImgID1() {
        return imgID1;
    }

    public int getImgID2() {
        return imgID2;
    }

    public int getImgID3() {
        return imgID3;
    }

    public String getName() {
        return name;
    }




}
