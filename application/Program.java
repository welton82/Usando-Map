package application;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Map é uma coleção de chave e valor
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("user name", "Maria");
        cookies.put("Email", "maria@gmail.com");
        cookies.put("Telephone", "98568-7451");
        System.out.println();
        System.out.println("Cookies: ");
        for(String x: cookies.keySet()){//keySet() retorna a chave do método
            System.out.println(x + ": " + cookies.get(x));
        }

        System.out.println("Tamanho do Map: " + cookies.size());
        cookies.remove("Email");
        cookies.put("Telephone", "99887-2254");//               containsKey retorna true ou false
        System.out.println("Verificando se contem 'Telephone': " + cookies.containsKey("Telephone"));
        boolean contem = (cookies.containsKey("Telephone"))?true:false;
        if(contem){
            System.out.println("Verdadeiro, contém");
        }else{
            System.out.println("Falso, Não Contém");
        }

        System.out.println();
        System.out.println("COokies");

        for(String x: cookies.keySet()){
            System.out.println(x + ": " + cookies.get(x));
        }

        System.out.println("Tamanho do Map: " + cookies.size());



    }
}
