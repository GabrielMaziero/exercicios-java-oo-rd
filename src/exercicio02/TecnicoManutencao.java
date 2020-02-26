package exercicio02;

public class TecnicoManutencao extends Funcionario {
    private double adicionalInsa;
    private double bonusAnual;

    public TecnicoManutencao(String nome, double salario, double adicionalInsa, double bonusAnual) {
        super(nome, salario);
        this.adicionalInsa = adicionalInsa;
        this.bonusAnual = bonusAnual;
    }

    @Override
    double salarioAnual() {
        return super.salarioAnual() + (getSalario() / adicionalInsa) + this.bonusAnual;
    }
}
