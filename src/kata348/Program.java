package kata348;

public class Program {

    public static void main(String[] args) {
        ComplexNumber complexNumber01 = new ComplexNumber(18, 3);
        ComplexNumber complexNumber02 = new ComplexNumber(55, -17);

        System.out.println(Integer.toBinaryString(complexNumber01.hashCode()));
        System.out.println(Integer.toBinaryString(complexNumber02.hashCode()));
    }




    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        public int hashCode() {
            int result = 31;
            result = 31 * result + (int)(Double.doubleToLongBits(re) ^ (Double.doubleToLongBits(re) >>> 32));
            result = 31 * result + (int)(Double.doubleToLongBits(im) ^ (Double.doubleToLongBits(im) >>> 32));
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || (obj.getClass() != getClass())) {
                return false;
            }
            return (hashCode() == obj.hashCode()
                    && Double.compare(((ComplexNumber)obj).getIm(), getIm()) == 0
                    && Double.compare(((ComplexNumber)obj).getRe(), getRe()) == 0);
        }
    }
}
