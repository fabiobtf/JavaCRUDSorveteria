import java.util.ArrayList;
import java.util.List;

import Entidades.Pessoa;
import Repositorio.RepositorioPessoa;

public class Teste {
	private static RepositorioPessoa rp = new RepositorioPessoa();

	public static void main(String[] args) {

		popularArray();
		listarPessoas();
		rp.deletarPessoaPorID(2);
		listarPessoas();
		alterar();
		listarPessoas();
	}
	
	public static void alterar(){
		
		Pessoa pessoa = new Pessoa();
		pessoa.setApelido("Zé");
		pessoa.setId(3);
		pessoa.setIdade(23);
		pessoa.setNome("Jose Francisco");
		rp.alteraPessoa(pessoa);
	}

	public static void popularArray() {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setApelido("Rud");
		pessoa1.setId(1);
		pessoa1.setIdade(19);
		pessoa1.setNome("Rudson Porfirio");
		rp.salvaPessoa(pessoa1);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setApelido("Fu");
		pessoa2.setId(2);
		pessoa2.setIdade(29);
		pessoa2.setNome("Fulano ");
		rp.salvaPessoa(pessoa2);

		Pessoa pessoa = new Pessoa();
		pessoa.setApelido("Zé");
		pessoa.setId(3);
		pessoa.setIdade(23);
		pessoa.setNome("Jose Pereira");
		rp.salvaPessoa(pessoa);

	}

	public static void listarPessoas() {

		List<Pessoa> lista = new ArrayList<Pessoa>();

		lista = rp.listarPessoa();

		for (Pessoa pessoa : lista) {

			System.out.println("Id : " + pessoa.getId());
			System.out.println("Nome : " + pessoa.getNome());
			System.out.println("Apelido : " + pessoa.getApelido());
			System.out.println("Idade : " + pessoa.getIdade());
			System.out.println("--------------------------------------");

		}

	}

}
