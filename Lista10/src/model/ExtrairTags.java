package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtrairTags {
    public static void main(String[] args) {
        String input = "<h1>Aqui <!DOCTYPE> <> cabeçalho <h1 #seucu> <123> do < link> arquivo</h1>";
        String regex = "<[^>]+>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String[] vetorTags = new String[10];
        int contador = 0;

        while (matcher.find()) {
            vetorTags[contador] = matcher.group();
            contador++;
        }

        System.out.println("Tags encontradas:");
        for (int i = 0; i < vetorTags.length; i++) {
            if(vetorTags[i] == null){
                break;
            }
            
            System.out.println(vetorTags[i]);
            
        }
    }
}


