public class ProgramaListaDuplamenteEncadeada {
//PROGRAMA LISTA DUPLAMENTE ENCADEADAS
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		System.out.println(lista.ShowList());
		lista.Insere("Jovem");
		System.out.println(lista.ShowList());
		lista.InsereF("Young");
		System.out.println(lista.ShowList());
		lista.Insere("Jovem 2");
		System.out.println(lista.ShowList());
		lista.InsereF("Rubens");
		System.out.println(lista.ShowList());
		lista.Remove();
		System.out.println(lista.ShowList());
		lista.RemoveF();
		System.out.println(lista.ShowList());
		System.out.println(lista.Verifica("Young"));
		System.out.println(lista.Verifica("Jovem 2"));

	}

}
