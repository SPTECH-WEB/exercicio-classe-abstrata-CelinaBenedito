package school.sptech;

public class Quadrado extends Figura{

    private Double lado;

    public Quadrado(){

    }

    @Override public Double calcularArea(){

        return this.lado*this.lado;
    }
    @Override
    public String toString(){
        return "Cor: "+ getCor()+ " espessura: "+ getEspessura() + " lado: " + this.lado + " área total: " + calcularArea();
    }
}
