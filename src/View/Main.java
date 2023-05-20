package View;

import Controller.ContaController;
import Model.Conta;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaController controller= new ContaController();
        Conta conta= new Conta();

        int opc= 0;
        while (opc !=9){
            opc= Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1 - Adicionar conta \n 2 - Buscar conta \n 3 - Remover conta \n 9 - Sair"));
            switch (opc){
                case 1:
                    conta.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo da conta)")));
                    conta.setNome(JOptionPane.showInputDialog("Digite o Nome"));
                    conta.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o Saldo")));
                    try {
                        controller.adicionar(conta);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    conta.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo da conta)")));
                    conta.setNome(JOptionPane.showInputDialog("Digite o Nome"));
                    conta.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o Saldo")));
                    try {
                        System.out.println(controller.buscar(conta));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    conta.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo da conta)")));
                    conta.setNome(JOptionPane.showInputDialog("Digite o Nome"));
                    conta.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o Saldo")));
                    try {
                        controller.remover(conta);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }finally {
                        System.out.println(conta +"\n Conta foi removido");
                    }
                    break;
                case 9: break;

            }
        }

    }
}
