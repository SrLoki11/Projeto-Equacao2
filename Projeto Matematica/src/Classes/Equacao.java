package Classes;

    public class Equacao {
        private double a;
        private double b;
        private double c;
        private double delta;
        private double x1;
        private double x2;
    
        public double geta() {
            return a;
        }
    
        public void seta(double a) {
            this.a = a;
        }
        
        
        public double getb() {
            return b;
        }
    
        public void setb(double b) {
            this.b = b;
        }
    
        public double getc() {
            return c;
        }
    
        public void setc(double c) {
            this.c = c;
        }
    
        public double getdelta() {
            return delta;
        }
    
        public void setdelta(double delta) {
            this.delta = delta;
        }
    
        public double getx1() {
            return x1;
        }
    
        public void setx1(double x1) {
            this.x1 = x1;
        }
    
        public double getx2() {
            return x2;
        }
    
        public void setx2(double x2) {
            this.x2 = x2;
        }
    
    
        
    
        public double calculaDelta(double a, double b, double c){
    
            double delta = Math.pow(b, 2) - 4*a*c;
    
            return delta;
        }
    
        public double calculax1 () {
    
            x1 = (-b + Math.sqrt(delta)) / (2*a);
    
            return x1;
    
        }
    
        public double calculax2 () {
    
            x2 = (-b - Math.sqrt(delta)) / (2*a);
    
            return x2;
    
    }
    
    
    }

