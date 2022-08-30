public class CadastroUsuarios {

    public static void main(String[] args) {
        Usuario funcionario1 = new Funcionario(
                "José Junior",
                23,
                "111.111.111-11",
                2000.00,
                "Assistente"
        );

        Usuario funcionario2 = new Funcionario(
                "Pedro Silva",
                30,
                "222.111.111-11",
                4000.00,
                "Analista Financeiro"
        );

        Usuario funcionario3 = new Funcionario(
                "Ana Luisa",
                19,
                "333.111.111-11",
                900.00,
                "Estagiária"
        );

        Usuario funcionario4 = new Funcionario(
                "Maria Almeida",
                34,
                "444.111.111-11",
                7000.00,
                "Gestora"
        );

        Usuario funcionario5 = new Funcionario(
                "Soraia Mota",
                37,
                "555.111.111-11",
                10000.00,
                "Gerente"
        );

        Usuario cliente1 = new Cliente(
                "Julia Silva",
                55,
                "666.111.111-11",
                250.00
        );

        Usuario cliente2 = new Cliente(
                "Soraia Mota",
                37,
                "777.111.111-11",
                600.00
        );

        Usuario cliente3 = new Cliente(
                "Soraia Mota",
                37,
                "888.111.111-11",
                820.00
        );

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario3.getNome());
        System.out.println(funcionario4.getNome());
        System.out.println(funcionario5.getNome());

        System.out.println(cliente1.getCpf());
        System.out.println(cliente2.getCpf());
        System.out.println(cliente3.getCpf());
    }
}
