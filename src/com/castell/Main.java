package com.castell;

public class Main {
    static class Ratio{
        protected double width;
        protected double height;
        protected double ratio;

        public Ratio(double w, double h){
            setWidth(w);
            setHeight(h);
            //Aspect ratio= (Width/Height)
            if(w!=0 && h!=0){
                this.ratio = (w/h);
            }
            System.out.println(this);//Invoke toString
        }
        public double getWidth(){ return this.width;}
        public void setWidth(double w){ this.width=w;}

        public double getHeight(){ return this.height;}
        public void setHeight(double w){ this.height=w;}

        public double calcNewWidth(double newHeight){
            newHeight*= this.ratio;
            System.out.println("New Width:" + newHeight);
            return newHeight;
        }
        public double calcNewHeight(double newWidth){
            newWidth /= this.ratio;
            System.out.println("New Height:" + newWidth);
            return newWidth;
        }
        @Override
        public String toString() {
            return String.format("Original Width:%.2f%nOriginal Height:%.2f",
                                    this.width,this.height);
        }
    }
    public static void main(String[] args) {
        Ratio ratio = new Ratio(640,480);
        //ratio.calcNewHeight(300);
        ratio.calcNewWidth(500);
    }
}
