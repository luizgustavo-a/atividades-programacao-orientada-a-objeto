public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(123456, "Nome do funcionário", "Função do funcionário", 'i');

        System.out.println(funcionario.getSalario());

        if(funcionario.promocaoHorizontal()) {
            System.out.println("O funcionário foi promovido horizontalmente com sucesso e agora tem o nível salarial " + funcionario.getNivelSalarial() + " e salário de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }

        if(funcionario.promocaoVertical()) {
            String nivelProfissional = "";
            if(funcionario.getNivelProfissional() == 'G') {
                nivelProfissional = "Gerencial";
            } else {
                nivelProfissional = "Executivo";
            }
            System.out.println("O funcionário foi promovido verticalmente com sucesso e seu nível profissional agora é " + nivelProfissional + " e seu novo salário é de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }


        if (funcionario.promocaoHorizontal()) {
            System.out.println("O funcionário foi promovido horizontalmente com sucesso e agora tem o nível salarial " + funcionario.getNivelSalarial() + "e salário de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }


        if (funcionario.promocaoHorizontal()) {
            System.out.println("O funcionário foi promovido horizontalmente com sucesso e agora tem o nível salarial " + funcionario.getNivelSalarial() + "e salário de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }


        if (funcionario.promocaoHorizontal()) {
            System.out.println("O funcionário foi promovido horizontalmente com sucesso e agora tem o nível salarial " + funcionario.getNivelSalarial() + "e salário de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }

        if (funcionario.promocaoVertical()) {
            String nivelProfissional = "";
            if (funcionario.getNivelProfissional() == 'G') {
                nivelProfissional = "Gerencial";
            } else {
                nivelProfissional = "Executivo";
            }
            System.out.println("O funcionário foi promovido verticalmente com sucesso e seu nível profissional agora é " + nivelProfissional + " e seu novo salário é de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }

        if (funcionario.promocaoVertical()) {
            String nivelProfissional = "";
            if (funcionario.getNivelProfissional() == 'G') {
                nivelProfissional = "Gerencial";
            } else {
                nivelProfissional = "Executivo";
            }
            System.out.println("O funcionário foi promovido verticalmente com sucesso e seu nível profissional agora é " + nivelProfissional + " e seu novo salário é de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }

        if (funcionario.promocaoVertical()) {
            String nivelProfissional = "";
            if (funcionario.getNivelProfissional() == 'G') {
                nivelProfissional = "Gerencial";
            } else {
                nivelProfissional = "Executivo";
            }
            System.out.println("O funcionário foi promovido verticalmente com sucesso e seu nível profissional agora é " + nivelProfissional + " e seu novo salário é de R$" + funcionario.getSalario());
        } else {
            System.out.println("Operação inválida. O funcionário não foi promovido");
        }
    }
}

