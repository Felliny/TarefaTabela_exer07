package Controller;

import Biblioteca.ListaObject.Lista;
import Model.Conta;

public class ContaController {

    Lista[] vetTabela;


    public ContaController(){
        vetTabela= new Lista[3];
        for (int i = 0; i < 3; i++) {
            vetTabela[i]= new Lista();
        }
    }

    private int hashcode(int codigo){
        int posicao = 0;
        for (int i = 0; i < 3; i++) {
             posicao= codigo % 10;
        }
        return posicao;
    }

    public void adicionar(Conta conta) throws Exception{
        int hash= hashcode(conta.getCodigo());
        Lista l= vetTabela[hash];
        if (l.isEmpty()){
            l.addFirst(conta);
        }
        else {
            l.addLast(conta);
        }
    }


    public Conta buscar(Conta conta) throws Exception{
        int hash= hashcode(conta.getCodigo());
        Lista l= vetTabela[hash];
        int tamanho= l.size();
        for (int i = 0; i < tamanho; i++) {
            Conta contabusca= (Conta) l.get(i);
            if (contabusca.getCodigo() == conta.getCodigo()){
                return contabusca;
            }
        }
        return null;
    }

    public void remover(Conta conta) throws Exception{
        int hash= hashcode(conta.getCodigo());
        Lista l= vetTabela[hash];
        int tamanho= l.size();
        for (int i = 0; i < tamanho; i++) {
            Conta contabusca= (Conta) l.get(i);
            if (contabusca.getCodigo() == conta.getCodigo()){
                l.remove(i);
                break;
            }
        }
        System.out.println("Conta não registrada!");
    }
}
