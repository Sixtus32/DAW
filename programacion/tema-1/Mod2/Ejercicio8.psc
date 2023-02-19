Algoritmo sin_titulo
	Escribir "Introduce un valor"
	Leer unValor
	maximo<-unValor
	contador<-0
	Mientras unValor<>999 Hacer
		si maximo<unValor Entonces
			maximo<-unValor
			contador<-1
		
		Sino 
			si maximo = unValor Entonces
			contador<-contador+1
		FinSi
	FinSi
			Escribir "Introduce un valor"
		Leer unValor
	FinMientras
	Escribir maximo " es el maximo y aparece " contador " veces"
	
FinAlgoritmo
