package name.jchein.portfolio.common.uom.units;

import de.oehme.xtend.contrib.localization.Messages;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Message class for unit messages. These messages are used throughout the package.
 * @author <a href="mailto:jheinnic@hotmail.com">John Heinnickel</a>
 */
@Messages
@SuppressWarnings("all")
public class NamesAndSymbols {
  private final ResourceBundle bundle;
  
  public NamesAndSymbols(final Locale locale) {
    this.bundle = ResourceBundle.getBundle("name.jchein.portfolio.common.uom.units.NamesAndSymbols", locale);
  }
  
  /**
   * Returns the raw message String for further processing
   */
  public String getMessage(final String key) {
    return bundle.getString(key);
  }
  
  /**
   * °C
   */
  public final static String CELSIUS_SYMBOL = "celsius_symbol";
  
  /**
   * °C
   */
  public String celsiusSymbol() {
    String pattern = bundle.getString("celsius_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * h
   */
  public final static String HOUR_SYMBOL = "hour_symbol";
  
  /**
   * h
   */
  public String hourSymbol() {
    String pattern = bundle.getString("hour_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * K
   */
  public final static String KELVIN_SYMBOL = "kelvin_symbol";
  
  /**
   * K
   */
  public String kelvinSymbol() {
    String pattern = bundle.getString("kelvin_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * liter
   */
  public final static String LITER_NAME = "liter_name";
  
  /**
   * liter
   */
  public String literName() {
    String pattern = bundle.getString("liter_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * ton
   */
  public final static String TON_NAME = "ton_name";
  
  /**
   * ton
   */
  public String tonName() {
    String pattern = bundle.getString("ton_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * gram
   */
  public final static String GRAM_NAME = "gram_name";
  
  /**
   * gram
   */
  public String gramName() {
    String pattern = bundle.getString("gram_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * celsius
   */
  public final static String CELSIUS_NAME = "celsius_name";
  
  /**
   * celsius
   */
  public String celsiusName() {
    String pattern = bundle.getString("celsius_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * d
   */
  public final static String DAY_SYMBOL = "day_symbol";
  
  /**
   * d
   */
  public String daySymbol() {
    String pattern = bundle.getString("day_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * g
   */
  public final static String GRAM_SYMBOL = "gram_symbol";
  
  /**
   * g
   */
  public String gramSymbol() {
    String pattern = bundle.getString("gram_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * dB
   */
  public final static String DECIBEL_SYMBOL = "decibel_symbol";
  
  /**
   * dB
   */
  public String decibelSymbol() {
    String pattern = bundle.getString("decibel_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * %s
   */
  public final static String LOCALFORMAT_PATTERN = "LocalFormat_Pattern";
  
  /**
   * %s
   */
  public String localformatPattern() {
    String pattern = bundle.getString("LocalFormat_Pattern");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * meter
   */
  public final static String METER_NAME = "meter_name";
  
  /**
   * meter
   */
  public String meterName() {
    String pattern = bundle.getString("meter_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * hour
   */
  public final static String HOUR_NAME = "hour_name";
  
  /**
   * hour
   */
  public String hourName() {
    String pattern = bundle.getString("hour_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * degree
   */
  public final static String DEGREE_ANGLE_NAME = "degree_angle_name";
  
  /**
   * degree
   */
  public String degreeAngleName() {
    String pattern = bundle.getString("degree_angle_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * "
   */
  public final static String SECOND_ANGLE_SYMBOL = "second_angle_symbol";
  
  /**
   * "
   */
  public String secondAngleSymbol() {
    String pattern = bundle.getString("second_angle_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * rad
   */
  public final static String RADIAN_SYMBOL = "radian_symbol";
  
  /**
   * rad
   */
  public String radianSymbol() {
    String pattern = bundle.getString("radian_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * grain
   */
  public final static String GRAIN_NAME = "grain_name";
  
  /**
   * grain
   */
  public String grainName() {
    String pattern = bundle.getString("grain_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * hectare
   */
  public final static String HECTARE_NAME = "hectare_name";
  
  /**
   * hectare
   */
  public String hectareName() {
    String pattern = bundle.getString("hectare_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * b
   */
  public final static String BEL_SYMBOL = "bel_symbol";
  
  /**
   * b
   */
  public String belSymbol() {
    String pattern = bundle.getString("bel_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * ounce
   */
  public final static String OUNCE_NAME = "ounce_name";
  
  /**
   * ounce
   */
  public String ounceName() {
    String pattern = bundle.getString("ounce_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * are
   */
  public final static String ARE_NAME = "are_name";
  
  /**
   * are
   */
  public String areName() {
    String pattern = bundle.getString("are_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * second
   */
  public final static String SECOND_NAME = "second_name";
  
  /**
   * second
   */
  public String secondName() {
    String pattern = bundle.getString("second_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * '
   */
  public final static String MINUTE_ANGLE_SYMBOL = "minute_angle_symbol";
  
  /**
   * '
   */
  public String minuteAngleSymbol() {
    String pattern = bundle.getString("minute_angle_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * t
   */
  public final static String TON_SYMBOL = "ton_symbol";
  
  /**
   * t
   */
  public String tonSymbol() {
    String pattern = bundle.getString("ton_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * minute
   */
  public final static String MINUTE_NAME = "minute_name";
  
  /**
   * minute
   */
  public String minuteName() {
    String pattern = bundle.getString("minute_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * oz
   */
  public final static String OUNCE_SYMBOL = "ounce_symbol";
  
  /**
   * oz
   */
  public String ounceSymbol() {
    String pattern = bundle.getString("ounce_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * bel
   */
  public final static String BEL_NAME = "bel_name";
  
  /**
   * bel
   */
  public String belName() {
    String pattern = bundle.getString("bel_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * °F
   */
  public final static String FAHRENHEIT_SYMBOL = "fahrenheit_symbol";
  
  /**
   * °F
   */
  public String fahrenheitSymbol() {
    String pattern = bundle.getString("fahrenheit_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * radian
   */
  public final static String RADIAN_NAME = "radian_name";
  
  /**
   * radian
   */
  public String radianName() {
    String pattern = bundle.getString("radian_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * kelvin
   */
  public final static String KELVIN_NAME = "kelvin_name";
  
  /**
   * kelvin
   */
  public String kelvinName() {
    String pattern = bundle.getString("kelvin_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * a
   */
  public final static String ARE_SYMBOL = "are_symbol";
  
  /**
   * a
   */
  public String areSymbol() {
    String pattern = bundle.getString("are_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * fahrenheit
   */
  public final static String FAHRENHEIT_NAME = "fahrenheit_name";
  
  /**
   * fahrenheit
   */
  public String fahrenheitName() {
    String pattern = bundle.getString("fahrenheit_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * day
   */
  public final static String DAY_NAME = "day_name";
  
  /**
   * day
   */
  public String dayName() {
    String pattern = bundle.getString("day_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * dram
   */
  public final static String DRAM_NAME = "dram_name";
  
  /**
   * dram
   */
  public String dramName() {
    String pattern = bundle.getString("dram_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * dr
   */
  public final static String DRAM_SYMBOL = "dram_symbol";
  
  /**
   * dr
   */
  public String dramSymbol() {
    String pattern = bundle.getString("dram_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * gr
   */
  public final static String GRAIN_SYMBOL = "grain_symbol";
  
  /**
   * gr
   */
  public String grainSymbol() {
    String pattern = bundle.getString("grain_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * ha
   */
  public final static String HECTARE_SYMBOL = "hectare_symbol";
  
  /**
   * ha
   */
  public String hectareSymbol() {
    String pattern = bundle.getString("hectare_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * kilogram
   */
  public final static String KILOGRAM_NAME = "kilogram_name";
  
  /**
   * kilogram
   */
  public String kilogramName() {
    String pattern = bundle.getString("kilogram_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * s
   */
  public final static String SECOND_SYMBOL = "second_symbol";
  
  /**
   * s
   */
  public String secondSymbol() {
    String pattern = bundle.getString("second_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * L
   */
  public final static String LITER_SYMBOL = "liter_symbol";
  
  /**
   * L
   */
  public String literSymbol() {
    String pattern = bundle.getString("liter_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * pound
   */
  public final static String POUND_NAME = "pound_name";
  
  /**
   * pound
   */
  public String poundName() {
    String pattern = bundle.getString("pound_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * °
   */
  public final static String DEGREE_ANGLE_SYMBOL = "degree_angle_symbol";
  
  /**
   * °
   */
  public String degreeAngleSymbol() {
    String pattern = bundle.getString("degree_angle_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * Np
   */
  public final static String NEPER_SYMBOL = "neper_symbol";
  
  /**
   * Np
   */
  public String neperSymbol() {
    String pattern = bundle.getString("neper_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * decibel
   */
  public final static String DECIBEL_NAME = "decibel_name";
  
  /**
   * decibel
   */
  public String decibelName() {
    String pattern = bundle.getString("decibel_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * lb
   */
  public final static String POUND_SYMBOL = "pound_symbol";
  
  /**
   * lb
   */
  public String poundSymbol() {
    String pattern = bundle.getString("pound_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * kg
   */
  public final static String KILOGRAM_SYMBOL = "kilogram_symbol";
  
  /**
   * kg
   */
  public String kilogramSymbol() {
    String pattern = bundle.getString("kilogram_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * neper
   */
  public final static String NEPER_NAME = "neper_name";
  
  /**
   * neper
   */
  public String neperName() {
    String pattern = bundle.getString("neper_name");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * m
   */
  public final static String METER_SYMBOL = "meter_symbol";
  
  /**
   * m
   */
  public String meterSymbol() {
    String pattern = bundle.getString("meter_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
  
  /**
   * min
   */
  public final static String MINUTE_SYMBOL = "minute_symbol";
  
  /**
   * min
   */
  public String minuteSymbol() {
    String pattern = bundle.getString("minute_symbol");
    MessageFormat format = new MessageFormat(pattern);
    return format.format(new Object[]{});
  }
}
