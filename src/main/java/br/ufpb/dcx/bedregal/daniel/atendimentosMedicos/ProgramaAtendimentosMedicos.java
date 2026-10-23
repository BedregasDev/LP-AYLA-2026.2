package br.ufpb.dcx.bedregal.daniel.atendimentosMedicos;

import java.util.Scanner;

public class ProgramaAtendimentosMedicos {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
//        System.out.println("Quantos atendimentos ´medicos serão realizados?");
//        int quantAtendimentos = Integer.parseInt(leitor.nextLine());
//        AtendimentoMedico [] atendimentos = new AtendimentoMedico[quantAtendimentos];
        System.out.println("Qual o código de atendimento?");
        String codigoAtendimento = leitor.nextLine();
        System.out.println("Qual o dia do atendimento?");
        String diaAtendimento = leitor.nextLine();
        System.out.println("Qual a categoria do atendimento?");
        String categoriaAtendimento = leitor.nextLine();

        AtendimentoMedico atendimento1 = new AtendimentoMedico(codigoAtendimento,diaAtendimento,categoriaAtendimento);
        System.out.println(atendimento1);


    }
}
