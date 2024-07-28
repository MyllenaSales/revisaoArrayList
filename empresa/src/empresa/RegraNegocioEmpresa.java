package empresa;
import java.util.ArrayList;
public class RegraNegocioEmpresa {
	
	ArrayList <Empresa> empresas = new ArrayList<Empresa>();
	
	public void cadastrarEmpresa(Empresa empresa) {
		empresas.add(empresa);
	}
	
	public Empresa procurarEmpresa(String nome) {
		for(Empresa e: empresas) {
			if(nome.equalsIgnoreCase(e.getNome())) {
				return e;
			} 
		}
		System.out.println("Essa empresa não existe!");
		return null;
	
	}
	
	public void listarEmpresas() {
		for(Empresa em: empresas) {
			System.out.println(em.toString());
		}
	}
	

}
