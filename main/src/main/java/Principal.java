void main() {
    ejercicio1();
    ejercicio2();
    ejercicio3();
    ejercicio5();
    ejercicio5V2();
    ejercicio6();
    ejercicio7();
    ejercicio8();
    ejercicio9();
    ejercicio10();


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


    void ejercicio5(){

        String user = "admin";

        String password = "1234";

        if (user =="admin" & password == "1234") {

            System.out.println("Acceso concedido");

        } else {
            System.out.println("Acceso denegado");
        }


    }

    void ejercicio5V2() {

        String user,password;
        Scanner entrada = new Scanner(System.in);

        for (int i=0; i < 3;i++) {


            System.out.println("Introduce tu usuario: ");
            user = entrada.next();
            System.out.println("Introduce tu contraseña: ");
            password = entrada.next();

            if (user.equals("admin") && password.equals("1234")) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }
        }

    }


    void ejercicio6() {

        int edad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");

        edad = entrada.nextInt();


        if (0<edad && edad< 18) {
            System.out.println("Con " + edad + " se te considera menor de edad");
        }

        if (17<edad && edad<31) {
            System.out.println("Con " + edad + " se te considera adulto joven");
        }

        if (30<edad && edad<65) {
            System.out.println("Con " + edad + " se te considera adulto");
        }

        if (100>edad && edad > 64) {
            System.out.println("Con " + edad + " se te considera adulto mayor");
        }
    }


    void ejercicio6V2() {

        int edad =10;
        Scanner entrada = new Scanner(System.in);
//
        while (edad < 0 || edad > 100) {
//        System.out.println("Introduce tu edad: ");
            edad = entrada.nextInt();
            if (edad < 0 || edad > 100)
                System.out.println("Edad fuera del rango de 0 a 100 años");
        }

       String salida = "Con " + edad + "años se te considera ";

        if (edad < 18) {
            salida  += "menor de edad.";
        } else if (edad < 31) {
            salida += "adulto joven. ";
        } else if (edad < 45) {
            salida  += "adulto. ";
        } else if (edad < 65) {
            salida += "adulto mayor. ";
        }

        System.out.println(salida);

    }


    void ejercicio7() {

    int num =0;
    Scanner entrada =new Scanner(System.in);
    String salida ="";

        while ( num < 1) {
        System.out.println("Introduce el numero hasta el que llega la serie: ");
        num = entrada.nextInt();

    }
        for (int i = 1; i< num; i++) {
            salida += i + ", ";
        }

        System.out.println(salida + num);
    }


    void ejercicio8() {

        int num = 0;
        Scanner entrada =new Scanner(System.in);
        int suma = 0;
        int positivos = 0;

        while (num >= 0) {
            suma += num;
            if (num >0) {
                positivos++;
            }
            System.out.println("Introduce el numero: ");
            num = entrada.nextInt();
            }

        System.out.println("La suma de los " + positivos + "numeros positivos es: " + suma);

    }


    void ejercicio9() {

    String unidad = "";
    Scanner entrada = new Scanner(System.in);
    float temperatura = 0;

        System.out.print("Introduce la unidad a la que quieras convertir (C/F): ");
        unidad = entrada.next();

    if (unidad.equalsIgnoreCase("c") || unidad.equalsIgnoreCase("f")) {
        System.out.println("Introduce la temperatura a convertir: ");
        temperatura = entrada.nextFloat();
    }

        switch (unidad.toUpperCase()) {
            case "C"  -> {
                float tempConversion = (temperatura -32) * 5/9;
                System.out.println(temperatura + "º Fahrenheit son " + tempConversion + "º Celsius");
            }
            case "F" -> {
                float tempConversion = (temperatura *9/5) + 32;
                System.out.println(temperatura + "º Celsius son " + tempConversion + "º Fahrenheit");
            }
            default -> {
                System.out.println("La unidad introducida no es valida");
            }
        }
    }


    void ejercicio10() {
        float precio, total =0, pago;
        Scanner entrada = new Scanner(System.in);
        char respuesta = 'S';
        String teclado = "";

        do {
            do {
                System.out.println("Introduce el precio del articulo: ");
                precio = entrada.nextFloat();
            } while (precio <= 0);
            total += precio;
            do {
                System.out.println("Hay mas articulos en la cesta?: ");
                teclado = entrada.next().toUpperCase();
                respuesta = teclado.charAt(0);

            } while ((respuesta !='S' && respuesta != 'N') || teclado.length() > 1);
        } while (respuesta == 'S');

        do {
            System.out.println("Introduce el pago: ");
            pago = entrada.nextFloat();

        } while (pago < total);

        System.out.println("El total a pagar son " + total + "$, el cliente entrega " + pago + "$ por lo que el cambio es de " + (pago - total) + "$");
        entrada.close();
    }

