public class Triangulo {
        private int a;
        private int b;
        private int c;
        private int tipo;
        private int triangulo;

        public Triangulo(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        private boolean verifica(){
            return a + b > c && a + c > b && b + c > a;
        }

        public boolean equilatero(){
            if(verifica()){
                return a == b && a == c;
            }

            return false;
        }

        public boolean isosceles(){
            if(verifica()){
                return a == b || a == c || c == b;
            }

            return false;
        }

        public boolean escaleno(){
            if(verifica()){
                return a != b && a == c && c != b;
            }

            return false;
        }
    }

