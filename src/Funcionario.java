public class Funcionario {
    private int salario;
    private Setor setor;

    public double aumentoSalarial(double percent) {
        return (this.salario + (this.salario * percent));
    }
}
