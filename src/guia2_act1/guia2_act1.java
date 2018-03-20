 /* EJERCICIO 1 Guia2_act1
 * YEISSON ROMERO
 * UNIVERSIDAD EAN
 * CONSTRUCCION DE SOFTWARE GUIA 3
 */
package guia2_act1;

/**
 *
 * @author YROMERO
 */
public class guia2_act1
{
	
	public static void main(String [ ] args) {
		Dupla primerPar = new Dupla();
		int x=0,y=0;
		primerPar.Guarda(12,32);
		primerPar.Lee(x, y);
		System.out.print("Valor de primerPar.a: "+ primerPar.getA() +"\n");
		System.out.print("Valor de primerPar.b: "+ primerPar.getB() +"\n");
	}
	
}