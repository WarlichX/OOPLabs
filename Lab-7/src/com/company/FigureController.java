package com.company;

import java.util.ArrayList;

public class FigureController {

    private ArrayList<Figure> figures;
    FigureController(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public double getMaxArea() {
        double maxArea = this.figures.get(0).getArea();
        int figureIdx = 0;
        for (int i = 0; i < this.figures.size(); i++) {
            if (maxArea < this.figures.get(i).getArea()) {
                maxArea = this.figures.get(i).getArea();
                figureIdx = i;
            }
        }
        if (this.figures.get(figureIdx).getClass().isAnonymousClass()) {
            System.out.println("Figure with max Area is a object of anonymous class: " + this.figures.get(figureIdx).getAnonymousClassName());
        } else {
            System.out.println("Figure with max Area is a object of type: " + this.figures.get(figureIdx).getClass().getSimpleName());
        }
        return maxArea;
    }

    public double getMaxPerimeter() {
        double maxPerimeter = this.figures.get(0).getPerimeter();
        int figureIdx = 0;
        for (int i = 0; i < this.figures.size(); i++) {
            if (maxPerimeter < this.figures.get(i).getPerimeter()) {
                maxPerimeter = this.figures.get(i).getPerimeter();
                figureIdx = i;
            }
        }
        if (this.figures.get(figureIdx).getClass().isAnonymousClass()) {
            System.out.println("Figure with max Perimeter is a object of anonymous class: " + this.figures.get(figureIdx).getAnonymousClassName());
        } else {
            System.out.println("Figure with max Perimeter: " + this.figures.get(figureIdx).getClass().getSimpleName());
        }
        return maxPerimeter;
    }
}
