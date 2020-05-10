import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConvert {

  private final Map<Integer, String> decimalToRoman;

  public RomanConvert() {
    decimalToRoman = new LinkedHashMap<>() {{
      put(10, "X");
      put(5, "V");
      put(1, "I");
    }};
  }

  public String convert(int decimal) {
    StringBuilder romanNumeral = new StringBuilder();

    for (Integer decimalKey : decimalToRoman.keySet()) {
        while (decimal>=decimalKey){
          romanNumeral.append(decimalToRoman.get(decimalKey));
          decimal -= decimalKey;
        }
    }

    return romanNumeral.toString();
  }

}
