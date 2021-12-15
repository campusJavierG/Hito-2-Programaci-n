
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear trabajador1
		Trabajador trabajador1=new Trabajador("Paco","Madrid", 1300f, 6);
		//ficha del trabajador
		System.out.println(trabajador1.toString() );
		//crear hija1
		Hija hija1=new Hija();
		//iniciar saludar desde hija
		hija1.Saludar();
		//genero tres ping�inos
		Pinguino pinguino1=new Pinguino();
		Pinguino pinguino2=new Pinguino();
		Pinguino pinguino3=new Pinguino();
		//genero tres focas
		Foca foca1=new Foca();
		Foca foca2=new Foca();
		Foca foca3=new Foca();
		//creo un array con los 3 ping�inos
		Animal calurosos[]= {pinguino1,pinguino2,pinguino3,foca1,foca2,foca3};
				// dentro de los corchetes se pone la posici�n
		calurosos[4].correr();
	}

}
