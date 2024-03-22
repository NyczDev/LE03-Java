package lista.classes;

public class SalarProfessor {

        private int nivel;
        private double valorHoraAula;
    
        public SalarProfessor(int nivel) {
            this.nivel = nivel;
            switch (nivel) {
                case 1:
                    this.valorHoraAula = 12.00;
                    break;
                case 2:
                    this.valorHoraAula = 17.00;
                    break;
                case 3:
                    this.valorHoraAula = 25.00;
                    break;
                default:
                    this.valorHoraAula = 0.00;
            }
        }
    
        public double calcularSalario(int horasAula) {
            return this.valorHoraAula * horasAula;
        }
    }
    

