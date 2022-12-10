package Principal;

import leer.Leer;

public class Test {

    public static void main(String[] args) {

        boolean continuar = true;
        int lecturaProducto, lecturaCantidad; // Variables para seleccionar producto y la cantidad que se quiere comprar

        // Se instancian y cargan los productos
        Producto vestido = new Mujer("Vestido", 1853.0, 6, true);
        Producto falda = new Mujer("Falda", 153.0, 6, true);
        Producto blazer = new Mujer("Blazer", 253.0, 6, true);
        Producto top = new Mujer("Top", 500.5, 6, true);
        Producto zapatoFem = new Mujer("Zapatos Fem", 900.0, 6, true);
        Producto cartera = new Mujer("Cartera", 600.0, 6, true);
        Producto ropaInteriorFem = new Mujer("Ropa Interior Femenina", 300.0, 6, true);

        Producto camisa = new Hombre("Camisa", 2150.2, 20, true);
        Producto jeans = new Hombre("Jeans", 3150.2, 20, true);
        Producto zapatos = new Hombre("Camisa", 2150.2, 20, true);
        Producto chalecoVestir = new Hombre("Chaleco Vestir", 1900.5, 20, true);
        Producto billetera = new Hombre("Billetera", 600.5, 20, true);
        Producto sueter = new Hombre("Sweater", 1700.5, 20, true);
        Producto ropaInteriorMas = new Hombre("Ropa Interior Masculina", 700.5, 20, true);

        Producto remera = new Nino("Remera", 380.2, 5, true);
        Producto pantalon = new Nino("Pantalon", 250.2, 5, true);
        Producto campera = new Nino("Campera", 3090.2, 5, true);
        Producto zapatillas = new Nino("zapatillas", 1100.5, 5, true);
        
        
        // Se crea el array "catálogo" para contener los productos. Su dimensión
        // viene del número de veces que se
        // instancia el contructor de Producto
        Producto catalogo[] = new Producto[Producto.dimesionArray];

        // Se crea el objeto gestion 2para trabajar (mostrar y vender productos,
        // y mostrar caja)
        Gestion gestion = new Gestion();

        // Se rellena el array catálogo
           catalogo[0] = vestido;
        catalogo[1] = falda;
        catalogo[2] = blazer;
        catalogo[3] = top;
        catalogo[4] = zapatoFem;
        catalogo[5] = cartera;
        catalogo[6] = ropaInteriorFem;

        catalogo[7] = camisa;
        catalogo[8] = jeans;
        catalogo[9] = zapatos;
        catalogo[10] = chalecoVestir;
        catalogo[11] = billetera;
        catalogo[12] = sueter;
        catalogo[13] = ropaInteriorMas;

        catalogo[14] = remera;
        catalogo[15] = pantalon;
        catalogo[16] = campera;
        catalogo[17] = zapatillas;

        do {
            System.out.println("\n\n..........Bienvenido a Tienda Java!!..........\n"
                    + "\n\nIntroduzca la opción que desea realizar:\n"
                    + "1. Ver  todos los productos\n" 
                    + "2. Compra prenda damas\n"
                    + "3. Compra prenda caballeros\n"
                    + "4. Compra prenda niños\n" 
                    + "5. Finalizar compra total"
                    + "\n");

            switch (Leer.datoInt()) {
                case 1:
                    gestion.mostrarProductos(catalogo);
                    break;
                case 2:
                    System.out.println("¿Que producto desea comprar?");
                    System.out.println(".......Prendas de Dama:.........."
                         + "\n1." + catalogo[0] + "\n"
                            + "\n2." + catalogo[1] + "\n"
                            + "\n3." + catalogo[2] + "\n"
                            + "\n4." + catalogo[3] + "\n"
                            + "\n5." + catalogo[4] + "\n"
                            + "\n6." + catalogo[5] + "\n"
                            + "\n7." + catalogo[6] + "\n");
                            

                    lecturaProducto = Leer.datoInt();
                    if (lecturaProducto == 1) {
                            System.out.println("¿Qué cantidad de vestidos desea comprar?");
                    } else if (lecturaProducto == 2) {
                        System.out.println("¿Qué cantidad de faldas desea comprar?");
                    } else if (lecturaProducto == 3){
                        System.out.println("¿Qué cantidad de blazer desea comprar?");
                    } else if (lecturaProducto == 4) {
                        System.out.println("¿Qué cantidad de tops desea comprar?");
                    } else if (lecturaProducto == 5) {
                        System.out.println("¿Qué cantidad de zapatos desea comprar?");
                    } else if (lecturaProducto == 6) {
                        System.out.println("¿Qué cantidad de cartera desea comprar?");
                    } else if (lecturaProducto == 7) {
                        System.out.println("¿Qué cantidad de ropa Interior desea comprar?");
                    }
                    lecturaCantidad = Leer.datoInt();
                    // Se carga el producto y la cantidad solicitada por el usuario
                    gestion.comprarProducto(catalogo, lecturaProducto,
                            lecturaCantidad);
                    break;
                case 3:
                   System.out.println("¿Que producto desea comprar?");
                    System.out.println(".......Prendas de Caballero:.........."
                            + "\n1." + catalogo[7] + "\n"
                            + "\n2." + catalogo[8] + "\n"
                            + "\n3." + catalogo[9] + "\n"
                            + "\n4." + catalogo[10] + "\n"
                            + "\n5." + catalogo[11] + "\n"
                            + "\n6." + catalogo[12] + "\n"
                            + "\n7." + catalogo[13] + "\n");

                    lecturaProducto = Leer.datoInt();
                    if (lecturaProducto == 1) {
                          System.out.println("¿Qué cantidad de camisas desea comprar?");
                    } else if (lecturaProducto == 2) {
                        System.out.println("¿Qué cantidad de jeans desea comprar?");
                    } else if (lecturaProducto == 3){
                        System.out.println("¿Qué cantidad de zapatos desea comprar?");
                   }  else if (lecturaProducto == 4){
                        System.out.println("¿Qué cantidad de chaleco de vestir desea comprar?");
                   }  else if (lecturaProducto == 5){
                        System.out.println("¿Qué cantidad de billetera desea comprar?");
                   }  else if (lecturaProducto == 6){
                        System.out.println("¿Qué cantidad de zapatos desea comprar?");
                   }  else if (lecturaProducto == 7){
                        System.out.println("¿Qué cantidad de ropa Interior Masc. desea comprar?");
                   }
                    lecturaCantidad = Leer.datoInt();
                    // Se carga el producto y la cantidad solicitada por el usuario
                    gestion.comprarProducto(catalogo, lecturaProducto,
                            lecturaCantidad);
                    break;

                case 4:
                   System.out.println("¿Que producto desea comprar?");
                    System.out.println(".......Prendas de Niños:.........."
                           + "\n1." + catalogo[14] + "\n"
                            + "\n2." + catalogo[15] + "\n"
                            + "\n3." + catalogo[16] + "\n"
                            + "\n4." + catalogo[17] + "\n");

                    lecturaProducto = Leer.datoInt();
                    if (lecturaProducto == 1) {
                            System.out.println("¿Qué cantidad de remeras desea comprar?");
                    } else if (lecturaProducto == 2) {
                        System.out.println("¿Qué cantidad de patalones desea comprar?");
                    } else if (lecturaProducto == 3) {
                        System.out.println("¿Qué cantidad de camperas desea comprar?");
                    } else if (lecturaProducto == 4) {
                        System.out.println("¿Qué cantidad de camperas desea comprar?");
                    }
                    lecturaCantidad = Leer.datoInt();
                    // Se carga el producto y la cantidad solicitada por el usuario
                    gestion.comprarProducto(catalogo, lecturaProducto,
                            lecturaCantidad);
                    break;

                case 5:
                    
                     System.out.println("\n\n.......... ¿Como desea abonar? ..........\n"
                    + "\n\nIntroduzca la opción que desea realizar:\n"
                    + "1. Efectivo\n" 
                    + "2. Debito\n"
                    + "3. Credito\n");
                    
                     
                     switch(Leer.datoInt()){
                         
                         case 1:
                             double totalEfectivo = gestion.totalCompra();                                              
                             int facturaEfectivo = (int) (Math.random()*1000+1);

                             System.out.println(
                                     "\n\n.......... Fin de operacion con efectivo ..........\n" 
                                     + " El monto total de la operacion es de: $" 
                                     + totalEfectivo
                                     +"\n\n"
                                     +"-------------------------------------------------------"
                                     +"TIENDA JAVA 						                      Cuit = 00-01234567-11\n"
                                     +" 				                  						                   FACTURA  A N°=" + facturaEfectivo+  "\n" 
                                     +"Detalles:\n" 
                                     +"Prendas varias.--\n"
                                    +"    -\n"
                                    +"     -\n"
                                    +"      -\n"
                                    +"       -\n"
                                    +"        -\n"
                                    +"         -                             TOTAL: $:"+totalEfectivo+"\n"
                                    +"-------------------------------------------------------");
                             
                             
                             
                         break;
                         case 2:
                             double totalDebito = gestion.totalCompra();
                             int facturaDebito = (int) (Math.random()*1000+1);
                             
                            System.out.println(
                                    "\n\n.......... Fin de operacion con efectivo ..........\n"
                                     + " El monto total de la operacion es de: $" 
                                     + totalDebito
                                     +"\n\n"
                                     +"-------------------------------------------------------\n"
                                     +"TIENDA JAVA 						                      Cuit = 00-01234567-11\n"
                                     +" 				                  						                   FACTURA  B N°=" + facturaDebito+  "\n" 
                                     +"Detalles:\n" 
                                     +"Prendas varias.--\n"
                                    +"    -\n"
                                    +"     -\n"
                                    +"      -\n"
                                    +"       -\n"
                                    +"        -\n"
                                    +"         -                             TOTAL: $:"+totalDebito+"\n"
                                    +"-------------------------------------------------------");
                             
                         break;
                         
                         case 3:
                             
                         double totalCredito = gestion.totalCompra();                                              
                         double totalIntereses = totalCredito+ (totalCredito/10);
                         int facturaCredito = (int) (Math.random()*1000+1);
                             
                            System.out.println(
                                    "\n\n.......... Fin de operacion con tarjeta de credito ..........\n" 
                                     + " El monto total de la operacion es de: $" 
                                     + totalCredito
                                     +"\n\n"
                                     +"Los intereses del 10% son de: $" + totalCredito/10 + "\n"
                                     +"El monto final con intereses es de: $"+ totalIntereses +"\n" 
                                     +"Su cliente debera abonar 3 cuotas de: $"+ totalIntereses/3 + "\n\n\n"
                                     +"-------------------------------------------------------\n"
                                     +"TIENDA JAVA 						                      Cuit = 00-01234567-11\n"                                 
                                     + " 	1			                  						                   FACTURA  C N°=" + facturaCredito+  "\n" 
                                     +"Detalles:\n" 
                                     +"Prendas varias.--\n"
                                    +"    -\n"
                                    +"     -\n"
                                    +"      -\n"
                                    +"       -\n"
                                    +"        -\n"
                                    +"         -                             TOTAL: $:"+totalIntereses+"\n"
                                    +"-------------------------------------------------------");
                            
                        break;
                     }
               
                    System.out.println("---- Gracias por usar la aplicación. ----");
                    System.exit(0);

                default:
                    // Se sale del programa
                    continuar = false;
            }

        } while (continuar);
        
    }

}
