Algoritmo sin_titulo
//	1. Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//	actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//	puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
	//	cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.
//	Definir cant_ni�os Como Real
//	Definir  sumaTotal Como Real
//	Definir cant_ni�as Como Real
//	Definir operacionNi�os Como Real
//	Definir operacionNi�as Como Real
//	Escribir "ingrese la cantidad de ni�os"
//	Leer cant_ni�os
//	Escribir "ingrese la cantidad de ni�as"
//	Leer cant_ni�as
//	sumaTotal=cant_ni�as+cant_ni�os 
//	operacionNi�os= (100/sumaTotal)*cant_ni�os
//	operacionNi�as=(100/sumaTotal)*cant_ni�as
//	Escribir "Porcentaje de  cantidad de ni�os ", operacionNi�os
//	Escribir "Porcentaje  cantidad de ni�as ", operacionNi�as 
//	
//	2. Solicitar al usuario que ingrese la base y altura de un rect�ngulo, y calcular y mostrar por
//	pantalla el �rea y per�metro del mismo
//	area = base * altura
//	perimetro = 2 * altura + 2 * base.
//	Definir base Como Real
//	Definir altura Como Real
//	Definir area Como Real
//	Definir perimetro Como Real
//	Escribir "ingrese la altura del rectangulo"
//	Leer altura
//	Escribir "ingrese la base del rectangulo"
//	Leer base
//	area = base * altura
//	perimetro = 2 * altura + 2 * base
//	Escribir "La area es:", area
	//	Escribir "El  perimetro es ", perimetro
//	3.Escribir un programa que calcule el volumen de un cilindro. Para ello se deber� solicitar al
//		usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
	//		volumen = ? * radio2 * altura
//	Definir  volumen Como Real
//	Definir  altura Como Real
//	Definir  Radio Como Real
//	Escribir "Ingresar el radio del cilindro" 
//	Leer  Radio 
//	Escribir "Ingresar la altura del cilindro" 
//	Leer altura 
//	volumen = PI*(Radio*Radio)*altura
//	Escribir "El volumen es :" , volumen	
	
	
//    4.A partir de una conocida cantidad de d�as que el usuario ingresa a trav�s del teclado, escriba
//	un programa para convertir los d�as en horas, en minutos y en segundos. Por ejemplo
//	Definir dias Como Entero
//	Definir horas Como Entero
//	Definir minutos Como Entero
//	Definir seg Como Entero
//	Escribir "ingrese el Dia"
//	Leer dias 
//	horas = dias*24
//	seg = dias*1440
//	minutos = dias*86400
//	Escribir "El dia : ",dia,"tiene ",seg," segundos" 
//	Escribir "El dia : ",dia,"tiene ",minutos," minutos" 
//	Escribir "El dia : ",dia,"tiene ",horas," horas" 
//	5. Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//	a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l fue el
	//	porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.
	Definir precioInicial Como Real
	Definir  precioFinal Como Real
	Definir porcentajeAumento Como Real
	Definir diferencia Como Real
	Escribir "Ingrese Precio Inicial "
	Leer precioInicial
	Escribir "Ingrese Precio Final "
	Leer precioFinal
	diferencia=(precioFinal-precioInicial)
	porcentajeAumento=(diferencia/precioFinal)*100
	Escribir  "El porcentaje del aumento es de : " ,porcentajeAumento
	

FinAlgoritmo

