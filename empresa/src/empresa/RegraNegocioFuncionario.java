package empresa;
import java.util.ArrayList;
public class RegraNegocioFuncionario {
	
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	public void listarFuncionarios() {
		for(Funcionario f: funcionarios) {
			System.out.println(f.toString());
		}
	}
}
