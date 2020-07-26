
package Modelo;

public class Modelo {
    private double altura;
    private double peso;
    private double imc;
    private int edad;
    private String resul;


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getResul() {
        return resul;
    }

    public void setResul(String resul) {
        this.resul = resul;
    }

 
    
    //Metodo para calcular el IMC(Indice de masa corporal)
    public double calcularIMC(){
        imc=peso/(altura*altura);
        return imc;
    }
    
    //Metodo para saber en estado nos encontramos
    public String mostrarResul(){
         if(imc < 18.5){
            return "Usted tiene insuficiencia ponderal" ;
        }else if(imc >= 18.5 && imc <= 24.99){
            return"Usted esta en forma saludable";
        }else if(imc >= 25 && imc <= 29.99 ){
            return "Usted esta en sobrepeso";
        }else if(imc >= 30 && imc <= 34.99){
            return "Usted esta en obesidad 1";
        }else if( imc >= 35 && imc <= 39.99){
            return "Usted esta en obesidad 2";
        }else{
            return "Usted esta en obesidad 3";
        }
    }
    
}
