public class holaMundo {
    public static void main(String[] args){
        String saludo = holaMundo("caled");
        System.out.println(saludo);
    }
    private static String holaMundo( String name){
        String saludo = "hola yo soy " + name;
        return saludo;
    }

}