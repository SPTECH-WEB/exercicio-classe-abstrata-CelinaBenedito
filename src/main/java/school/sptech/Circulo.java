package school.sptech;

public class Circulo extends Figura{

    private Double raio;

    public Circulo(){

    }

    @Override
    public Double calcularArea(){
        return Math.pow(this.raio,2)*Math.PI;
    }
    @Override public String toString(){
        return "Cor: "+ getCor()+ " espessura: "+ getEspessura() + " raio: "+this.raio + " área total: " + calcularArea();
    }
}
