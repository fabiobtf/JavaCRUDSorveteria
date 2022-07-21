package Repositorio;

import java.util.List;

import Entidades.Sorvete;

public interface IRepositorioSorvete {

	public boolean salvaSorvete(Sorvete sorvete);
	public boolean deletarSorvetePorID(int id);
	public List<Sorvete> listarSorvete();
	public boolean alteraSorvete(Sorvete pessoa);
	
}
