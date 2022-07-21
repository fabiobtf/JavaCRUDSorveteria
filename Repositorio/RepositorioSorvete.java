package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Entidades.Sorvete;

public class RepositorioSorvete implements IRepositorioSorvete {

	List<Sorvete> listaSorvetes = new ArrayList<Sorvete>();


	@Override
	public boolean salvaSorvete(Sorvete sorvete){

		try{
			listaSorvetes.add(sorvete);
		} catch(Exception e){
			return false;
		}
		return true;
		}



	
	@Override
	public boolean deletarSorvetePorID(int c){
		
		for (Sorvete sorvete : listaSorvetes){
			if (sorvete.getId() == c){
				listaSorvetes.remove(sorvete);
			}
		}
		return false;
	}




	@Override
	public List<Sorvete>listarSorvete(){
		return listaSorvetes;
	}




	public boolean alteraSorvete(Sorvete sorvete){
		for (Sorvete sorvete1 : listaSorvetes){
			if (sorvete1.getId() == sorvete.getId()){
				
				listaSorvetes.remove(sorvete1);
				listaSorvetes.add(sorvete);
			}
		}
		return false;
	}



}
