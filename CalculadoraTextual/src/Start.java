import java.util.Scanner;
public class Start {
	//las funciones deben ir fuera del método main y no tener syso
	
	public static float suma(float num1,float num2) {
		return num1 +num2;
		
	}
	
	public static float resta(float num1,float num2) {
			return num1-num2;
			
		}
	public static float multiplicacion(float num1,float num2) {
		return num1*num2;
		
	}
	public static float division(float num1,float num2) {
		return num1/num2;
		
	}
	public static float mayor(float num1,float num2,float num3) {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
			} else if (num2 >= num1 && num2 >= num3) {
			return num2;
			} else {
			return num3;
			}
	}
	public static long factorial(int num1) {
		 long result = 1;
	        for (int i = 2; i <= num1; i++) {
	            result *= i;
	        }
	        return result;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int opcion;
        float resultado;
       
      
        
        // me pide que antes de el indice de opciones aparezca un mensaje:
        System.out.println("Calculadora de Calculator S.A");
        
     // despliego el menu 
        do {
            System.out.println("\nIntroduzca una opción del menú: ");
            System.out.println("1. Función Sumar");
            System.out.println("2. Función Restar");
            System.out.println("3. Función Multiplicar");
            System.out.println("4. Función Dividir");
            System.out.println("5. Función Número mayor de 3 números");
            System.out.println("6. Función Factorial");
            System.out.println("0. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextInt();
            float num1;
            float num2;
            float num3;
            

            switch (opcion) {
                case 1:
                	System.out.print("Introduzca el primer número flotante a sumar: ");
            		num1 = scanner.nextFloat();
            		System.out.print("Introduzca el segundo número flotante a sumar: ");
            		num2 = scanner.nextFloat();
                	resultado=suma(num1,num2);
                	System.out.println("La suma de "+num1+" y "+num2+" es: " +resultado);
                    break;
                case 2:
                	System.out.print("Introduzca el primer número flotante a restar: ");
            		num1 = scanner.nextFloat();
            		System.out.print("Introduzca el segundo número flotante a restar: ");
            		num2 = scanner.nextFloat();
                	resultado=resta(num1,num2);
                	System.out.println("La resta de "+num1+" y "+num2+" es: " +resultado);
                    break;
                    
                case 3:
                	System.out.print("Introduzca el primer número flotante a multiplicar: ");
            		num1 = scanner.nextFloat();
            		System.out.print("Introduzca el segundo número flotante a multiplicar: ");
            		num2 = scanner.nextFloat();
                	resultado=multiplicacion(num1,num2);
                	System.out.println("La multiplicacion de "+num1+" y "+num2+" es: " +resultado);
                    break;
                    
                case 4:
                	System.out.print("Introduzca el primer número flotante a dividir: ");
            		num1 = scanner.nextFloat();
            		System.out.print("Introduzca el segundo número flotante a dividir: ");
            		num2 = scanner.nextFloat();
            		if (num2==0) {
            			System.out.println("-1. Off");
            		}else {
            		resultado=division(num1,num2);
                	System.out.println("La division de "+num1+" y "+num2+" es: " +resultado);
            		}
                    break;
                    
                case 5:
                	System.out.print("Introduzca el primer número flotante de los tres: ");
            		num1 = scanner.nextFloat();
            		System.out.print("Introduzca el segundo número flotante de los tres: ");
            		num2 = scanner.nextFloat();
            		System.out.print("Introduzca el segundo número flotante de los tres: ");
            		num3 = scanner.nextFloat();
            		resultado=mayor(num1, num2,num3);
                	System.out.println("El número "+resultado+" es el mayor de los tres");
                    break;
                    
                case 6:
                	System.out.print("Introduzca el primer número flotante a dividir: ");
            		int num = scanner.nextInt(); //como nos pide que sea entero hay que adaptarlo
            		if (num < 0) {
            			System.out.println("Error valor inferior a 0 introduzca un valor superior a 0");
            			} else {
            				resultado=factorial(num);
            				System.out.println("El factorial de " + num + " es: " + resultado);
            			}

                    break;
                    
                   

                case 0:
                    System.out.println("El programa ha finalizado.");
                    break;
                default:
                    System.out.println("Opción errónea");
            }
        } while (opcion != 0);

        scanner.close();
   

	}

	
	
}
