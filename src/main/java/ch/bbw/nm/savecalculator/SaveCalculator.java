package ch.bbw.nm.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author Nico Menzi
 * @version 1.0.0
 */
public class SaveCalculator {
	public int summe(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	//Noch un-safe Methoden, die müssen noch angepasst werden.
	public int subtraktion(int subtrahend1, int subtrahend2) throws ArithmeticException

	{
		long value = (long) subtrahend1 - (long) subtrahend2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return subtrahend1 - subtrahend2;

	}
	public double division(int dividend1, int dividend2) throws ArithmeticException
	{
		if (dividend1 != 0 && dividend2 != 0  ) {
			long value = (long) dividend1 / (long) dividend2;
			if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
				throw new ArithmeticException();
			}
		} else{
			throw new ArithmeticException();
		}
		return dividend1 / dividend2;
	}

	private double multiplication(int multiplikator1, int multiplikator2) throws ArithmeticException
	{
		long value = (long) multiplikator1 * (long) multiplikator2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return multiplikator1 * multiplikator2;

	}

}
