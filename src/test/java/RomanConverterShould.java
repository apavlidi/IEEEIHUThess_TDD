
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanConverterShould {

  private RomanConvert romanConvert;

  @BeforeEach
  void setUp() {
    romanConvert = new RomanConvert();
  }

  @Test
  public void convert_decimal_1_to_roman_I() {
    assertEquals("I", romanConvert.convert(1));
  }

  @Test
  public void convert_decimal_2_to_roman_II() {
    assertEquals("II", romanConvert.convert(2));
  }

  @Test
  public void convert_decimal_3_to_roman_III() {
    assertEquals("III", romanConvert.convert(3));
  }

  @Test
  public void convert_decimal_5_to_roman_V() {
    assertEquals("V", romanConvert.convert(5));
  }

  @Test
  public void convert_decimal_7_to_roman_VII() {
    assertEquals("VII", romanConvert.convert(7));
  }

  @Test
  public void convert_decimal_10_to_roman_X() {
    assertEquals("X", romanConvert.convert(10));
  }

  @Test
  public void convert_decimal_13_to_roman_XIII() {
    assertEquals("XIII", romanConvert.convert(13));
  }

  @Test
  public void convert_decimal_17_to_roman_XVII() {
    assertEquals("XVII", romanConvert.convert(17));
  }

  @Test
  public void convert_decimal_30_to_roman_XXX() {
    assertEquals("XXX", romanConvert.convert(30));
  }

}
