
package donacionesdana;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Usuario {
    // ATRIBUTOS
    private String email;
    private String contrasenia;
    
    
    // CONSTRUCTORES    
    public Usuario() {
        this.email = "";
        this.contrasenia = "";
    }
    
    public Usuario(String email, String contrasenia) {
        this.email = email;
        this.contrasenia = contrasenia;
    }
    
    // GETTER Y SETTER
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    // MÉTODOS
    // Se protegen los métodos con el modificador private para que no llamen desde fuera.
    // Sólo es necesario llamar a registrarUsuario().
    /**
     * Método que pide al usuario un email por teclado
     * @return el email dado por el usuario
     */
    private String pedirEmail() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("  -> Email: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que comprueba que el email es correcto:
     * contiene @ y termina con .com o .es
     * @param email
     * @return true si cumple los requisitos y false en caso contrario
     */
    private boolean comprobarEmail(String email) {
        return email.contains("@") && 
                (
                email.endsWith(".es") || 
                email.endsWith(".com")
                );
    }
    
    /**
     * Método que pide al usuario una contraseña por teclado
     * @return la contraseña
     */
    private String pedirContrasenia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("  -> Contraseña: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que comprueba que la contraseña contenga 8 o más caracteres
     * @param contrasenia
     * @return true si la contraseña contiene 8 o más caracteres y false en caso contrario
     */
    private boolean comprobarLongitudContrasenia(String contrasenia) {
        int longitud = contrasenia.length();
        
        if(longitud < 8) {
            System.out.println("\n[!] La contraseña tiene menos de 8 caracteres.\n");
        }
        return longitud >= 8;
    }
    
    /**
     * Método que comprueba si la contraseña contiene alguna mayúscula.
     * Mayúsculas: Entre 65 y 90
     * @param contrasenia
     * @return true si la contraseña contiene alguna mayúscula y false en caso contrario
     */
    private boolean contieneMayuscula(String contrasenia) {
        boolean encontrado = false;
        int i = 0;
        int charActual;
        
        while(!encontrado && i < contrasenia.length()) {
            charActual = (int)contrasenia.charAt(i);
            
            if(charActual >= 65 && charActual <= 90) {
                encontrado = true;
            } else {
                i++;
            }
        }
        
        if(!encontrado) {
            System.out.println("\n[!] La contraseña no contiene mayúsculas\n");
        }
        
        return encontrado;
    }
    
    /**
     * Método que comprueba si la contraseña contiene alguna minúscula
     * Minúsculas: Entre 97 y 122
     * @param contrasenia
     * @return true si la contraseña contiene alguna minúscula y false en caso contrario
     */
    private boolean contieneMinuscula(String contrasenia) {
        boolean encontrado = false;
        int i = 0;
        int charActual;
        
        while(!encontrado && i < contrasenia.length()) {
            charActual = (int)contrasenia.charAt(i);
            
            if(charActual >= 97 && charActual <= 122) {
                encontrado = true;
            } else {
                i++;
            }
            
        }
        
        if(!encontrado) {
            System.out.println("\n[!] La contraseña no contiene minúsculas\n");        
        }
        
        return encontrado;
    }
    
    /**
     * Método que comprueba si la contraseña contiene algún número
     * Números: Entre 48 y 57
     * @param contrasenia
     * @return true si la contraseña contiene algún número y false en caso contrario
     */
    private boolean contieneNumero(String contrasenia) {
        boolean encontrado = false;
        int i = 0;
        int charActual;
        
        while(!encontrado && i < contrasenia.length()) {
            charActual = (int)contrasenia.charAt(i);
            
            if(charActual >= 48 && charActual <= 57) {
                encontrado = true;
            } else {
                i++;
            }
            
        }
            
        if(!encontrado) {
            System.out.println("\n[!] La contraseña no contiene números\n");
        }
        
        return encontrado;
    }
    
    /**
     * Método que comprueba si la contraseña contiene algún caracter especial.
     * Caracteres especiales: 32 - 47; 58 - 64; 91 - 96; > 123
     * @param contrasenia
     * @return true si contiene un caracter espeical
     */
    private boolean contieneCaracterEspecial(String contrasenia) {
        boolean encontrado = false;
        int i = 0;
        int charActual;
        
        while(!encontrado && i < contrasenia.length()) {
            charActual = (int)contrasenia.charAt(i);
            
            if(
                    charActual >= 32 && charActual <= 47 ||
                    charActual >= 58 && charActual <= 64 ||
                    charActual >= 91 && charActual <= 96 ||
                    charActual >= 123
            ) {
                encontrado = true;
            } else {
                i++;
            }
            
        }
            
        if(!encontrado) {
            System.out.println("\n[!] La contraseña no contiene caracteres especiales\n");
        }
        
        return encontrado;
    }
    
    /**
     * Método que devuelve true si todos los requisitos se cumplen
     * @param contrasenia
     * @return true si la contraseña es correcta y false en caso contrario
     */
    private boolean comprobarContrasenia(String contrasenia) {
        return comprobarLongitudContrasenia(contrasenia) &&
                contieneMayuscula(contrasenia) &&
                contieneMinuscula(contrasenia) &&
                contieneNumero(contrasenia) &&
                contieneCaracterEspecial(contrasenia);
    }
    
    /**
     * Método que pide un email al usuario hasta que sea correcto,
     * en un máximo de 5 intentos.
     * @return el email correcto o un string vacío
     */
    private String registrarEmail() {
        String email = "";
        int intentos = 5;
        boolean emailCorrecto = false;
        
        do {
            email = pedirEmail();
            intentos--;      
            emailCorrecto = comprobarEmail(email);
            
            if(!emailCorrecto) {
                System.out.println("\n[x] Email incorrecto. Por favor, vuelva a intentarlo.");
                System.out.println(intentos + " intentos\n");
            } else {
                System.out.println("\n[√] Email correcto\n");
            }
            
        } while(!emailCorrecto && intentos > 0);
        
        return email;
    }
    
    /**
     * Método que pide una contraseña al usuario hasta que sea correcta,
     * en un máximo de 5 intentos.
     * @return la contraseña correcta o un string vacío
     */
    private String registrarContrasenia() {
        String contrasenia = "";
        int intentos = 5;
        boolean contraseniaCorrecta = false;
        
            do {
                contrasenia = pedirContrasenia();
                intentos--;
                contraseniaCorrecta = comprobarContrasenia(contrasenia);

                if(!contraseniaCorrecta) {
                    System.out.println("\nContraseña incorrecta. Por favor, vuelva a intentarlo.");
                    System.out.println("Restan " + intentos + " intentos\n");
                    System.out.println("\n[!] La contraseña debe contener, al menos, 8 caracteres,"
                            + "un número, una mayúscula, una minúscula y un caracter especial (*,.&, etc.)\n");
                } else {
                    System.out.println("\n[√] Contraseña correcta");
                }

            } while(!contraseniaCorrecta && intentos > 0);
            
            return contrasenia;
    }
    
    /**
     * Método que crea un objeto usuario con el email 
     * y la contraseña dada por el usuario.
     * 
     * Tiene 5 intentos para escribir bien el email
     * y otros 5 para escribir una contraseña correcta.
     * El programa pedirá el email y la contraseña hasta que sean
     * correctos o se agoten los intentos.
     * Si el usuario supera esos 5 intentos, el programa se cierra.
     * 
     * El método pide el email al usuario y comprueba que sea correcto.
     * Si es correcto, pide la contraseña al usuario.
     * El programa comprueba que la contraseña sea válida.
     * Si lo es, crea el objeto usuario con el email y la contraseña dadas.     
     */
    public void registrarUsuario() {    
        
        System.out.println("- BIENVENIDO/A A LA PLATAFORMA DE DONACIONES -");
        System.out.println("\nCompleta el registro para comenzar:");
        
        email = registrarEmail();  
        
        if(!email.equals("")) {
            contrasenia = registrarContrasenia(); 
        }
        
        if(!contrasenia.equals("")) {
            System.out.println("\n[√] Cuenta creada correctamente con el usuario " + email);                
        }
                
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Usuario:\n  · email:" + email + "\n  · contraseña: " + contrasenia;
    }
    
}
