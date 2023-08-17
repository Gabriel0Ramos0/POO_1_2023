package Atividade1_e_Testes;

import javax.swing.JOptionPane;

public class Atividade_1 {
	public static void main(String[] args) {
        String nome;
        double altura, peso, IMC;
        int sexo;
        int qt;
        
        qt = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de pessoas"));
        String[] nomes = new String[qt];
        double[] imcs = new double[qt];
        String[] categorias = new String[qt];
                
        for (int i=0; i<qt; i++){
            
            nome = JOptionPane.showInputDialog(null, "Usuário " + (i + 1) + "\nInforme seu nome:");
            JOptionPane.showMessageDialog(null, "Informe o número correspondente" + "\n1- Masculino" + "\n2- Feminino");
            sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu sexo, " + nome));
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura, " + nome));
            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso, " + nome));
            IMC = peso / (altura * altura);
            
            String categoria = "";
            
            if (sexo == 1 && IMC <20.7){
                categoria = "Abaixo do peso";
            } else if (sexo == 1 && IMC >=20.7 && IMC <=26.4){
                categoria = "Peso ideal";
            } else if (sexo == 1 && IMC >=26.5 && IMC <=27.8){
                categoria = "Pouco acima do peso";
            } else if (sexo == 1 && IMC >=27.9 && IMC <=31.1){
                categoria = "Peso ideal";                
            } else if (sexo == 1 && IMC >=31.2){
                categoria = "Obesidade";
            } else if (sexo == 2 && IMC <19.1){
                categoria = "Abaixo do peso";
            } else if (sexo == 2 && IMC >=19.1 && IMC <=25.8){
                categoria = "Peso ideal";
            } else if (sexo == 2 && IMC >=25.9 && IMC <=27.3){
                categoria = "Pouco acima do peso";
            } else if (sexo == 2 && IMC >=27.3 && IMC <=32.3){
                categoria = "Peso ideal";
            } else if (sexo == 2 && IMC >=32.4){
                categoria = "Obesidade";
            } else {
                JOptionPane.showMessageDialog(null, "Digite o número correspondente ao sexo!");
            }
            nomes[i] = nome;
            imcs[i] = IMC;
            categorias[i] = categoria;
        } 
        StringBuilder resultadoFinal = new StringBuilder("Resultados:\n\n");
        for (int i=0; i<qt;i++) {
            resultadoFinal.append("Nome: ").append(nomes[i]).append("\nIMC = ").append(imcs[i]).append("\nCategoria = ").append(categorias[i]).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, resultadoFinal.toString());                            
    }
}
