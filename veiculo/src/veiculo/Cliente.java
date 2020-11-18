package veiculo;

/**
 *
 * @author Neudinho Paulino
 */
public class Cliente {

    public static void main(String[] args) {
        
        AVeiculo moto = new Moto();
        AVeiculo carro = new Carro();
        
        System.out.println("\nMOTO:");
        moto.ligar();
        moto.acelerar();
        moto.frear();
        moto.desligar();
        
        System.out.println("\nCARRO:");
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();
    }
    
}
