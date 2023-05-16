package br.com.sistemaCompras;
import java.text.Normalizer;

public class RemoverAcentos {
  
  public static String removerAcentos(String texto) {
    String textoSemAcentos = Normalizer.normalize(texto, Normalizer.Form.NFD)
        .replaceAll("[^\\p{ASCII}]", "");
    return textoSemAcentos;
  }
}
