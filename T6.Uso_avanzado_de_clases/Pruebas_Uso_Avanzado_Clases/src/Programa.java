
public class Programa {

	public static void main(String[] args) {
		Administrativo a1 = new Administrativo("Mariano", 4, 1000, 50);
		Freelance f1 = new Freelance("Pepito", 32, 890, 20.5);
		Programador p1 = new Programador("Andr�s", 21, 1300, 2.2);
		
		System.out.println("Salario de freelance: "+f1.calculoSalario());
		System.out.println("Salario de administrativo: "+a1.calculoSalario());
		System.out.println("Salario de programador: "+p1.calculoSalario());
	}

}
