package study.operators;

public class InstanceOfOperator {

	public static void main(String[] args) {

		/**
		 * Utilizar o instanceof para comparar um objeto declarado com um tipo
		 * definido (ex: String) com uma outra classe (ex: Date) dá erro de
		 * compilação.
		 */
		// Erro de compilação:
		// String s = "";
		// boolean b = (s instanceof java.util.Date);

		/**
		 * Utilizando um Object não dá erro:
		 */
		// Código ok:
		// Object s = "";
		// boolean b = (s instanceof java.util.Date);

		/**
		 * O erro citado acima não ocorre tratando-se de uma Interface.
		 */
		// Código ok:
		// Class Bat { }
		// Interface Runner { }
		// Bat b = new Bat();
		// boolean a = (b instanceof Runner);

		/**
		 * Para qualquer referência não nula de o1, a expressão (o1 instanceof
		 * Object) sempre será true.
		 */

		/**
		 * O instanceof também serve para Interfaces.
		 */
		// class A implements T1, T2{ }
		// class B extends A { }
		// A a = new A();
		// B b = new B();
		// (a instanceof T1) will return true
		// (b instanceof T1) will return true

		/**
		 * A expressão (esquerda instanceof direita) sempre tem que ter um
		 * objeto (não primitivo) a esquerda e uma classe a direita.
		 */
		// Erro de compilação:
		// String s1 = "";
		// String s2 = "";
		// boolean a = (s1 instanceof s2);
		//
		// Erro de compilação:
		// int k = 9;
		// boolean a = (k instanceof String);
		//
		// Código ok:
		// String s1 = "";
		// boolean a = (s1 instanceof String);
	}

}
