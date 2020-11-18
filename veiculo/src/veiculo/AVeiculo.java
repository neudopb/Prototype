package veiculo;

/**
 *
 * @author Neudinho Paulino
 */
public abstract class AVeiculo implements IVeiculo{
    
    @Override
    public void ligar() {
        System.out.println("Veiculo ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Veiculo desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando veiculo.");
    }

    @Override
    public void frear() {
        System.out.println("Freando veiculo.");
    }
    
}