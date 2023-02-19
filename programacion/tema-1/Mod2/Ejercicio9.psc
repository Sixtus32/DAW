Algoritmo sin_titulo
	Definir salario, precioHora, precioHoraExtra, horasExtra Como Real
	precioHora<-10
	precioHoraExtra<-15
	Escribir "Introduce el numero de horas extra"
	Leer horasExtra
	Mientras horasExtra<>0 Hacer
		salario <-precioHora*8 + horasExtra*precioHoraExtra
		Escribir "El salario es " salario
		Escribir "Introduce el numero de horas extra"
		Leer horasExtra
	FinMientras
FinAlgoritmo
