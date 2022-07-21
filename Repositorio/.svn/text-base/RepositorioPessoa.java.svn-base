package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Entidades.Pessoa;

public class RepositorioPessoa implements IRepositorioPessoa {

	List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

	@Override
	public boolean salvaPessoa(Pessoa pessoa) {

		try {

			listaPessoas.add(pessoa);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	@Override
	public boolean deletarPessoaPorID(long id) {

		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getId() == id) {
				listaPessoas.remove(pessoa);
			}
		}

		return false;
	}

	@Override
	public List<Pessoa> listarPessoa() {
		// TODO Auto-generated method stub
		return this.listaPessoas;
	}

	@Override
	public boolean alteraPessoa(Pessoa pessoa) {

		for (Pessoa pessoa1 : listaPessoas) {
			if (pessoa1.getId() == pessoa.getId()) {
				
				listaPessoas.remove(pessoa1);
				listaPessoas.add(pessoa);
			}
		}
		return false;
	}

}
