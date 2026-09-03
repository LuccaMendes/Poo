package revisao;

public class OrcamentoICMS {

    private Orcamento orcamento;
    public OrcamentoICMS(Orcamento orcamento){
        this.orcamento = orcamento;
    }
    public double calcularICMS(){
        return this.orcamento.calcularImposto();
    }
}
