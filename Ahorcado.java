class Ahorcado
{
	public static void main (String[] args)
	{
		String cadena = "camaron que se duerme se lo lleva la corriente", guion, temp = " ";
		char opc = 's', letra = ' ';
		int cont = cadena.length();
		
		System.out.println("AHORCADO");
		do{
			System.out.println("Adivina la frase, tienes 18 intentos");
			System.out.println("Ingresa una letra");
			for(int i = 0; i < cont; i++){
				if(cadena.charAt(i) == ' '){
					System.out.print(" ");
				}
				else{
					System.out.print('_');
				}
			}
			for(int intentos = 18; intentos >= 0; intentos--){
				System.out.println(" ");
				letra = Leer.datoChar();
				for(int j = 0; j < cont; j++){
					if(letra == cadena.charAt(j)){
						System.out.print(letra);
					}
					else{
						if(cadena.charAt(j) == ' '){
							System.out.print(" ");
						}
						else{
							System.out.print('_');
						}
					}
				}
			}
			System.out.println("Jugar de nuevo?");
		}
		while(opc == 's');
	}
}