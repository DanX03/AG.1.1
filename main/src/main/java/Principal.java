void main() {
        int num1 = 10;
        int num2 = 20;
        char operator = '+';
        int resultado;

        switch (operator) {
            case '+' -> {
                resultado = num1 + num2;
            }
            default ->
                    resultado = 0;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + resultado);
    }

    void ejercicio1() {

        int num1, num2;

    /*
    Creo el objeto Scanner que me permite recibir informacion por teclado
     */

        Scanner entrada = new Scanner(System.in);

    /*
    Pido ambos numeros y los guardo en las variables
     */

        System.out.print("Introduce el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = entrada.nextInt();

        int suma = 0;

        suma = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + suma);

        entrada.close();

    }

    void ejercicio2() {

        int num = 10;
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }   else {
            System.out.println("El numero es impar");
        }

    }

    void ejercicio3() {
        int num1 = 10;
        int num2 = 25;
        int num3 = 5;

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("El mayor numero de los introducidos es el: " + max);

    }

