package secao16_VerificadorSenha;

import java.util.Scanner;

public class VerificadorForcaSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //PEGAR SENHA USUARIO
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        //VERIFICAR A FORÇA DA SENHA
        int forca = verificarForcaSenha(senha);

        if (forca <= 2) {
            System.out.println("Sua senha é fraca.");
        } else if (forca == 3) {
            System.out.println("Sua senha é média.");
        } else if (forca == 4) {
            System.out.println("Sua senha é segura.");
        } else {
            System.out.println("Sua senha é muito forte.");
        }

        scanner.close();
    }

    public static int verificarForcaSenha(String senha) {
        int forca = 0;

        if (senha.length() > 8) {
            forca++;
        }

        //VALIDAR LETRAS MAIUSCULAS DE A a Z
        if (senha.matches(".*[A-Z].*")) {
            forca++;
        }

        //VALIDAR LETRAS MINUSCULAS DE A a Z
        if (senha.matches(".*[a-z].*")) {
            forca++;
        }

        //VALIDAR NUMEROS NA SENHA
        if (senha.matches(".*\\d.*")) {
            forca++;
        }

        //VALIDAR LETRAS MINUSCULAS DE A a Z
        if (senha.matches(".*[!@#$%&].*")) {
            forca++;
        }

        return forca;
    }

}
