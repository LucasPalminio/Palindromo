public class Palindromo {
    public static void main(String[] args) {
        String test1 = "cbabc";
        System.out.println(esPalindromo(test1));
    }
    public static boolean esPalindromo(String cadena){
        StringBuilder resultado = new StringBuilder();
        resultado.append(cadena);
        resultado = resultado.reverse();
        return resultado.toString().equals(cadena);
    }
    //caso con tilde
    //caso con una mayuscula
    //caso con simbolos y guiones
    //caso con espacios
    //caso numero (entero)
}
