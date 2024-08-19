package com.nguyenvukha.oop;

public class CaChuon extends LopCa {
    public String colorEye;
    public String colorSkin;

    public CaChuon() {}

    public CaChuon(String colorEye, String colorSkin, String colorEyeParent, String colorSkinParent) {
        this.colorEye = colorEye;
        this.colorSkin = colorSkin;
        super.colorEye = colorEyeParent;
        super.colorSkin = colorSkinParent;
    }

    public String getColorEye() {
        return "Children: " + colorEye + " Parent: " + super.getColorEye();
    }

    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;
    }

    public String getColorSkin() {
        return "Children: " + colorSkin + " Parent: " + super.getColorSkin();
    }

    public void setColorSkin(String colorSkin) {
        this.colorSkin = colorSkin;
    }

    @Override
    public void boiFunction() {
        System.out.println("Cá chuồn bơi theo kiểu cá chuồn");
    }

//    public void boiFunction() {
//        System.out.println("Cá chuồn bơi theo kiểu cá chuồn");
//    }
}
