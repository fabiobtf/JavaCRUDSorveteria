import Repositorio.RepositorioSorvete;
import Entidades.Sorvete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Teste{
	static RepositorioSorvete rp = new RepositorioSorvete();
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1. Acicionar:");
            System.out.println("2. Display:");
            System.out.println("3. Deletar:");
            System.out.println("4. Atualizar:");
            System.out.println("Selecione sua Opcao:");
            ch = s.nextInt();

            switch(ch){
                case 1:
				popularArray();
				break;
				case 2:
				listarSorvete();
				break;
				case 3:
				int c;
				System.out.println("Qual o ID do Sorvete que Voce Deseja Deletar?");
				c = s.nextInt();
				rp.deletarSorvetePorID(c);
				break;
				case 4:
				alterar();
				break;
			}
		}while(ch!=0);
	}

	public static void alterar(){
		Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
		Sorvete sorvete = new Sorvete();
		boolean salvo;
		int Id;
		String Nome;
		String DescricaoIngr;
		String DataFab;
		String DataVal;
		int Quantidade;
		String Tipo;
		String Alergicos;

		System.out.println("DADOS NOVOS:");

		System.out.println("Qual o ID?");
		Id = s.nextInt();
		sorvete.setId(Id);

		System.out.println("Qual o Sabor?");
		Nome = s1.nextLine();
		sorvete.setNome(Nome);

		System.out.println("Qual a Descricao de Ingredientes?");
		DescricaoIngr = s1.nextLine();
		sorvete.setDescricaoIngr(DescricaoIngr);

		System.out.println("Qual a Data de Fab.?");
		DataFab = s1.nextLine();
		sorvete.setDataFab(DataFab);

		System.out.println("Qual a Data de Val.?");
		DataVal = s1.nextLine();
		sorvete.setDataVal(DataVal);

		System.out.println("Qual a Quantidade?");
		Quantidade = s.nextInt();
		sorvete.setQuantidade(Quantidade);

		System.out.println("Qual o tipo?");
		Tipo = s1.nextLine();
		sorvete.setTipo(Tipo);

		System.out.println("Quais os Alergicos?");
		Alergicos = s1.nextLine();
		sorvete.setAlergicos(Alergicos);

		rp.alteraSorvete(sorvete);
	}

	public static void popularArray(){
		Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
		Sorvete sorvete = new Sorvete();
		boolean salvo;
		int Id;
		String Nome;
		String DescricaoIngr;
		String DataFab;
		String DataVal;
		int Quantidade;
		String Tipo;
		String Alergicos;

		System.out.println("Qual o ID?");
		Id = s.nextInt();
		sorvete.setId(Id);

		System.out.println("Qual o Sabor?");
		Nome = s1.nextLine();
		sorvete.setNome(Nome);

		System.out.println("Qual a Descricao de Ingredientes?");
		DescricaoIngr = s1.nextLine();
		sorvete.setDescricaoIngr(DescricaoIngr);

		System.out.println("Qual a Data de Fab.?");
		DataFab = s1.nextLine();
		sorvete.setDataFab(DataFab);

		System.out.println("Qual a Data de Val.?");
		DataVal = s1.nextLine();
		sorvete.setDataVal(DataVal);

		System.out.println("Qual a Quantidade?");
		Quantidade = s.nextInt();
		sorvete.setQuantidade(Quantidade);

		System.out.println("Qual o tipo?");
		Tipo = s1.nextLine();
		sorvete.setTipo(Tipo);

		System.out.println("Quais os Alergicos?");
		Alergicos = s1.nextLine();
		sorvete.setAlergicos(Alergicos);


		salvo = rp.salvaSorvete(sorvete);
		if (salvo){
			System.out.println(" Salvo com Sucesso!");
		}
	}


	public static void listarSorvete(){
		List<Sorvete> lista = new ArrayList<Sorvete>();

		lista = rp.listarSorvete();

		System.out.println("---------------------------------------------------------");
		System.out.println("Temos os Seguintes Sorvetes no Estoque:");
		
		for (Sorvete sorvete: lista){
			System.out.println("---------------------------------------------------------");
			System.out.println("ID: "+sorvete.getId());
			System.out.println("Sabor: "+sorvete.getNome());
			System.out.println("Ingredientes: "+sorvete.getDescricaoIngr());
			System.out.println("Data Fab.: "+sorvete.getDataFab());
			System.out.println("Data Val.: "+sorvete.getDataVal());
			System.out.println("Quantidade: "+sorvete.getQuantidade());
			System.out.println("Tipo: "+sorvete.getTipo());
			System.out.println("Alergicos: "+sorvete.getAlergicos());
			System.out.println("---------------------------------------------------------");

		}
	}
}
