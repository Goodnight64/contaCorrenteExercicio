public class Conta {
    public String nome;
    public String tipoDeConta;
    public Double agencia;
    public static Double saldo;



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoDeConta() {
        return tipoDeConta;
    }
    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    public Double getAgencia() {
        return agencia;
    }
    public void setAgencia(Double agencia) {
        this.agencia = agencia;
    }

    void Depositar(double valor){
        this.saldo = saldo + valor;
    }

    void sacar(double valorSacado){
        this.saldo = saldo - valorSacado;
    }

    void transferir(double valorTransferir){
        double valor = Conta.saldo - valorTransferir;
        

    }

    


}
