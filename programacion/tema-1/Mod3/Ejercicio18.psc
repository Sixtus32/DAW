Algoritmo DEC_HEX
	//Entorno
	cociente, resto Es Entero
	hex, re, re2, final Es Caracter
	hex <- ''
	re <- ''
	re2 <- ''
	final <- ''
	resto <- 0
	cociente <- 0
	Escribir "Introduce un numero decimal "
	Leer cociente
	Repetir
		si cociente <=15 entonces 	//si el número es menor que 16 no dividimos, ya que la conversión es directa
			resto <- cociente
			cociente <- 0
		sino 
			resto <- cociente mod 16
			cociente <- trunc(cociente/16)
		finsi
				
		Si resto = 10 Entonces
			hex  <- Concatenar('A',hex)
		SiNo
			Si resto = 11 Entonces
				hex  <- Concatenar('B',hex)
			SiNo
				Si resto = 12 Entonces
					hex  <- Concatenar('C',hex)
				SiNo
					Si resto = 13 Entonces
						hex  <- Concatenar('D',hex)
					SiNo
						Si resto =14 Entonces
							hex  <- Concatenar('E',hex)
						SiNo
							Si resto = 15 Entonces
								hex  <- Concatenar('F',hex)
							SiNo
								Si (resto < 10 o resto > 16 )Entonces
									re <- ConvertirATexto(resto)
									hex <- Concatenar(re,hex)
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
			
	Hasta Que cociente <10
	
	Si cociente >= 0 Entonces
		re2 <- ConvertirATexto(cociente)
		final <- Concatenar(re2, hex)
	FinSi
	Escribir "El numero convertido " final
	
FinAlgoritmo
