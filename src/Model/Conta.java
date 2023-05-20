package Model;

public class Conta {

    int codigo;
    String nome;
    float saldo;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
