Algoritmo sin_titulo
//	1. Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//	actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//	puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
	//	cantidad total de niños, y la cantidad total de niñas que hay en el curso.
//	Definir cant_niños Como Real
//	Definir  sumaTotal Como Real
//	Definir cant_niñas Como Real
//	Definir operacionNiños Como Real
//	Definir operacionNiñas Como Real
//	Escribir "ingrese la cantidad de niños"
//	Leer cant_niños
//	Escribir "ingrese la cantidad de niñas"
//	Leer cant_niñas
//	sumaTotal=cant_niñas+cant_niños 
//	operacionNiños= (100/sumaTotal)*cant_niños
//	operacionNiñas=(100/sumaTotal)*cant_niñas
//	Escribir "Porcentaje de  cantidad de niños ", operacionNiños
//	Escribir "Porcentaje  cantidad de niñas ", operacionNiñas 
//	
//	2. Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
//	pantalla el área y perímetro del mismo
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
//	3.Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar al
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
	
	
//    4.A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//	un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
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
//	año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
	//	porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.
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

