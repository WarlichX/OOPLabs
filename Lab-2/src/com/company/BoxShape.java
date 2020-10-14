package com.company;

public class BoxShape {
    public float heigth;
    public float width;
    public float length;

    // default value 1
    public BoxShape() {
        heigth = 1;
        width = 1;
        length = 1;
    }

    // same value
    public BoxShape(int val) {
        heigth = val;
        width = val;
        length = val;
    }

    // with 3 params
    public BoxShape(float boxHeigth, float boxWidth, float boxLength) {
        heigth = boxHeigth;
        width = boxWidth;
        length = boxLength;
    }

    public void getInfo() {
        System.out.println("Height: " + heigth + "\nWidth: " + width + "\nLength: " + length + "\n");
    }

    public float Volume() {
        return this.length * this.width * this.heigth;
    }

    public float Area() {
        return 2 * (this.heigth * this.width) + 2 * (this.heigth * this.length) + 2 * (this.width * this.length);
    }
}
