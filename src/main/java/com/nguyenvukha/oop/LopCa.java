package com.nguyenvukha.oop;

public abstract class LopCa {

    public String colorEye;
    public String colorSkin;

    public String getColorEye() {
        return colorEye;
    }

    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;
    }

    public String getColorSkin() {
        return colorSkin;
    }

    public void setColorSkin(String colorSkin) {
        this.colorSkin = colorSkin;
    }

//    public void boiFunction() {
//        System.out.println("Cá nào mà chả biết bơi");
//    }

    public abstract void boiFunction();
    public void boiFunction(String style) {
        System.out.println(style);
    }

}
