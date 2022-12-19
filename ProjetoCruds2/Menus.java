
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menus {

    List<Clientes> clientes = new ArrayList<>();
    List<Funcionarios> funcionarios = new ArrayList<>();
    List<Vendas> vendas = new ArrayList<>();
    List<Produtos> produtos = new ArrayList<>();
    Scanner menu = new Scanner(System.in);
    int opcao;

    public void menuPrincipal() {
        System.out.print("##--MENU PRINCIPAL--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Clientes |\n");
        System.out.print("| 2 - Funcionarios |\n");
        System.out.print("| 3 - Produtos |\n");
        System.out.print("| 4 - Vendas |\n");
        System.out.print("| 5 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                menuClientes();
                break;
            case 2:
                menuFuncionarios();
                break;
            case 3:
                menuProdutos();
                break;
            case 4:
                menuVendas();
                break;
            case 5:
                System.out.print("\nAté logo!");
                menu.close();
                break;
            default:
                System.out.print("\nOpção Inválida!");
                menuPrincipal();

        }
    }

    public void menuClientes() {
        System.out.println("##--Pagina dos Clientes--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Cadastrar |\n");
        System.out.print("| 2 - Alterar |\n");
        System.out.print("| 3 - Consultar |\n");
        System.out.print("| 4 - Excluir |\n");
        System.out.print("| 5 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                cadastrarClientes();
                break;
            case 2:
                alterarClientes();
                break;
            case 3:
                menuConsultarClientes();
                break;
            case 4:
                excluirClientes();
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuClientes();
        }
    }

    public void cadastrarClientes() {
        Clientes cliente = new Clientes();
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Preencha o Cadastro!!");
        System.out.println("Código do Cliente: ");
        cliente.setCodigoClientes(cadastro.next());
        System.out.println("Nome:");
        cliente.setNome(cadastro.next());
        System.out.println("Idade:");
        cliente.setIdade(cadastro.nextInt());
        System.out.println("Sexo:");
        cliente.setSexo(cadastro.next());
        System.out.println("Cpf: ");
        cliente.setCpf(cadastro.next());
        System.out.println("Telefone:");
        cliente.setTelefone(cadastro.next());
        System.out.println("Estado:");
        cliente.setEstado(cadastro.next());
        System.out.println("Cidade:");
        cliente.setCidade(cadastro.next());
        clientes.add(cliente);
        menuClientes();

    }

    public void alterarClientes() {
        Clientes cliente = new Clientes();
        Scanner alterar = new Scanner(System.in);

        Scanner alt = new Scanner(System.in);
        System.out.println("Qual o Indice de candidato deseja alterar?");
        int indice = alt.nextInt();
        clientes.set(indice, cliente);

        System.out.println("Código do Cliente: ");
        cliente.setCodigoClientes(alterar.next());
        System.out.println("Nome:");
        cliente.setNome(alterar.next());
        System.out.println("Idade:");
        cliente.setIdade(alterar.nextInt());
        System.out.println("Sexo:");
        cliente.setSexo(alterar.next());
        System.out.println("Cpf: ");
        cliente.setCpf(alterar.next());
        System.out.println("Telefone:");
        cliente.setTelefone(alterar.next());
        System.out.println("Estado:");
        cliente.setEstado(alterar.next());
        System.out.println("Cidade:");
        cliente.setCidade(alterar.next());
        menuClientes();
    }

    public void excluirClientes() {
        Clientes cliente = new Clientes();
        Scanner excluir = new Scanner(System.in);
        System.out.println("Qual o Indice de candidato deseja excluir?");
        int indice = excluir.nextInt();
        clientes.remove(indice);

        menuClientes();
    }

    public void menuConsultarClientes() {
        System.out.println("##--Menu Consultar Clientes--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Todos os Clientes |\n");
        System.out.print("| 2 - Consulta pelo CPF |\n");
        System.out.print("| 3 - Pesquisar por cidade |\n");
        System.out.print("| 4 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                todosClientes();
                break;
            case 2:
                cpfClientes();
                break;
            case 3:
                cidadeClientes();
                break;
            case 4:
                menuClientes();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuConsultarClientes();
        }
    }

    public void todosClientes() {
        Clientes cliente = new Clientes();
        Scanner todos = new Scanner(System.in);
        System.out.println("Lista de Todos os Clientes");

        for (Clientes td : clientes) {
            System.out.println("Codigo do Clientes:" + td.getCodigoClientes());
            System.out.println("Nome:" + td.getNome());
            System.out.println("Idade:" + td.getIdade());
            System.out.println("Sexo:" + td.getSexo());
            System.out.println("Cpf:" + td.getCpf());
            System.out.println("Telefone:" + td.getTelefone());
            System.out.println("Estado:" + td.getEstado());
            System.out.println("Cidade:" + td.getCidade());
        }
        menuConsultarClientes();
    }

    public void cpfClientes() {
        Clientes cliente = new Clientes();
        Scanner c = new Scanner(System.in);
        System.out.println("Qual o CPF do cliente a ser consultado?");
        String cpf = c.next();
        boolean achou = false;
        for (Clientes td : clientes) {
            if (cpf.equals(td.getCpf())) {
                System.out.println("Codigo do Clientes:" + td.getCodigoClientes());
                System.out.println("Nome:" + td.getNome());
                System.out.println("Idade:" + td.getIdade());
                System.out.println("Sexo:" + td.getSexo());
                System.out.println("Cpf:" + td.getCpf());
                System.out.println("Telefone:" + td.getTelefone());
                System.out.println("Estado:" + td.getEstado());
                System.out.println("Cidade:" + td.getCidade());
                achou = true;
            }
        }
        if (achou = false) {
            System.out.println("CPF não encontrado!");
        }

        menuConsultarClientes();

    }

    public void cidadeClientes() {
        Clientes cliente = new Clientes();
        Scanner todos = new Scanner(System.in);
        System.out.println("Digite a Cidade: ");
        String cid = todos.nextLine();

        for (Clientes td : clientes) {
            if (cid.toLowerCase().equals(td.getCidade())) {
                System.out.println("Codigo do Clientes:" + td.getCodigoClientes());
                System.out.println("Nome:" + td.getNome());
                System.out.println("Idade:" + td.getIdade());
                System.out.println("Sexo:" + td.getSexo());
                System.out.println("Cpf:" + td.getCpf());
                System.out.println("Telefone:" + td.getTelefone());
                System.out.println("Estado:" + td.getEstado());
                System.out.println("Cidade:" + td.getCidade());

            }
        }
        menuConsultarClientes();
    }

    public void menuFuncionarios() {
        System.out.println("##--Pagina dos Funcionários--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Cadastrar |\n");
        System.out.print("| 2 - Alterar |\n");
        System.out.print("| 3 - Consultar |\n");
        System.out.print("| 4 - Excluir |\n");
        System.out.print("| 5 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                cadastrarFuncionarios();
                break;
            case 2:
                alterarFuncionarios();
                break;
            case 3:
                menuConsultarFuncionarios();
                break;
            case 4:
                excluirFuncionarios();
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuFuncionarios();

        }
    }

    public void cadastrarFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Preencha o Cadastro!!");
        System.out.println("Código do Funcionários: ");
        funcionario.setCodigoFuncionarios(cadastro.next());
        System.out.println("Nome:");
        funcionario.setNome(cadastro.next());
        System.out.println("Idade:");
        funcionario.setIdade(cadastro.nextInt());
        System.out.println("Sexo:");
        funcionario.setSexo(cadastro.next());
        System.out.println("Cpf: ");
        funcionario.setCpf(cadastro.next());
        System.out.println("Telefone:");
        funcionario.setTelefone(cadastro.next());
        System.out.println("Estado:");
        funcionario.setEstado(cadastro.next());
        System.out.println("Cidade:");
        funcionario.setCidade(cadastro.next());
        System.out.println("Turno: (Matutino, Vespertino e Noturno)");
        funcionario.setTurno(cadastro.next());
        System.out.println("Cargo:");
        funcionario.setCargo(cadastro.next());
        System.out.println("Salario:");
        funcionario.setSalario(cadastro.nextDouble());
        funcionarios.add(funcionario);
        menuFuncionarios();

    }

    public void alterarFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        Scanner cadastro = new Scanner(System.in);

        Scanner alt = new Scanner(System.in);
        System.out.println("Qual o Indice de candidato deseja alterar?");
        int indice = alt.nextInt();
        funcionarios.set(indice, funcionario);

        System.out.println("Preencha o Cadastro!!");
        System.out.println("Código do Funcionários: ");
        funcionario.setCodigoFuncionarios(cadastro.next());
        System.out.println("Nome:");
        funcionario.setNome(cadastro.next());
        System.out.println("Idade:");
        funcionario.setIdade(cadastro.nextInt());
        System.out.println("Sexo:");
        funcionario.setSexo(cadastro.next());
        System.out.println("Cpf: ");
        funcionario.setCpf(cadastro.next());
        System.out.println("Telefone:");
        funcionario.setTelefone(cadastro.next());
        System.out.println("Estado:");
        funcionario.setEstado(cadastro.next());
        System.out.println("Cidade:");
        funcionario.setCidade(cadastro.next());
        System.out.println("Turno: (Matutino, Vespertino e Noturno");
        funcionario.setTurno(cadastro.next());
        System.out.println("Cargo:");
        funcionario.setCargo(cadastro.next());
        System.out.println("Salario:");
        funcionario.setSalario(cadastro.nextDouble());

        menuFuncionarios();

    }

    public void excluirFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        Scanner excluir = new Scanner(System.in);
        System.out.println("Qual o Indice de candidato deseja excluir?");
        int indice = excluir.nextInt();
        funcionarios.remove(indice);
        menuFuncionarios();
    }

    public void menuConsultarFuncionarios() {
        System.out.println("##--Menu Consultar Funcionários--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Todos os Funcionários |\n");
        System.out.print("| 2 - Consulta pelo CPF |\n");
        System.out.print("| 3 - Pesquisar por Turno |\n");
        System.out.print("| 4 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                todosFuncionarios();
                break;
            case 2:
                cpfFuncionarios();
                break;
            case 3:
                turnoFuncionarios();
                break;
            case 4:
                menuFuncionarios();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuConsultarFuncionarios();
        }
    }

    public void todosFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        Scanner todos = new Scanner(System.in);
        System.out.println("Lista de Todos os Funcionários");

        for (Funcionarios td : funcionarios) {
            System.out.println("Codigo do Funcionários:" + td.getCodigoFuncionarios());
            System.out.println("Nome:" + td.getNome());
            System.out.println("Idade:" + td.getIdade());
            System.out.println("Sexo:" + td.getSexo());
            System.out.println("Cpf:" + td.getCpf());
            System.out.println("Telefone:" + td.getTelefone());
            System.out.println("Estado:" + td.getEstado());
            System.out.println("Cidade:" + td.getCidade());
            System.out.println("Turno:" + td.getTurno());
            System.out.println("Cargo:" + td.getCargo());
            System.out.println("Salario:" + td.getSalario());
        }
        menuConsultarFuncionarios();
    }

    public void cpfFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        Scanner c = new Scanner(System.in);
        System.out.println("Qual o CPF do funcionário a ser consultado?");
        String cpf = c.next();
        boolean achou = false;
        for (Funcionarios td : funcionarios) {
            if (cpf.equals(td.getCpf())) {
                System.out.println("Codigo do Funcionários:" + td.getCodigoFuncionarios());
                System.out.println("Nome:" + td.getNome());
                System.out.println("Idade:" + td.getIdade());
                System.out.println("Sexo:" + td.getSexo());
                System.out.println("Cpf:" + td.getCpf());
                System.out.println("Telefone:" + td.getTelefone());
                System.out.println("Estado:" + td.getEstado());
                System.out.println("Cidade:" + td.getCidade());
                System.out.println("Turno:" + td.getTurno());
                System.out.println("Cargo:" + td.getCargo());
                System.out.println("Salario:" + td.getSalario());
                achou = true;
            }
        }
        if (achou = false) {
            System.out.println("CPF não encontrado!");
        }

        menuConsultarFuncionarios();

    }

    public void turnoFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        Scanner todos = new Scanner(System.in);
        System.out.println("Digite o Turno: ");
        String turn = todos.nextLine();

        for (Funcionarios td : funcionarios) {
            if (turn.toLowerCase().equals(td.getTurno())) {
                System.out.println("Codigo do Funcionários:" + td.getCodigoFuncionarios());
                System.out.println("Nome:" + td.getNome());
                System.out.println("Idade:" + td.getIdade());
                System.out.println("Sexo:" + td.getSexo());
                System.out.println("Cpf:" + td.getCpf());
                System.out.println("Telefone:" + td.getTelefone());
                System.out.println("Estado:" + td.getEstado());
                System.out.println("Cidade:" + td.getCidade());
                System.out.println("Turno:" + td.getTurno());
                System.out.println("Cargo:" + td.getCargo());
                System.out.println("Salario:" + td.getSalario());

            }
        }
        menuConsultarFuncionarios();
    }

    public void menuProdutos() {
        System.out.println("##--Pagina dos Produtos--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Cadastrar |\n");
        System.out.print("| 2 - Alterar |\n");
        System.out.print("| 3 - Consultar |\n");
        System.out.print("| 4 - Excluir |\n");
        System.out.print("| 5 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                cadastrarProdutos();
                break;
            case 2:
                alterarProdutos();
                break;
            case 3:
                menuConsultarProdutos();
                break;
            case 4:
                excluirProdutos();
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuProdutos();
        }
    }

    public void cadastrarProdutos() {
        Produtos produto = new Produtos();
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Preencha o Cadastro!!");
        System.out.println("Código do Produto: ");
        produto.setCodigoProdutos(cadastro.next());
        System.out.println("Nome do Modelo:");
        produto.setModelo(cadastro.next());
        System.out.println("Tamanho : (P, M, G)");
        produto.setTamanho(cadastro.next());
        System.out.println("Valor do Modelo:");
        produto.setValorDoModelo(cadastro.nextDouble());
        produtos.add(produto);
        menuProdutos();

    }

    public void alterarProdutos() {
        Produtos produto = new Produtos();
        Scanner cadastro = new Scanner(System.in);
        Scanner alt = new Scanner(System.in);
        System.out.println("Qual o Indice do produto deseja alterar?");
        int indice = alt.nextInt();
        produtos.set(indice, produto);

        System.out.println("Preencha o Cadastro!!");
        System.out.println("Código do Produto: ");
        produto.setCodigoProdutos(cadastro.next());
        System.out.println("Nome do Modelo:");
        produto.setModelo(cadastro.next());
        System.out.println("Tamanho : (P, M, G)");
        produto.setTamanho(cadastro.next());
        System.out.println("Valor do Modelo:");
        produto.setValorDoModelo(cadastro.nextDouble());

        menuProdutos();

    }

    public void excluirProdutos() {
        Produtos produto = new Produtos();
        Scanner excluir = new Scanner(System.in);
        System.out.println("Qual o Indice do produto deseja excluir?");
        int indice = excluir.nextInt();
        produtos.remove(indice);
        menuProdutos();
    }

    public void menuConsultarProdutos() {
        System.out.println("##--Menu Consultar produtos--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Todos os Produtos |\n");
        System.out.print("| 2 - Consulta pelo codigo do produto |\n");
        System.out.print("| 3 - Consulta por tamanho |\n");
        System.out.print("| 4 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                todosProdutos();
                break;
            case 2:
                codigoProdutos();
                break;
            case 3:
                tamanhoProdutos();
                break;
            case 4:
                menuProdutos();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuConsultarProdutos();
        }
    }

    public void todosProdutos() {
        Produtos produto = new Produtos();
        Scanner todos = new Scanner(System.in);
        System.out.println("Lista de Todos os Funcionários");

        for (Produtos td : produtos) {
            System.out.println("Codigo do Produto:" + td.getCodigoProdutos());
            System.out.println("Nome do modelo:" + td.getModelo());
            System.out.println("Tamanho:" + td.getTamanho());
            System.out.println("Valor do modelo:" + td.getValorDoModelo());
        }
        menuConsultarProdutos();
    }

    public void codigoProdutos() {
        Produtos produto = new Produtos();
        Scanner c = new Scanner(System.in);
        System.out.println("Qual o codigo do produto a ser consultado?");
        String codigo = c.next();
        boolean achou = false;
        for (Produtos td : produtos) {
            if (codigo.equals(td.getCodigoProdutos())) {
                System.out.println("Codigo do Produto:" + td.getCodigoProdutos());
                System.out.println("Nome do modelo:" + td.getModelo());
                System.out.println("Tamanho:" + td.getTamanho());
                System.out.println("Valor do modelo:" + td.getValorDoModelo());
                achou = true;
            }
        }
        if (achou = false) {
            System.out.println("Codigo não encontrado!");
        }

        menuConsultarProdutos();

    }

    public void tamanhoProdutos() {
        Produtos produto = new Produtos();
        Scanner todos = new Scanner(System.in);
        System.out.println("Digite o Tamanho: ");
        String tam = todos.nextLine();

        for (Produtos td : produtos) {
            if (tam.toLowerCase().equals(td.getTamanho())) {
                System.out.println("Codigo do Produto:" + td.getCodigoProdutos());
                System.out.println("Nome do modelo:" + td.getModelo());
                System.out.println("Tamanho:" + td.getTamanho());
                System.out.println("Valor do modelo:" + td.getValorDoModelo());

            }
        }
        menuConsultarProdutos();
    }

    public void menuVendas() {
        System.out.println("##--Pagina de Vendas--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Cadastrar |\n");
        System.out.print("| 2 - Alterar |\n");
        System.out.print("| 3 - Consultar |\n");
        System.out.print("| 4 - Excluir |\n");
        System.out.print("| 5 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                cadastrarVendas();
                break;
            case 2:
                alterarVendas();
                break;
            case 3:
                menuConsultarVendas();
                break;
            case 4:
                excluirVendas();
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuVendas();
        }
    }

    public void cadastrarVendas() {
        Vendas venda = new Vendas();
        Scanner vend = new Scanner(System.in);
        boolean resp;
        String codigo, codigovenda;
        System.out.println("Codigo da venda:");
        codigovenda = vend.nextLine();

        System.out.println("Codigo do Produto:");
        codigo = vend.nextLine();
        resp = buscarProdutos(codigo);
        if (resp) {
            venda.setCodigoProdutos(codigo);
        } else {
            System.out.println("Codigo do produto Inexistente !!!");
            menuVendas();
        }

        System.out.println("Codigo do cliente:");
        codigo = vend.nextLine();
        resp = buscarClientes(codigo);
        if (resp) {
            venda.setCodigoClientes(codigo);
        } else {
            System.out.println("Codigo do cliente Inexistente !!!");
            menuVendas();
        }

        System.out.println("Codigo do funcionário:");
        codigo = vend.nextLine();
        resp = buscarFuncionarios(codigo);
        if (resp) {
            venda.setCodigoFuncionarios(codigo);
        } else {
            System.out.println("Codigo do funcionario Inexistente !!!");
            menuVendas();
        }
        venda.setCodigoVenda(codigovenda);
        System.out.println("Valor da venda:");
        venda.setVenda(vend.nextDouble());
        vendas.add(venda);
        menuVendas();
    }

    public boolean buscarProdutos(String c) {
        for (Produtos cr : produtos) {
            if (c.equals(cr.getCodigoProdutos())) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarClientes(String c) {
        for (Clientes cr : clientes) {
            if (c.equals(cr.getCodigoClientes())) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarFuncionarios(String c) {
        for (Funcionarios cr : funcionarios) {
            if (c.equals(cr.getCodigoFuncionarios())) {
                return true;
            }
        }
        return false;
    }

    public void alterarVendas() {
        System.out.println("Digite os NOVOS DADOS:");
        Vendas venda = new Vendas();
        Scanner alt = new Scanner(System.in);

        Scanner vend = new Scanner(System.in);
        System.out.println("Qual o indice da venda a seralterada?");
        int indice = vend.nextInt();
        vendas.set(indice, venda);

        System.out.println("Codigo da venda:");
        venda.setCodigoVenda(alt.nextLine());
        System.out.println("Codigo do produto:");
        venda.setCodigoProdutos(alt.nextLine());
        System.out.println("Codigo do cliente:");
        venda.setCodigoClientes(alt.nextLine());
        System.out.println("Codigo do funcionário:");
        venda.setCodigoFuncionarios(alt.nextLine());
        System.out.println("Valor da venda:");
        venda.setVenda(alt.nextDouble());

        menuVendas();
    }

    public void excluirVendas() {
        Scanner e = new Scanner(System.in);
        System.out.println("Qual o INDICE da venda a ser Excluida?");
        int i = e.nextInt();
        vendas.remove(i);
        menuVendas();
    }

    public void menuConsultarVendas() {
        System.out.println("##--Menu Consultar Vendas--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Todos as Vendas |\n");
        System.out.print("| 2 - Consulta pelo codigo de Vendas |\n");
        System.out.print("| 3 - Consultar valor adiquirido |\n");
        System.out.print("| 4 - Sair |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                todosVendas();
                break;
            case 2:
                codigoVendas();
                break;
            case 3:
                valorVendas();
                break;
            case 4:
                menuVendas();
                break;
            default:
                System.out.println("Opção Invalida!, Digite uma opção válida!");
                menuConsultarVendas();
        }
    }

    public void todosVendas() {
        Vendas venda = new Vendas();
        Clientes cliente = new Clientes();
        Funcionarios funcionario = new Funcionarios();
        Produtos produto = new Produtos();
        Scanner todos = new Scanner(System.in);
        System.out.println("Lista de Todos as vendas");

        for (Vendas td : vendas) {
            System.out.println("Codigo do Produto:" + td.getCodigoVenda());
            System.out.println("Codigo do Clientes:" + td.getCodigoClientes());
            System.out.println("Codigo do Funcionários:" + td.getCodigoFuncionarios());
            System.out.println("Valor do modelo:" + td.getVenda());
            
        }
        menuConsultarVendas();
    }

    public void codigoVendas() {
        Vendas venda = new Vendas();
        Clientes cliente = new Clientes();
        Funcionarios funcionario = new Funcionarios();
        Produtos produto = new Produtos();
        Scanner c = new Scanner(System.in);
        System.out.println("Qual o codigo da venda a ser consultado?");
        String codigo = c.next();
        boolean achou = false;
        for (Vendas td : vendas) {
            if (codigo.equals(td.getCodigoVenda())) {
                System.out.println("Codigo do Produto:" + td.getCodigoVenda());
                System.out.println("Codigo do Clientes:" + td.getCodigoClientes());
                System.out.println("Codigo do Funcionários:" + td.getCodigoFuncionarios());
                System.out.println("Valor do modelo:" + td.getVenda());

                achou = true;
            }
        }
        if (achou = false) {
            System.out.println("Codigo não encontrado!");
        }

        menuConsultarVendas();

    }

    public void valorVendas() {
        Vendas venda = new Vendas();
        Scanner todos = new Scanner(System.in);
        double somatotal = 0;

        System.out.println("Valor Total Adiquirido:");

        for (Vendas td : vendas) {
            somatotal = (somatotal + td.getVenda());
        }
        System.out.println(somatotal);
        menuConsultarVendas();
    }

}
