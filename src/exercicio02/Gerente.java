package exercicio02;

public class Gerente extends Funcionario {
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    @Override
    double salarioAnual() {
        return super.salarioAnual() + (bonusAnual * getSalario());
    }
}
