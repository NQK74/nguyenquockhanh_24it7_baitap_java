package Chuong3.Bai3_1;

public class MyComplex2 {

        private double real =  0.0;
        private double imag = 0.0;
        public MyComplex2(){}
        public MyComplex2(double real, double imag){
            this.real = real;
            this.imag = imag;
        }
        public double getReal() {
            return real;
        }
        public void setReal(double real) {
            this.real = real;
        }
        public double getImag() {
            return imag;
        }
        public void setImag(double imag) {
            this.imag = imag;
        }
        public void setValue(double real, double imag){
            this.real = real;
            this.imag = imag;
        }
        public String toString(){
            return real + "+" + imag + "i";
        }
        public boolean isReal(){
            return real==0;
        }
        public boolean isImag(){
            return imag==0;
        }
        public boolean isImaginary(){
            return real==0 && imag!=0;
        }
        public boolean equals(double real, double imag){
            return this.real == real && this.imag == imag;
        }
        public boolean equals(MyComplex2 other){
            return this.real == other.real && this.imag == other.imag;
        }
        public double magnitude(){
            return Math.sqrt(real * real + imag * imag);
        }
        public double argument(){
            return Math.atan2(imag, real);
        }
        public MyComplex2 addInto(MyComplex2 right){
            this.real += right.real;
            this.imag += right.imag;
            return this;
        }
        public MyComplex2 addNew(MyComplex2 right){
            return new MyComplex2(real + right.real, imag + right.imag);
        }
    public MyComplex2 subtract(MyComplex2 right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex2 subtractNew(MyComplex2 right) {
        return new MyComplex2(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex2 multiply (MyComplex2 right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex2 divide (MyComplex2 right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
        double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex2 conjugate() {
        this.imag = -this.imag;
        return this;
    }

}

