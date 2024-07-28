package empresa;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RegraNegocioEmpresa rne = new RegraNegocioEmpresa();
		RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();
		System.out.print("Quantas empresas deseja cadastrar? ");
		int qtd = input.nextInt();
		input.nextLine();
		
		for(int i=0; i<qtd; i++) {
			
			System.out.print("Digite o nome da empresa "+(i+1)+": ");
			String nomeEmpresa = input.nextLine();
			System.out.print("Digite a cnpj: ");
			String cnpjEmpresa = input.nextLine();
			System.out.print("Digite o telefone: ");
			String telefoneEmpresa = input.nextLine();
			
			Empresa em1 = new Empresa(nomeEmpresa, cnpjEmpresa, telefoneEmpresa);
			rne.cadastrarEmpresa(em1);
			
		}
		
		rne.listarEmpresas();
		
		System.out.print("Quantos funcionarios deseja acadastrar? ");
		int qtdF = input.nextInt();
		input.nextLine();
		for(int i = 0; i<qtdF;i++) {
			System.out.print("Digire o nome do funcionario "+(i+1)+": ");
			String nomeFuncionario = input.nextLine();
			System.out.print("Digite o cpf: ");
			String cpfFuncionario = input.nextLine();
			System.out.print("Digite o rg: ");
			String rgFuncionario = input.nextLine();
			System.out.print("Digite o telefone: ");
			String telefoneFuncionario = input.nextLine();
			
			System.out.print("Digite o nome da empresa que ele trabalha: ");
			String empresaFuncionario = input.nextLine();
			
			Empresa empresa = rne.procurarEmpresa(empresaFuncionario);
			
			if(empresa!= null) {
				Funcionario f1 = new Funcionario(nomeFuncionario, cpfFuncionario, rgFuncionario, telefoneFuncionario, empresa);
				
				rnf.cadastrarFuncionario(f1);
			}
			
		}
		
		rnf.listarFuncionarios();
		input.close();	
	}
	

}
