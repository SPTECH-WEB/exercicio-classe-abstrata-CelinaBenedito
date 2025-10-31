package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem(){
        this.figuras = new ArrayList<>();
    }
    public void adicionar(Figura figura){
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas(){
        Double somaTotal = 0.0;
        for(int c = 0; c<figuras.size(); c++){
            somaTotal += figuras.get(c).calcularArea();
        }
        return somaTotal;
    }
    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> gigantes = new ArrayList<>();
        for(Figura figura : figuras){
            if(figura.calcularArea() > 20){
                gigantes.add(figura);
            }
        }
        return gigantes;
    }
    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();
        for(Figura figura : figuras){
            if(figura instanceof Quadrado){
                quadrados.add(figura);
            }
        }
        return quadrados;
    }
}
