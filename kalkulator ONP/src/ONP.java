import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ONP {
		private TabStack stack = new TabStack();

		boolean czyPoprawneRownanie(String rownanie) {
			if (rownanie.endsWith("="))
				return true;
			else
				return false;
		}
		public void zapisDoPliku(String rownanie) throws IOException {
			
			
			Writer output = new BufferedWriter(new FileWriter("historiaOperacji.txt", true)); 
			((BufferedWriter) output.append(rownanie)).newLine();
			output.close();
			
		}
		
		public double silnia(double a) {
			int pom = (int) a;
			double wynik = 1;
			while (pom > 1) {
				wynik = wynik * pom;
				pom -= 1;
			}
			return wynik;
		}
		
		public static void sprawdzNawiasy(String rownanie) throws IllegalArgumentException {
			int licznik1 = 0;
			int licznik2 = 0;
			for(int i=0;i<rownanie.length();i++) {
				if(rownanie.charAt(i)=='(')
					licznik1++;
				if(rownanie.charAt(i)==')')
					licznik2++;	
			}
			if(licznik1 != licznik2)
				throw new IllegalArgumentException();
			
		}
		public double pierwiastek(double a, double n){
		
		double result = a;
	
		double tmp = Math.pow(result,(n-1));
		
		double e = 0.00000001;
		
		
		while (Math.abs(a - tmp * result)>= e)
		{
		result = 1/n*((n-1)*result + (a/tmp));
	
		tmp = Math.pow(result, n-1);
		}
		return result;
		}
		public String obliczOnp(String rownanie) throws RuntimeException {
			if (czyPoprawneRownanie(rownanie)) {
				String wynik = "";
				Double a = 0.0;
				Double b = 0.0;
				for (int i = 0; i < rownanie.length(); i++) {
					if ((rownanie.charAt(i) >= '0' && rownanie.charAt(i) <= '9') || (rownanie.charAt(i) == '.'))   {	
						wynik += rownanie.charAt(i);
						
						if (!(rownanie.charAt(i + 1) >= '0' && rownanie.charAt(i + 1) <= '9') && !(rownanie.charAt(i + 1) == '.')) {
							stack.push(wynik);
							wynik = "";
						}

					} else if (rownanie.charAt(i) == '=') {
						return stack.pop();
					} else if (rownanie.charAt(i) != ' ') {
						b = Double.parseDouble(stack.pop());
						if(rownanie.charAt(i) != '!')
						a = Double.parseDouble(stack.pop());
						switch (rownanie.charAt(i)) {
						case ('+'): {
							stack.push("" + (a + b));
							break;
						}
						case ('-'): {
							stack.push("" + (a - b));
							break;
						}
						case ('x'):
							;
						case ('*'): {
							stack.push((a * b) + "");
							break;
						}
						case ('/'): {
							if(b!=0) {
							stack.push((a / b) + "");
							break;
							}
							else
								throw new ArithmeticException();
						}
						case ('^'): {
							stack.push(Math.pow(a, b) + "");
							break;
						}
						case ('!'): {
							stack.push(silnia(b) + "");
							break;
						}
						case ('%'): {
							stack.push((a % b) + "");
							break;
						}
						case ('\u221A'): {
							if(a<0 && b%2==0){
								throw new WrongRootArguments();
							}
							stack.push(pierwiastek(b,a) + "");
							break;
						}
						
						}
					}
				}
				return "0.0";
			} else
				throw new RuntimeException();
		}

		
		public String przeksztalcNaOnp(String rownanie) {
			sprawdzNawiasy(rownanie);
			
			if (czyPoprawneRownanie(rownanie)) {
				String wynik = "";
				for (int i = 0; i < rownanie.length(); i++) {
					if ((rownanie.charAt(i) >= '0' && rownanie.charAt(i) <= '9') || (rownanie.charAt(i) == '.') ) {
						
						wynik += rownanie.charAt(i);
						
						if (!(rownanie.charAt(i + 1) >= '0' && rownanie.charAt(i + 1) <= '9') && !(rownanie.charAt(i+1) == '.'))
							wynik += " ";
					} else {
						switch (rownanie.charAt(i)) {
						case ('+'):
							;	
						case ('-'): {
							while (stack.getSize() > 0 && !stack.showValue(stack.getSize() - 1).equals("(")) {
								wynik = wynik + stack.pop() + " ";
							}
							String str = "" + rownanie.charAt(i);
							stack.push(str);
							break;
						}
						case ('x'):
							;
						case ('*'):
							;
						case ('/'): {
							while (stack.getSize() > 0 && !stack.showValue(stack.getSize() - 1).equals("(")
									&& !stack.showValue(stack.getSize() - 1).equals("+")
									&& !stack.showValue(stack.getSize() - 1).equals("-")) {
								wynik = wynik + stack.pop() + " ";
							}
							String str = "" + rownanie.charAt(i);
							stack.push(str);
							break;
						}
						case ('^'): {
							while (stack.getSize() > 0 && stack.showValue(stack.getSize() - 1).equals("^")) {
								wynik = wynik + stack.pop() + " ";
							}
							String str = "" + rownanie.charAt(i);
							stack.push(str);
							break;
						}
						case ('!'): {
							while (stack.getSize() > 0 && stack.showValue(stack.getSize() - 1).equals("^")) {
								wynik = wynik + stack.pop() + " ";
							}
							String str = "" + rownanie.charAt(i);
							stack.push(str);
							break;
						}
						case ('%'): {
							while (stack.getSize() > 0 && stack.showValue(stack.getSize() - 1).equals("^")) {
								wynik = wynik + stack.pop() + " ";
							}
							String str = "" + rownanie.charAt(i);
							stack.push(str);
							break;
						}
						case ('\u221A'): {
							while (stack.getSize() > 0 && stack.showValue(stack.getSize() - 1).equals("^")) {
								wynik = wynik + stack.pop() + " ";
							}
							String str = "" + rownanie.charAt(i);
							stack.push(str);
							break;
						}
						
						case ('('): {
							String str = "" + rownanie.charAt(i);
							stack.push(str);
							break;
						}
						case (')'): {
							while (stack.getSize() > 0 && !stack.showValue(stack.getSize() - 1).equals("(")) {
								wynik = wynik + stack.pop() + " ";
							}
							// zdjêcie ze stosu znaku (
							stack.pop();
							break;
						}
						
					
						case ('='): {
							while (stack.getSize() > 0) {
								wynik = wynik + stack.pop() + " ";
							}
							wynik += "=";
						}
						}
					}
				}
				return wynik;
			} else
				return "null";
		}

		
	}

class WrongRootArguments extends ArithmeticException{
	WrongRootArguments(){
		;
	}
}