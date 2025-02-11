package Chuong3.Bai3_2;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }
    // lấy bậc của đa thức
    public int getDegree() {
        return coeffs.length - 1 ;
    }
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(String.format("%.1f", coeffs[i]));
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();

    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = getDegree(); i >= 0; i--) {
           // result = result * x + coeffs[i];
            result = result +(Math.pow(x,i)* coeffs[i]);
        }
        return result;
    }
    // cộng hai đa thức
    public MyPolynomial add(MyPolynomial right) {
      //  int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[getDegree() + right.getDegree()+1];
        // Hệ  số đa thức thứ nhất
        for (int i = getDegree(); i >= 0; i--) {
            newCoeffs[i] = this.coeffs[i] ;

        }
        // cộng với hệ số đa thức thứ hai
        for (int i = 0 ; i <= right.getDegree(); i++) {
            newCoeffs[i] += right.coeffs[i];
        }
        return new MyPolynomial(newCoeffs);
    }
    // Nhân hai đa  thức
    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        //int newDegree = this.getDegree() + right.getDegree();
        //double[] newCoeffs = new double[newDegree + 1];
        // Nhân từng hệ số của đa thức thứ nhất
        for (int i = 0 ; i <= this.getDegree() ; i++) {
            // với hệ số của đa thức thứ 2
            for (int j = 0 ; j <= right.getDegree() ; j++) {
                // cộng dồn vào  hệ số tương ứng
                newCoeffs[i+j] += coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }


}

