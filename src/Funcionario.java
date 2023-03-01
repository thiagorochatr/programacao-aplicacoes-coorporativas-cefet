public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    private String uf;
    private String dataAdm;
    private Setor setor;

    public double simulaAumentoSalarial(double percent) {
        return (this.salario + (this.salario * percent));
    }
}
