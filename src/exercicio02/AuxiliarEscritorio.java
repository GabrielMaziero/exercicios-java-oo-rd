package exercicio02;

public class AuxiliarEscritorio extends Funcionario{

    private double bonusAnual;

    public AuxiliarEscritorio(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    @Override
    double salarioAnual() {
        return super.salarioAnual() + this.bonusAnual;
    }

}
