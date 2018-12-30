// ORM class for table 'GENDER_STATS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Dec 30 11:39:32 PST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GENDER_STATS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("COUNTRY_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COUNTRY_NAME = (String)value;
      }
    });
    setters.put("COUNTRY_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COUNTRY_CODE = (String)value;
      }
    });
    setters.put("INDICATOR_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INDICATOR_NAME = (String)value;
      }
    });
    setters.put("INDICATOR_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INDICATOR_CODE = (String)value;
      }
    });
    setters.put("Y1960", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1960 = (Double)value;
      }
    });
    setters.put("Y1961", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1961 = (Double)value;
      }
    });
    setters.put("Y1962", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1962 = (Double)value;
      }
    });
    setters.put("Y1963", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1963 = (Double)value;
      }
    });
    setters.put("Y1964", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1964 = (Double)value;
      }
    });
    setters.put("Y1965", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1965 = (Double)value;
      }
    });
    setters.put("Y1966", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1966 = (Double)value;
      }
    });
    setters.put("Y1967", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1967 = (Double)value;
      }
    });
    setters.put("Y1968", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1968 = (Double)value;
      }
    });
    setters.put("Y1969", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1969 = (Double)value;
      }
    });
    setters.put("Y1970", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1970 = (Double)value;
      }
    });
    setters.put("Y1971", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1971 = (Double)value;
      }
    });
    setters.put("Y1972", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1972 = (Double)value;
      }
    });
    setters.put("Y1973", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1973 = (Double)value;
      }
    });
    setters.put("Y1974", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1974 = (Double)value;
      }
    });
    setters.put("Y1975", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1975 = (Double)value;
      }
    });
    setters.put("Y1976", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1976 = (Double)value;
      }
    });
    setters.put("Y1977", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1977 = (Double)value;
      }
    });
    setters.put("Y1978", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1978 = (Double)value;
      }
    });
    setters.put("Y1979", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1979 = (Double)value;
      }
    });
    setters.put("Y1980", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1980 = (Double)value;
      }
    });
    setters.put("Y1981", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1981 = (Double)value;
      }
    });
    setters.put("Y1982", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1982 = (Double)value;
      }
    });
    setters.put("Y1983", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1983 = (Double)value;
      }
    });
    setters.put("Y1984", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1984 = (Double)value;
      }
    });
    setters.put("Y1985", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1985 = (Double)value;
      }
    });
    setters.put("Y1986", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1986 = (Double)value;
      }
    });
    setters.put("Y1987", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1987 = (Double)value;
      }
    });
    setters.put("Y1988", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1988 = (Double)value;
      }
    });
    setters.put("Y1989", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1989 = (Double)value;
      }
    });
    setters.put("Y1990", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1990 = (Double)value;
      }
    });
    setters.put("Y1991", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1991 = (Double)value;
      }
    });
    setters.put("Y1992", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1992 = (Double)value;
      }
    });
    setters.put("Y1993", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1993 = (Double)value;
      }
    });
    setters.put("Y1994", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1994 = (Double)value;
      }
    });
    setters.put("Y1995", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1995 = (Double)value;
      }
    });
    setters.put("Y1996", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1996 = (Double)value;
      }
    });
    setters.put("Y1997", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1997 = (Double)value;
      }
    });
    setters.put("Y1998", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1998 = (Double)value;
      }
    });
    setters.put("Y1999", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y1999 = (Double)value;
      }
    });
    setters.put("Y2000", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2000 = (Double)value;
      }
    });
    setters.put("Y2001", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2001 = (Double)value;
      }
    });
    setters.put("Y2002", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2002 = (Double)value;
      }
    });
    setters.put("Y2003", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2003 = (Double)value;
      }
    });
    setters.put("Y2004", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2004 = (Double)value;
      }
    });
    setters.put("Y2005", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2005 = (Double)value;
      }
    });
    setters.put("Y2006", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2006 = (Double)value;
      }
    });
    setters.put("Y2007", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2007 = (Double)value;
      }
    });
    setters.put("Y2008", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2008 = (Double)value;
      }
    });
    setters.put("Y2009", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2009 = (Double)value;
      }
    });
    setters.put("Y2010", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2010 = (Double)value;
      }
    });
    setters.put("Y2011", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2011 = (Double)value;
      }
    });
    setters.put("Y2012", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2012 = (Double)value;
      }
    });
    setters.put("Y2013", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2013 = (Double)value;
      }
    });
    setters.put("Y2014", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2014 = (Double)value;
      }
    });
    setters.put("Y2015", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2015 = (Double)value;
      }
    });
    setters.put("Y2016", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Y2016 = (Double)value;
      }
    });
  }
  public GENDER_STATS() {
    init0();
  }
  private String COUNTRY_NAME;
  public String get_COUNTRY_NAME() {
    return COUNTRY_NAME;
  }
  public void set_COUNTRY_NAME(String COUNTRY_NAME) {
    this.COUNTRY_NAME = COUNTRY_NAME;
  }
  public GENDER_STATS with_COUNTRY_NAME(String COUNTRY_NAME) {
    this.COUNTRY_NAME = COUNTRY_NAME;
    return this;
  }
  private String COUNTRY_CODE;
  public String get_COUNTRY_CODE() {
    return COUNTRY_CODE;
  }
  public void set_COUNTRY_CODE(String COUNTRY_CODE) {
    this.COUNTRY_CODE = COUNTRY_CODE;
  }
  public GENDER_STATS with_COUNTRY_CODE(String COUNTRY_CODE) {
    this.COUNTRY_CODE = COUNTRY_CODE;
    return this;
  }
  private String INDICATOR_NAME;
  public String get_INDICATOR_NAME() {
    return INDICATOR_NAME;
  }
  public void set_INDICATOR_NAME(String INDICATOR_NAME) {
    this.INDICATOR_NAME = INDICATOR_NAME;
  }
  public GENDER_STATS with_INDICATOR_NAME(String INDICATOR_NAME) {
    this.INDICATOR_NAME = INDICATOR_NAME;
    return this;
  }
  private String INDICATOR_CODE;
  public String get_INDICATOR_CODE() {
    return INDICATOR_CODE;
  }
  public void set_INDICATOR_CODE(String INDICATOR_CODE) {
    this.INDICATOR_CODE = INDICATOR_CODE;
  }
  public GENDER_STATS with_INDICATOR_CODE(String INDICATOR_CODE) {
    this.INDICATOR_CODE = INDICATOR_CODE;
    return this;
  }
  private Double Y1960;
  public Double get_Y1960() {
    return Y1960;
  }
  public void set_Y1960(Double Y1960) {
    this.Y1960 = Y1960;
  }
  public GENDER_STATS with_Y1960(Double Y1960) {
    this.Y1960 = Y1960;
    return this;
  }
  private Double Y1961;
  public Double get_Y1961() {
    return Y1961;
  }
  public void set_Y1961(Double Y1961) {
    this.Y1961 = Y1961;
  }
  public GENDER_STATS with_Y1961(Double Y1961) {
    this.Y1961 = Y1961;
    return this;
  }
  private Double Y1962;
  public Double get_Y1962() {
    return Y1962;
  }
  public void set_Y1962(Double Y1962) {
    this.Y1962 = Y1962;
  }
  public GENDER_STATS with_Y1962(Double Y1962) {
    this.Y1962 = Y1962;
    return this;
  }
  private Double Y1963;
  public Double get_Y1963() {
    return Y1963;
  }
  public void set_Y1963(Double Y1963) {
    this.Y1963 = Y1963;
  }
  public GENDER_STATS with_Y1963(Double Y1963) {
    this.Y1963 = Y1963;
    return this;
  }
  private Double Y1964;
  public Double get_Y1964() {
    return Y1964;
  }
  public void set_Y1964(Double Y1964) {
    this.Y1964 = Y1964;
  }
  public GENDER_STATS with_Y1964(Double Y1964) {
    this.Y1964 = Y1964;
    return this;
  }
  private Double Y1965;
  public Double get_Y1965() {
    return Y1965;
  }
  public void set_Y1965(Double Y1965) {
    this.Y1965 = Y1965;
  }
  public GENDER_STATS with_Y1965(Double Y1965) {
    this.Y1965 = Y1965;
    return this;
  }
  private Double Y1966;
  public Double get_Y1966() {
    return Y1966;
  }
  public void set_Y1966(Double Y1966) {
    this.Y1966 = Y1966;
  }
  public GENDER_STATS with_Y1966(Double Y1966) {
    this.Y1966 = Y1966;
    return this;
  }
  private Double Y1967;
  public Double get_Y1967() {
    return Y1967;
  }
  public void set_Y1967(Double Y1967) {
    this.Y1967 = Y1967;
  }
  public GENDER_STATS with_Y1967(Double Y1967) {
    this.Y1967 = Y1967;
    return this;
  }
  private Double Y1968;
  public Double get_Y1968() {
    return Y1968;
  }
  public void set_Y1968(Double Y1968) {
    this.Y1968 = Y1968;
  }
  public GENDER_STATS with_Y1968(Double Y1968) {
    this.Y1968 = Y1968;
    return this;
  }
  private Double Y1969;
  public Double get_Y1969() {
    return Y1969;
  }
  public void set_Y1969(Double Y1969) {
    this.Y1969 = Y1969;
  }
  public GENDER_STATS with_Y1969(Double Y1969) {
    this.Y1969 = Y1969;
    return this;
  }
  private Double Y1970;
  public Double get_Y1970() {
    return Y1970;
  }
  public void set_Y1970(Double Y1970) {
    this.Y1970 = Y1970;
  }
  public GENDER_STATS with_Y1970(Double Y1970) {
    this.Y1970 = Y1970;
    return this;
  }
  private Double Y1971;
  public Double get_Y1971() {
    return Y1971;
  }
  public void set_Y1971(Double Y1971) {
    this.Y1971 = Y1971;
  }
  public GENDER_STATS with_Y1971(Double Y1971) {
    this.Y1971 = Y1971;
    return this;
  }
  private Double Y1972;
  public Double get_Y1972() {
    return Y1972;
  }
  public void set_Y1972(Double Y1972) {
    this.Y1972 = Y1972;
  }
  public GENDER_STATS with_Y1972(Double Y1972) {
    this.Y1972 = Y1972;
    return this;
  }
  private Double Y1973;
  public Double get_Y1973() {
    return Y1973;
  }
  public void set_Y1973(Double Y1973) {
    this.Y1973 = Y1973;
  }
  public GENDER_STATS with_Y1973(Double Y1973) {
    this.Y1973 = Y1973;
    return this;
  }
  private Double Y1974;
  public Double get_Y1974() {
    return Y1974;
  }
  public void set_Y1974(Double Y1974) {
    this.Y1974 = Y1974;
  }
  public GENDER_STATS with_Y1974(Double Y1974) {
    this.Y1974 = Y1974;
    return this;
  }
  private Double Y1975;
  public Double get_Y1975() {
    return Y1975;
  }
  public void set_Y1975(Double Y1975) {
    this.Y1975 = Y1975;
  }
  public GENDER_STATS with_Y1975(Double Y1975) {
    this.Y1975 = Y1975;
    return this;
  }
  private Double Y1976;
  public Double get_Y1976() {
    return Y1976;
  }
  public void set_Y1976(Double Y1976) {
    this.Y1976 = Y1976;
  }
  public GENDER_STATS with_Y1976(Double Y1976) {
    this.Y1976 = Y1976;
    return this;
  }
  private Double Y1977;
  public Double get_Y1977() {
    return Y1977;
  }
  public void set_Y1977(Double Y1977) {
    this.Y1977 = Y1977;
  }
  public GENDER_STATS with_Y1977(Double Y1977) {
    this.Y1977 = Y1977;
    return this;
  }
  private Double Y1978;
  public Double get_Y1978() {
    return Y1978;
  }
  public void set_Y1978(Double Y1978) {
    this.Y1978 = Y1978;
  }
  public GENDER_STATS with_Y1978(Double Y1978) {
    this.Y1978 = Y1978;
    return this;
  }
  private Double Y1979;
  public Double get_Y1979() {
    return Y1979;
  }
  public void set_Y1979(Double Y1979) {
    this.Y1979 = Y1979;
  }
  public GENDER_STATS with_Y1979(Double Y1979) {
    this.Y1979 = Y1979;
    return this;
  }
  private Double Y1980;
  public Double get_Y1980() {
    return Y1980;
  }
  public void set_Y1980(Double Y1980) {
    this.Y1980 = Y1980;
  }
  public GENDER_STATS with_Y1980(Double Y1980) {
    this.Y1980 = Y1980;
    return this;
  }
  private Double Y1981;
  public Double get_Y1981() {
    return Y1981;
  }
  public void set_Y1981(Double Y1981) {
    this.Y1981 = Y1981;
  }
  public GENDER_STATS with_Y1981(Double Y1981) {
    this.Y1981 = Y1981;
    return this;
  }
  private Double Y1982;
  public Double get_Y1982() {
    return Y1982;
  }
  public void set_Y1982(Double Y1982) {
    this.Y1982 = Y1982;
  }
  public GENDER_STATS with_Y1982(Double Y1982) {
    this.Y1982 = Y1982;
    return this;
  }
  private Double Y1983;
  public Double get_Y1983() {
    return Y1983;
  }
  public void set_Y1983(Double Y1983) {
    this.Y1983 = Y1983;
  }
  public GENDER_STATS with_Y1983(Double Y1983) {
    this.Y1983 = Y1983;
    return this;
  }
  private Double Y1984;
  public Double get_Y1984() {
    return Y1984;
  }
  public void set_Y1984(Double Y1984) {
    this.Y1984 = Y1984;
  }
  public GENDER_STATS with_Y1984(Double Y1984) {
    this.Y1984 = Y1984;
    return this;
  }
  private Double Y1985;
  public Double get_Y1985() {
    return Y1985;
  }
  public void set_Y1985(Double Y1985) {
    this.Y1985 = Y1985;
  }
  public GENDER_STATS with_Y1985(Double Y1985) {
    this.Y1985 = Y1985;
    return this;
  }
  private Double Y1986;
  public Double get_Y1986() {
    return Y1986;
  }
  public void set_Y1986(Double Y1986) {
    this.Y1986 = Y1986;
  }
  public GENDER_STATS with_Y1986(Double Y1986) {
    this.Y1986 = Y1986;
    return this;
  }
  private Double Y1987;
  public Double get_Y1987() {
    return Y1987;
  }
  public void set_Y1987(Double Y1987) {
    this.Y1987 = Y1987;
  }
  public GENDER_STATS with_Y1987(Double Y1987) {
    this.Y1987 = Y1987;
    return this;
  }
  private Double Y1988;
  public Double get_Y1988() {
    return Y1988;
  }
  public void set_Y1988(Double Y1988) {
    this.Y1988 = Y1988;
  }
  public GENDER_STATS with_Y1988(Double Y1988) {
    this.Y1988 = Y1988;
    return this;
  }
  private Double Y1989;
  public Double get_Y1989() {
    return Y1989;
  }
  public void set_Y1989(Double Y1989) {
    this.Y1989 = Y1989;
  }
  public GENDER_STATS with_Y1989(Double Y1989) {
    this.Y1989 = Y1989;
    return this;
  }
  private Double Y1990;
  public Double get_Y1990() {
    return Y1990;
  }
  public void set_Y1990(Double Y1990) {
    this.Y1990 = Y1990;
  }
  public GENDER_STATS with_Y1990(Double Y1990) {
    this.Y1990 = Y1990;
    return this;
  }
  private Double Y1991;
  public Double get_Y1991() {
    return Y1991;
  }
  public void set_Y1991(Double Y1991) {
    this.Y1991 = Y1991;
  }
  public GENDER_STATS with_Y1991(Double Y1991) {
    this.Y1991 = Y1991;
    return this;
  }
  private Double Y1992;
  public Double get_Y1992() {
    return Y1992;
  }
  public void set_Y1992(Double Y1992) {
    this.Y1992 = Y1992;
  }
  public GENDER_STATS with_Y1992(Double Y1992) {
    this.Y1992 = Y1992;
    return this;
  }
  private Double Y1993;
  public Double get_Y1993() {
    return Y1993;
  }
  public void set_Y1993(Double Y1993) {
    this.Y1993 = Y1993;
  }
  public GENDER_STATS with_Y1993(Double Y1993) {
    this.Y1993 = Y1993;
    return this;
  }
  private Double Y1994;
  public Double get_Y1994() {
    return Y1994;
  }
  public void set_Y1994(Double Y1994) {
    this.Y1994 = Y1994;
  }
  public GENDER_STATS with_Y1994(Double Y1994) {
    this.Y1994 = Y1994;
    return this;
  }
  private Double Y1995;
  public Double get_Y1995() {
    return Y1995;
  }
  public void set_Y1995(Double Y1995) {
    this.Y1995 = Y1995;
  }
  public GENDER_STATS with_Y1995(Double Y1995) {
    this.Y1995 = Y1995;
    return this;
  }
  private Double Y1996;
  public Double get_Y1996() {
    return Y1996;
  }
  public void set_Y1996(Double Y1996) {
    this.Y1996 = Y1996;
  }
  public GENDER_STATS with_Y1996(Double Y1996) {
    this.Y1996 = Y1996;
    return this;
  }
  private Double Y1997;
  public Double get_Y1997() {
    return Y1997;
  }
  public void set_Y1997(Double Y1997) {
    this.Y1997 = Y1997;
  }
  public GENDER_STATS with_Y1997(Double Y1997) {
    this.Y1997 = Y1997;
    return this;
  }
  private Double Y1998;
  public Double get_Y1998() {
    return Y1998;
  }
  public void set_Y1998(Double Y1998) {
    this.Y1998 = Y1998;
  }
  public GENDER_STATS with_Y1998(Double Y1998) {
    this.Y1998 = Y1998;
    return this;
  }
  private Double Y1999;
  public Double get_Y1999() {
    return Y1999;
  }
  public void set_Y1999(Double Y1999) {
    this.Y1999 = Y1999;
  }
  public GENDER_STATS with_Y1999(Double Y1999) {
    this.Y1999 = Y1999;
    return this;
  }
  private Double Y2000;
  public Double get_Y2000() {
    return Y2000;
  }
  public void set_Y2000(Double Y2000) {
    this.Y2000 = Y2000;
  }
  public GENDER_STATS with_Y2000(Double Y2000) {
    this.Y2000 = Y2000;
    return this;
  }
  private Double Y2001;
  public Double get_Y2001() {
    return Y2001;
  }
  public void set_Y2001(Double Y2001) {
    this.Y2001 = Y2001;
  }
  public GENDER_STATS with_Y2001(Double Y2001) {
    this.Y2001 = Y2001;
    return this;
  }
  private Double Y2002;
  public Double get_Y2002() {
    return Y2002;
  }
  public void set_Y2002(Double Y2002) {
    this.Y2002 = Y2002;
  }
  public GENDER_STATS with_Y2002(Double Y2002) {
    this.Y2002 = Y2002;
    return this;
  }
  private Double Y2003;
  public Double get_Y2003() {
    return Y2003;
  }
  public void set_Y2003(Double Y2003) {
    this.Y2003 = Y2003;
  }
  public GENDER_STATS with_Y2003(Double Y2003) {
    this.Y2003 = Y2003;
    return this;
  }
  private Double Y2004;
  public Double get_Y2004() {
    return Y2004;
  }
  public void set_Y2004(Double Y2004) {
    this.Y2004 = Y2004;
  }
  public GENDER_STATS with_Y2004(Double Y2004) {
    this.Y2004 = Y2004;
    return this;
  }
  private Double Y2005;
  public Double get_Y2005() {
    return Y2005;
  }
  public void set_Y2005(Double Y2005) {
    this.Y2005 = Y2005;
  }
  public GENDER_STATS with_Y2005(Double Y2005) {
    this.Y2005 = Y2005;
    return this;
  }
  private Double Y2006;
  public Double get_Y2006() {
    return Y2006;
  }
  public void set_Y2006(Double Y2006) {
    this.Y2006 = Y2006;
  }
  public GENDER_STATS with_Y2006(Double Y2006) {
    this.Y2006 = Y2006;
    return this;
  }
  private Double Y2007;
  public Double get_Y2007() {
    return Y2007;
  }
  public void set_Y2007(Double Y2007) {
    this.Y2007 = Y2007;
  }
  public GENDER_STATS with_Y2007(Double Y2007) {
    this.Y2007 = Y2007;
    return this;
  }
  private Double Y2008;
  public Double get_Y2008() {
    return Y2008;
  }
  public void set_Y2008(Double Y2008) {
    this.Y2008 = Y2008;
  }
  public GENDER_STATS with_Y2008(Double Y2008) {
    this.Y2008 = Y2008;
    return this;
  }
  private Double Y2009;
  public Double get_Y2009() {
    return Y2009;
  }
  public void set_Y2009(Double Y2009) {
    this.Y2009 = Y2009;
  }
  public GENDER_STATS with_Y2009(Double Y2009) {
    this.Y2009 = Y2009;
    return this;
  }
  private Double Y2010;
  public Double get_Y2010() {
    return Y2010;
  }
  public void set_Y2010(Double Y2010) {
    this.Y2010 = Y2010;
  }
  public GENDER_STATS with_Y2010(Double Y2010) {
    this.Y2010 = Y2010;
    return this;
  }
  private Double Y2011;
  public Double get_Y2011() {
    return Y2011;
  }
  public void set_Y2011(Double Y2011) {
    this.Y2011 = Y2011;
  }
  public GENDER_STATS with_Y2011(Double Y2011) {
    this.Y2011 = Y2011;
    return this;
  }
  private Double Y2012;
  public Double get_Y2012() {
    return Y2012;
  }
  public void set_Y2012(Double Y2012) {
    this.Y2012 = Y2012;
  }
  public GENDER_STATS with_Y2012(Double Y2012) {
    this.Y2012 = Y2012;
    return this;
  }
  private Double Y2013;
  public Double get_Y2013() {
    return Y2013;
  }
  public void set_Y2013(Double Y2013) {
    this.Y2013 = Y2013;
  }
  public GENDER_STATS with_Y2013(Double Y2013) {
    this.Y2013 = Y2013;
    return this;
  }
  private Double Y2014;
  public Double get_Y2014() {
    return Y2014;
  }
  public void set_Y2014(Double Y2014) {
    this.Y2014 = Y2014;
  }
  public GENDER_STATS with_Y2014(Double Y2014) {
    this.Y2014 = Y2014;
    return this;
  }
  private Double Y2015;
  public Double get_Y2015() {
    return Y2015;
  }
  public void set_Y2015(Double Y2015) {
    this.Y2015 = Y2015;
  }
  public GENDER_STATS with_Y2015(Double Y2015) {
    this.Y2015 = Y2015;
    return this;
  }
  private Double Y2016;
  public Double get_Y2016() {
    return Y2016;
  }
  public void set_Y2016(Double Y2016) {
    this.Y2016 = Y2016;
  }
  public GENDER_STATS with_Y2016(Double Y2016) {
    this.Y2016 = Y2016;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof GENDER_STATS)) {
      return false;
    }
    GENDER_STATS that = (GENDER_STATS) o;
    boolean equal = true;
    equal = equal && (this.COUNTRY_NAME == null ? that.COUNTRY_NAME == null : this.COUNTRY_NAME.equals(that.COUNTRY_NAME));
    equal = equal && (this.COUNTRY_CODE == null ? that.COUNTRY_CODE == null : this.COUNTRY_CODE.equals(that.COUNTRY_CODE));
    equal = equal && (this.INDICATOR_NAME == null ? that.INDICATOR_NAME == null : this.INDICATOR_NAME.equals(that.INDICATOR_NAME));
    equal = equal && (this.INDICATOR_CODE == null ? that.INDICATOR_CODE == null : this.INDICATOR_CODE.equals(that.INDICATOR_CODE));
    equal = equal && (this.Y1960 == null ? that.Y1960 == null : this.Y1960.equals(that.Y1960));
    equal = equal && (this.Y1961 == null ? that.Y1961 == null : this.Y1961.equals(that.Y1961));
    equal = equal && (this.Y1962 == null ? that.Y1962 == null : this.Y1962.equals(that.Y1962));
    equal = equal && (this.Y1963 == null ? that.Y1963 == null : this.Y1963.equals(that.Y1963));
    equal = equal && (this.Y1964 == null ? that.Y1964 == null : this.Y1964.equals(that.Y1964));
    equal = equal && (this.Y1965 == null ? that.Y1965 == null : this.Y1965.equals(that.Y1965));
    equal = equal && (this.Y1966 == null ? that.Y1966 == null : this.Y1966.equals(that.Y1966));
    equal = equal && (this.Y1967 == null ? that.Y1967 == null : this.Y1967.equals(that.Y1967));
    equal = equal && (this.Y1968 == null ? that.Y1968 == null : this.Y1968.equals(that.Y1968));
    equal = equal && (this.Y1969 == null ? that.Y1969 == null : this.Y1969.equals(that.Y1969));
    equal = equal && (this.Y1970 == null ? that.Y1970 == null : this.Y1970.equals(that.Y1970));
    equal = equal && (this.Y1971 == null ? that.Y1971 == null : this.Y1971.equals(that.Y1971));
    equal = equal && (this.Y1972 == null ? that.Y1972 == null : this.Y1972.equals(that.Y1972));
    equal = equal && (this.Y1973 == null ? that.Y1973 == null : this.Y1973.equals(that.Y1973));
    equal = equal && (this.Y1974 == null ? that.Y1974 == null : this.Y1974.equals(that.Y1974));
    equal = equal && (this.Y1975 == null ? that.Y1975 == null : this.Y1975.equals(that.Y1975));
    equal = equal && (this.Y1976 == null ? that.Y1976 == null : this.Y1976.equals(that.Y1976));
    equal = equal && (this.Y1977 == null ? that.Y1977 == null : this.Y1977.equals(that.Y1977));
    equal = equal && (this.Y1978 == null ? that.Y1978 == null : this.Y1978.equals(that.Y1978));
    equal = equal && (this.Y1979 == null ? that.Y1979 == null : this.Y1979.equals(that.Y1979));
    equal = equal && (this.Y1980 == null ? that.Y1980 == null : this.Y1980.equals(that.Y1980));
    equal = equal && (this.Y1981 == null ? that.Y1981 == null : this.Y1981.equals(that.Y1981));
    equal = equal && (this.Y1982 == null ? that.Y1982 == null : this.Y1982.equals(that.Y1982));
    equal = equal && (this.Y1983 == null ? that.Y1983 == null : this.Y1983.equals(that.Y1983));
    equal = equal && (this.Y1984 == null ? that.Y1984 == null : this.Y1984.equals(that.Y1984));
    equal = equal && (this.Y1985 == null ? that.Y1985 == null : this.Y1985.equals(that.Y1985));
    equal = equal && (this.Y1986 == null ? that.Y1986 == null : this.Y1986.equals(that.Y1986));
    equal = equal && (this.Y1987 == null ? that.Y1987 == null : this.Y1987.equals(that.Y1987));
    equal = equal && (this.Y1988 == null ? that.Y1988 == null : this.Y1988.equals(that.Y1988));
    equal = equal && (this.Y1989 == null ? that.Y1989 == null : this.Y1989.equals(that.Y1989));
    equal = equal && (this.Y1990 == null ? that.Y1990 == null : this.Y1990.equals(that.Y1990));
    equal = equal && (this.Y1991 == null ? that.Y1991 == null : this.Y1991.equals(that.Y1991));
    equal = equal && (this.Y1992 == null ? that.Y1992 == null : this.Y1992.equals(that.Y1992));
    equal = equal && (this.Y1993 == null ? that.Y1993 == null : this.Y1993.equals(that.Y1993));
    equal = equal && (this.Y1994 == null ? that.Y1994 == null : this.Y1994.equals(that.Y1994));
    equal = equal && (this.Y1995 == null ? that.Y1995 == null : this.Y1995.equals(that.Y1995));
    equal = equal && (this.Y1996 == null ? that.Y1996 == null : this.Y1996.equals(that.Y1996));
    equal = equal && (this.Y1997 == null ? that.Y1997 == null : this.Y1997.equals(that.Y1997));
    equal = equal && (this.Y1998 == null ? that.Y1998 == null : this.Y1998.equals(that.Y1998));
    equal = equal && (this.Y1999 == null ? that.Y1999 == null : this.Y1999.equals(that.Y1999));
    equal = equal && (this.Y2000 == null ? that.Y2000 == null : this.Y2000.equals(that.Y2000));
    equal = equal && (this.Y2001 == null ? that.Y2001 == null : this.Y2001.equals(that.Y2001));
    equal = equal && (this.Y2002 == null ? that.Y2002 == null : this.Y2002.equals(that.Y2002));
    equal = equal && (this.Y2003 == null ? that.Y2003 == null : this.Y2003.equals(that.Y2003));
    equal = equal && (this.Y2004 == null ? that.Y2004 == null : this.Y2004.equals(that.Y2004));
    equal = equal && (this.Y2005 == null ? that.Y2005 == null : this.Y2005.equals(that.Y2005));
    equal = equal && (this.Y2006 == null ? that.Y2006 == null : this.Y2006.equals(that.Y2006));
    equal = equal && (this.Y2007 == null ? that.Y2007 == null : this.Y2007.equals(that.Y2007));
    equal = equal && (this.Y2008 == null ? that.Y2008 == null : this.Y2008.equals(that.Y2008));
    equal = equal && (this.Y2009 == null ? that.Y2009 == null : this.Y2009.equals(that.Y2009));
    equal = equal && (this.Y2010 == null ? that.Y2010 == null : this.Y2010.equals(that.Y2010));
    equal = equal && (this.Y2011 == null ? that.Y2011 == null : this.Y2011.equals(that.Y2011));
    equal = equal && (this.Y2012 == null ? that.Y2012 == null : this.Y2012.equals(that.Y2012));
    equal = equal && (this.Y2013 == null ? that.Y2013 == null : this.Y2013.equals(that.Y2013));
    equal = equal && (this.Y2014 == null ? that.Y2014 == null : this.Y2014.equals(that.Y2014));
    equal = equal && (this.Y2015 == null ? that.Y2015 == null : this.Y2015.equals(that.Y2015));
    equal = equal && (this.Y2016 == null ? that.Y2016 == null : this.Y2016.equals(that.Y2016));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof GENDER_STATS)) {
      return false;
    }
    GENDER_STATS that = (GENDER_STATS) o;
    boolean equal = true;
    equal = equal && (this.COUNTRY_NAME == null ? that.COUNTRY_NAME == null : this.COUNTRY_NAME.equals(that.COUNTRY_NAME));
    equal = equal && (this.COUNTRY_CODE == null ? that.COUNTRY_CODE == null : this.COUNTRY_CODE.equals(that.COUNTRY_CODE));
    equal = equal && (this.INDICATOR_NAME == null ? that.INDICATOR_NAME == null : this.INDICATOR_NAME.equals(that.INDICATOR_NAME));
    equal = equal && (this.INDICATOR_CODE == null ? that.INDICATOR_CODE == null : this.INDICATOR_CODE.equals(that.INDICATOR_CODE));
    equal = equal && (this.Y1960 == null ? that.Y1960 == null : this.Y1960.equals(that.Y1960));
    equal = equal && (this.Y1961 == null ? that.Y1961 == null : this.Y1961.equals(that.Y1961));
    equal = equal && (this.Y1962 == null ? that.Y1962 == null : this.Y1962.equals(that.Y1962));
    equal = equal && (this.Y1963 == null ? that.Y1963 == null : this.Y1963.equals(that.Y1963));
    equal = equal && (this.Y1964 == null ? that.Y1964 == null : this.Y1964.equals(that.Y1964));
    equal = equal && (this.Y1965 == null ? that.Y1965 == null : this.Y1965.equals(that.Y1965));
    equal = equal && (this.Y1966 == null ? that.Y1966 == null : this.Y1966.equals(that.Y1966));
    equal = equal && (this.Y1967 == null ? that.Y1967 == null : this.Y1967.equals(that.Y1967));
    equal = equal && (this.Y1968 == null ? that.Y1968 == null : this.Y1968.equals(that.Y1968));
    equal = equal && (this.Y1969 == null ? that.Y1969 == null : this.Y1969.equals(that.Y1969));
    equal = equal && (this.Y1970 == null ? that.Y1970 == null : this.Y1970.equals(that.Y1970));
    equal = equal && (this.Y1971 == null ? that.Y1971 == null : this.Y1971.equals(that.Y1971));
    equal = equal && (this.Y1972 == null ? that.Y1972 == null : this.Y1972.equals(that.Y1972));
    equal = equal && (this.Y1973 == null ? that.Y1973 == null : this.Y1973.equals(that.Y1973));
    equal = equal && (this.Y1974 == null ? that.Y1974 == null : this.Y1974.equals(that.Y1974));
    equal = equal && (this.Y1975 == null ? that.Y1975 == null : this.Y1975.equals(that.Y1975));
    equal = equal && (this.Y1976 == null ? that.Y1976 == null : this.Y1976.equals(that.Y1976));
    equal = equal && (this.Y1977 == null ? that.Y1977 == null : this.Y1977.equals(that.Y1977));
    equal = equal && (this.Y1978 == null ? that.Y1978 == null : this.Y1978.equals(that.Y1978));
    equal = equal && (this.Y1979 == null ? that.Y1979 == null : this.Y1979.equals(that.Y1979));
    equal = equal && (this.Y1980 == null ? that.Y1980 == null : this.Y1980.equals(that.Y1980));
    equal = equal && (this.Y1981 == null ? that.Y1981 == null : this.Y1981.equals(that.Y1981));
    equal = equal && (this.Y1982 == null ? that.Y1982 == null : this.Y1982.equals(that.Y1982));
    equal = equal && (this.Y1983 == null ? that.Y1983 == null : this.Y1983.equals(that.Y1983));
    equal = equal && (this.Y1984 == null ? that.Y1984 == null : this.Y1984.equals(that.Y1984));
    equal = equal && (this.Y1985 == null ? that.Y1985 == null : this.Y1985.equals(that.Y1985));
    equal = equal && (this.Y1986 == null ? that.Y1986 == null : this.Y1986.equals(that.Y1986));
    equal = equal && (this.Y1987 == null ? that.Y1987 == null : this.Y1987.equals(that.Y1987));
    equal = equal && (this.Y1988 == null ? that.Y1988 == null : this.Y1988.equals(that.Y1988));
    equal = equal && (this.Y1989 == null ? that.Y1989 == null : this.Y1989.equals(that.Y1989));
    equal = equal && (this.Y1990 == null ? that.Y1990 == null : this.Y1990.equals(that.Y1990));
    equal = equal && (this.Y1991 == null ? that.Y1991 == null : this.Y1991.equals(that.Y1991));
    equal = equal && (this.Y1992 == null ? that.Y1992 == null : this.Y1992.equals(that.Y1992));
    equal = equal && (this.Y1993 == null ? that.Y1993 == null : this.Y1993.equals(that.Y1993));
    equal = equal && (this.Y1994 == null ? that.Y1994 == null : this.Y1994.equals(that.Y1994));
    equal = equal && (this.Y1995 == null ? that.Y1995 == null : this.Y1995.equals(that.Y1995));
    equal = equal && (this.Y1996 == null ? that.Y1996 == null : this.Y1996.equals(that.Y1996));
    equal = equal && (this.Y1997 == null ? that.Y1997 == null : this.Y1997.equals(that.Y1997));
    equal = equal && (this.Y1998 == null ? that.Y1998 == null : this.Y1998.equals(that.Y1998));
    equal = equal && (this.Y1999 == null ? that.Y1999 == null : this.Y1999.equals(that.Y1999));
    equal = equal && (this.Y2000 == null ? that.Y2000 == null : this.Y2000.equals(that.Y2000));
    equal = equal && (this.Y2001 == null ? that.Y2001 == null : this.Y2001.equals(that.Y2001));
    equal = equal && (this.Y2002 == null ? that.Y2002 == null : this.Y2002.equals(that.Y2002));
    equal = equal && (this.Y2003 == null ? that.Y2003 == null : this.Y2003.equals(that.Y2003));
    equal = equal && (this.Y2004 == null ? that.Y2004 == null : this.Y2004.equals(that.Y2004));
    equal = equal && (this.Y2005 == null ? that.Y2005 == null : this.Y2005.equals(that.Y2005));
    equal = equal && (this.Y2006 == null ? that.Y2006 == null : this.Y2006.equals(that.Y2006));
    equal = equal && (this.Y2007 == null ? that.Y2007 == null : this.Y2007.equals(that.Y2007));
    equal = equal && (this.Y2008 == null ? that.Y2008 == null : this.Y2008.equals(that.Y2008));
    equal = equal && (this.Y2009 == null ? that.Y2009 == null : this.Y2009.equals(that.Y2009));
    equal = equal && (this.Y2010 == null ? that.Y2010 == null : this.Y2010.equals(that.Y2010));
    equal = equal && (this.Y2011 == null ? that.Y2011 == null : this.Y2011.equals(that.Y2011));
    equal = equal && (this.Y2012 == null ? that.Y2012 == null : this.Y2012.equals(that.Y2012));
    equal = equal && (this.Y2013 == null ? that.Y2013 == null : this.Y2013.equals(that.Y2013));
    equal = equal && (this.Y2014 == null ? that.Y2014 == null : this.Y2014.equals(that.Y2014));
    equal = equal && (this.Y2015 == null ? that.Y2015 == null : this.Y2015.equals(that.Y2015));
    equal = equal && (this.Y2016 == null ? that.Y2016 == null : this.Y2016.equals(that.Y2016));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.COUNTRY_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.COUNTRY_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.INDICATOR_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.INDICATOR_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.Y1960 = JdbcWritableBridge.readDouble(5, __dbResults);
    this.Y1961 = JdbcWritableBridge.readDouble(6, __dbResults);
    this.Y1962 = JdbcWritableBridge.readDouble(7, __dbResults);
    this.Y1963 = JdbcWritableBridge.readDouble(8, __dbResults);
    this.Y1964 = JdbcWritableBridge.readDouble(9, __dbResults);
    this.Y1965 = JdbcWritableBridge.readDouble(10, __dbResults);
    this.Y1966 = JdbcWritableBridge.readDouble(11, __dbResults);
    this.Y1967 = JdbcWritableBridge.readDouble(12, __dbResults);
    this.Y1968 = JdbcWritableBridge.readDouble(13, __dbResults);
    this.Y1969 = JdbcWritableBridge.readDouble(14, __dbResults);
    this.Y1970 = JdbcWritableBridge.readDouble(15, __dbResults);
    this.Y1971 = JdbcWritableBridge.readDouble(16, __dbResults);
    this.Y1972 = JdbcWritableBridge.readDouble(17, __dbResults);
    this.Y1973 = JdbcWritableBridge.readDouble(18, __dbResults);
    this.Y1974 = JdbcWritableBridge.readDouble(19, __dbResults);
    this.Y1975 = JdbcWritableBridge.readDouble(20, __dbResults);
    this.Y1976 = JdbcWritableBridge.readDouble(21, __dbResults);
    this.Y1977 = JdbcWritableBridge.readDouble(22, __dbResults);
    this.Y1978 = JdbcWritableBridge.readDouble(23, __dbResults);
    this.Y1979 = JdbcWritableBridge.readDouble(24, __dbResults);
    this.Y1980 = JdbcWritableBridge.readDouble(25, __dbResults);
    this.Y1981 = JdbcWritableBridge.readDouble(26, __dbResults);
    this.Y1982 = JdbcWritableBridge.readDouble(27, __dbResults);
    this.Y1983 = JdbcWritableBridge.readDouble(28, __dbResults);
    this.Y1984 = JdbcWritableBridge.readDouble(29, __dbResults);
    this.Y1985 = JdbcWritableBridge.readDouble(30, __dbResults);
    this.Y1986 = JdbcWritableBridge.readDouble(31, __dbResults);
    this.Y1987 = JdbcWritableBridge.readDouble(32, __dbResults);
    this.Y1988 = JdbcWritableBridge.readDouble(33, __dbResults);
    this.Y1989 = JdbcWritableBridge.readDouble(34, __dbResults);
    this.Y1990 = JdbcWritableBridge.readDouble(35, __dbResults);
    this.Y1991 = JdbcWritableBridge.readDouble(36, __dbResults);
    this.Y1992 = JdbcWritableBridge.readDouble(37, __dbResults);
    this.Y1993 = JdbcWritableBridge.readDouble(38, __dbResults);
    this.Y1994 = JdbcWritableBridge.readDouble(39, __dbResults);
    this.Y1995 = JdbcWritableBridge.readDouble(40, __dbResults);
    this.Y1996 = JdbcWritableBridge.readDouble(41, __dbResults);
    this.Y1997 = JdbcWritableBridge.readDouble(42, __dbResults);
    this.Y1998 = JdbcWritableBridge.readDouble(43, __dbResults);
    this.Y1999 = JdbcWritableBridge.readDouble(44, __dbResults);
    this.Y2000 = JdbcWritableBridge.readDouble(45, __dbResults);
    this.Y2001 = JdbcWritableBridge.readDouble(46, __dbResults);
    this.Y2002 = JdbcWritableBridge.readDouble(47, __dbResults);
    this.Y2003 = JdbcWritableBridge.readDouble(48, __dbResults);
    this.Y2004 = JdbcWritableBridge.readDouble(49, __dbResults);
    this.Y2005 = JdbcWritableBridge.readDouble(50, __dbResults);
    this.Y2006 = JdbcWritableBridge.readDouble(51, __dbResults);
    this.Y2007 = JdbcWritableBridge.readDouble(52, __dbResults);
    this.Y2008 = JdbcWritableBridge.readDouble(53, __dbResults);
    this.Y2009 = JdbcWritableBridge.readDouble(54, __dbResults);
    this.Y2010 = JdbcWritableBridge.readDouble(55, __dbResults);
    this.Y2011 = JdbcWritableBridge.readDouble(56, __dbResults);
    this.Y2012 = JdbcWritableBridge.readDouble(57, __dbResults);
    this.Y2013 = JdbcWritableBridge.readDouble(58, __dbResults);
    this.Y2014 = JdbcWritableBridge.readDouble(59, __dbResults);
    this.Y2015 = JdbcWritableBridge.readDouble(60, __dbResults);
    this.Y2016 = JdbcWritableBridge.readDouble(61, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.COUNTRY_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.COUNTRY_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.INDICATOR_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.INDICATOR_CODE = JdbcWritableBridge.readString(4, __dbResults);
    this.Y1960 = JdbcWritableBridge.readDouble(5, __dbResults);
    this.Y1961 = JdbcWritableBridge.readDouble(6, __dbResults);
    this.Y1962 = JdbcWritableBridge.readDouble(7, __dbResults);
    this.Y1963 = JdbcWritableBridge.readDouble(8, __dbResults);
    this.Y1964 = JdbcWritableBridge.readDouble(9, __dbResults);
    this.Y1965 = JdbcWritableBridge.readDouble(10, __dbResults);
    this.Y1966 = JdbcWritableBridge.readDouble(11, __dbResults);
    this.Y1967 = JdbcWritableBridge.readDouble(12, __dbResults);
    this.Y1968 = JdbcWritableBridge.readDouble(13, __dbResults);
    this.Y1969 = JdbcWritableBridge.readDouble(14, __dbResults);
    this.Y1970 = JdbcWritableBridge.readDouble(15, __dbResults);
    this.Y1971 = JdbcWritableBridge.readDouble(16, __dbResults);
    this.Y1972 = JdbcWritableBridge.readDouble(17, __dbResults);
    this.Y1973 = JdbcWritableBridge.readDouble(18, __dbResults);
    this.Y1974 = JdbcWritableBridge.readDouble(19, __dbResults);
    this.Y1975 = JdbcWritableBridge.readDouble(20, __dbResults);
    this.Y1976 = JdbcWritableBridge.readDouble(21, __dbResults);
    this.Y1977 = JdbcWritableBridge.readDouble(22, __dbResults);
    this.Y1978 = JdbcWritableBridge.readDouble(23, __dbResults);
    this.Y1979 = JdbcWritableBridge.readDouble(24, __dbResults);
    this.Y1980 = JdbcWritableBridge.readDouble(25, __dbResults);
    this.Y1981 = JdbcWritableBridge.readDouble(26, __dbResults);
    this.Y1982 = JdbcWritableBridge.readDouble(27, __dbResults);
    this.Y1983 = JdbcWritableBridge.readDouble(28, __dbResults);
    this.Y1984 = JdbcWritableBridge.readDouble(29, __dbResults);
    this.Y1985 = JdbcWritableBridge.readDouble(30, __dbResults);
    this.Y1986 = JdbcWritableBridge.readDouble(31, __dbResults);
    this.Y1987 = JdbcWritableBridge.readDouble(32, __dbResults);
    this.Y1988 = JdbcWritableBridge.readDouble(33, __dbResults);
    this.Y1989 = JdbcWritableBridge.readDouble(34, __dbResults);
    this.Y1990 = JdbcWritableBridge.readDouble(35, __dbResults);
    this.Y1991 = JdbcWritableBridge.readDouble(36, __dbResults);
    this.Y1992 = JdbcWritableBridge.readDouble(37, __dbResults);
    this.Y1993 = JdbcWritableBridge.readDouble(38, __dbResults);
    this.Y1994 = JdbcWritableBridge.readDouble(39, __dbResults);
    this.Y1995 = JdbcWritableBridge.readDouble(40, __dbResults);
    this.Y1996 = JdbcWritableBridge.readDouble(41, __dbResults);
    this.Y1997 = JdbcWritableBridge.readDouble(42, __dbResults);
    this.Y1998 = JdbcWritableBridge.readDouble(43, __dbResults);
    this.Y1999 = JdbcWritableBridge.readDouble(44, __dbResults);
    this.Y2000 = JdbcWritableBridge.readDouble(45, __dbResults);
    this.Y2001 = JdbcWritableBridge.readDouble(46, __dbResults);
    this.Y2002 = JdbcWritableBridge.readDouble(47, __dbResults);
    this.Y2003 = JdbcWritableBridge.readDouble(48, __dbResults);
    this.Y2004 = JdbcWritableBridge.readDouble(49, __dbResults);
    this.Y2005 = JdbcWritableBridge.readDouble(50, __dbResults);
    this.Y2006 = JdbcWritableBridge.readDouble(51, __dbResults);
    this.Y2007 = JdbcWritableBridge.readDouble(52, __dbResults);
    this.Y2008 = JdbcWritableBridge.readDouble(53, __dbResults);
    this.Y2009 = JdbcWritableBridge.readDouble(54, __dbResults);
    this.Y2010 = JdbcWritableBridge.readDouble(55, __dbResults);
    this.Y2011 = JdbcWritableBridge.readDouble(56, __dbResults);
    this.Y2012 = JdbcWritableBridge.readDouble(57, __dbResults);
    this.Y2013 = JdbcWritableBridge.readDouble(58, __dbResults);
    this.Y2014 = JdbcWritableBridge.readDouble(59, __dbResults);
    this.Y2015 = JdbcWritableBridge.readDouble(60, __dbResults);
    this.Y2016 = JdbcWritableBridge.readDouble(61, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(COUNTRY_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COUNTRY_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INDICATOR_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INDICATOR_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1960, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1961, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1962, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1963, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1964, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1965, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1966, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1967, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1968, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1969, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1970, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1971, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1972, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1973, 18 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1974, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1975, 20 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1976, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1977, 22 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1978, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1979, 24 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1980, 25 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1981, 26 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1982, 27 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1983, 28 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1984, 29 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1985, 30 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1986, 31 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1987, 32 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1988, 33 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1989, 34 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1990, 35 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1991, 36 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1992, 37 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1993, 38 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1994, 39 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1995, 40 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1996, 41 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1997, 42 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1998, 43 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1999, 44 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2000, 45 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2001, 46 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2002, 47 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2003, 48 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2004, 49 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2005, 50 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2006, 51 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2007, 52 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2008, 53 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2009, 54 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2010, 55 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2011, 56 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2012, 57 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2013, 58 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2014, 59 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2015, 60 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2016, 61 + __off, 8, __dbStmt);
    return 61;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(COUNTRY_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COUNTRY_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INDICATOR_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INDICATOR_CODE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1960, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1961, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1962, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1963, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1964, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1965, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1966, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1967, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1968, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1969, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1970, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1971, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1972, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1973, 18 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1974, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1975, 20 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1976, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1977, 22 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1978, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1979, 24 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1980, 25 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1981, 26 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1982, 27 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1983, 28 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1984, 29 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1985, 30 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1986, 31 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1987, 32 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1988, 33 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1989, 34 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1990, 35 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1991, 36 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1992, 37 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1993, 38 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1994, 39 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1995, 40 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1996, 41 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1997, 42 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1998, 43 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y1999, 44 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2000, 45 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2001, 46 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2002, 47 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2003, 48 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2004, 49 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2005, 50 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2006, 51 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2007, 52 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2008, 53 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2009, 54 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2010, 55 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2011, 56 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2012, 57 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2013, 58 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2014, 59 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2015, 60 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Y2016, 61 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.COUNTRY_NAME = null;
    } else {
    this.COUNTRY_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COUNTRY_CODE = null;
    } else {
    this.COUNTRY_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INDICATOR_NAME = null;
    } else {
    this.INDICATOR_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INDICATOR_CODE = null;
    } else {
    this.INDICATOR_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y1960 = null;
    } else {
    this.Y1960 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1961 = null;
    } else {
    this.Y1961 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1962 = null;
    } else {
    this.Y1962 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1963 = null;
    } else {
    this.Y1963 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1964 = null;
    } else {
    this.Y1964 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1965 = null;
    } else {
    this.Y1965 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1966 = null;
    } else {
    this.Y1966 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1967 = null;
    } else {
    this.Y1967 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1968 = null;
    } else {
    this.Y1968 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1969 = null;
    } else {
    this.Y1969 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1970 = null;
    } else {
    this.Y1970 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1971 = null;
    } else {
    this.Y1971 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1972 = null;
    } else {
    this.Y1972 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1973 = null;
    } else {
    this.Y1973 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1974 = null;
    } else {
    this.Y1974 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1975 = null;
    } else {
    this.Y1975 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1976 = null;
    } else {
    this.Y1976 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1977 = null;
    } else {
    this.Y1977 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1978 = null;
    } else {
    this.Y1978 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1979 = null;
    } else {
    this.Y1979 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1980 = null;
    } else {
    this.Y1980 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1981 = null;
    } else {
    this.Y1981 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1982 = null;
    } else {
    this.Y1982 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1983 = null;
    } else {
    this.Y1983 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1984 = null;
    } else {
    this.Y1984 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1985 = null;
    } else {
    this.Y1985 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1986 = null;
    } else {
    this.Y1986 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1987 = null;
    } else {
    this.Y1987 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1988 = null;
    } else {
    this.Y1988 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1989 = null;
    } else {
    this.Y1989 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1990 = null;
    } else {
    this.Y1990 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1991 = null;
    } else {
    this.Y1991 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1992 = null;
    } else {
    this.Y1992 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1993 = null;
    } else {
    this.Y1993 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1994 = null;
    } else {
    this.Y1994 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1995 = null;
    } else {
    this.Y1995 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1996 = null;
    } else {
    this.Y1996 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1997 = null;
    } else {
    this.Y1997 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1998 = null;
    } else {
    this.Y1998 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y1999 = null;
    } else {
    this.Y1999 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2000 = null;
    } else {
    this.Y2000 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2001 = null;
    } else {
    this.Y2001 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2002 = null;
    } else {
    this.Y2002 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2003 = null;
    } else {
    this.Y2003 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2004 = null;
    } else {
    this.Y2004 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2005 = null;
    } else {
    this.Y2005 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2006 = null;
    } else {
    this.Y2006 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2007 = null;
    } else {
    this.Y2007 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2008 = null;
    } else {
    this.Y2008 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2009 = null;
    } else {
    this.Y2009 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2010 = null;
    } else {
    this.Y2010 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2011 = null;
    } else {
    this.Y2011 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2012 = null;
    } else {
    this.Y2012 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2013 = null;
    } else {
    this.Y2013 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2014 = null;
    } else {
    this.Y2014 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2015 = null;
    } else {
    this.Y2015 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Y2016 = null;
    } else {
    this.Y2016 = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.COUNTRY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY_NAME);
    }
    if (null == this.COUNTRY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY_CODE);
    }
    if (null == this.INDICATOR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INDICATOR_NAME);
    }
    if (null == this.INDICATOR_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INDICATOR_CODE);
    }
    if (null == this.Y1960) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1960);
    }
    if (null == this.Y1961) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1961);
    }
    if (null == this.Y1962) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1962);
    }
    if (null == this.Y1963) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1963);
    }
    if (null == this.Y1964) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1964);
    }
    if (null == this.Y1965) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1965);
    }
    if (null == this.Y1966) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1966);
    }
    if (null == this.Y1967) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1967);
    }
    if (null == this.Y1968) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1968);
    }
    if (null == this.Y1969) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1969);
    }
    if (null == this.Y1970) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1970);
    }
    if (null == this.Y1971) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1971);
    }
    if (null == this.Y1972) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1972);
    }
    if (null == this.Y1973) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1973);
    }
    if (null == this.Y1974) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1974);
    }
    if (null == this.Y1975) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1975);
    }
    if (null == this.Y1976) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1976);
    }
    if (null == this.Y1977) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1977);
    }
    if (null == this.Y1978) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1978);
    }
    if (null == this.Y1979) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1979);
    }
    if (null == this.Y1980) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1980);
    }
    if (null == this.Y1981) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1981);
    }
    if (null == this.Y1982) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1982);
    }
    if (null == this.Y1983) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1983);
    }
    if (null == this.Y1984) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1984);
    }
    if (null == this.Y1985) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1985);
    }
    if (null == this.Y1986) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1986);
    }
    if (null == this.Y1987) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1987);
    }
    if (null == this.Y1988) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1988);
    }
    if (null == this.Y1989) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1989);
    }
    if (null == this.Y1990) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1990);
    }
    if (null == this.Y1991) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1991);
    }
    if (null == this.Y1992) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1992);
    }
    if (null == this.Y1993) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1993);
    }
    if (null == this.Y1994) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1994);
    }
    if (null == this.Y1995) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1995);
    }
    if (null == this.Y1996) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1996);
    }
    if (null == this.Y1997) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1997);
    }
    if (null == this.Y1998) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1998);
    }
    if (null == this.Y1999) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1999);
    }
    if (null == this.Y2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2000);
    }
    if (null == this.Y2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2001);
    }
    if (null == this.Y2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2002);
    }
    if (null == this.Y2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2003);
    }
    if (null == this.Y2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2004);
    }
    if (null == this.Y2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2005);
    }
    if (null == this.Y2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2006);
    }
    if (null == this.Y2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2007);
    }
    if (null == this.Y2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2008);
    }
    if (null == this.Y2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2009);
    }
    if (null == this.Y2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2010);
    }
    if (null == this.Y2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2011);
    }
    if (null == this.Y2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2012);
    }
    if (null == this.Y2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2013);
    }
    if (null == this.Y2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2014);
    }
    if (null == this.Y2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2015);
    }
    if (null == this.Y2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2016);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.COUNTRY_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY_NAME);
    }
    if (null == this.COUNTRY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY_CODE);
    }
    if (null == this.INDICATOR_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INDICATOR_NAME);
    }
    if (null == this.INDICATOR_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INDICATOR_CODE);
    }
    if (null == this.Y1960) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1960);
    }
    if (null == this.Y1961) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1961);
    }
    if (null == this.Y1962) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1962);
    }
    if (null == this.Y1963) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1963);
    }
    if (null == this.Y1964) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1964);
    }
    if (null == this.Y1965) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1965);
    }
    if (null == this.Y1966) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1966);
    }
    if (null == this.Y1967) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1967);
    }
    if (null == this.Y1968) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1968);
    }
    if (null == this.Y1969) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1969);
    }
    if (null == this.Y1970) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1970);
    }
    if (null == this.Y1971) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1971);
    }
    if (null == this.Y1972) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1972);
    }
    if (null == this.Y1973) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1973);
    }
    if (null == this.Y1974) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1974);
    }
    if (null == this.Y1975) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1975);
    }
    if (null == this.Y1976) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1976);
    }
    if (null == this.Y1977) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1977);
    }
    if (null == this.Y1978) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1978);
    }
    if (null == this.Y1979) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1979);
    }
    if (null == this.Y1980) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1980);
    }
    if (null == this.Y1981) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1981);
    }
    if (null == this.Y1982) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1982);
    }
    if (null == this.Y1983) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1983);
    }
    if (null == this.Y1984) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1984);
    }
    if (null == this.Y1985) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1985);
    }
    if (null == this.Y1986) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1986);
    }
    if (null == this.Y1987) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1987);
    }
    if (null == this.Y1988) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1988);
    }
    if (null == this.Y1989) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1989);
    }
    if (null == this.Y1990) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1990);
    }
    if (null == this.Y1991) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1991);
    }
    if (null == this.Y1992) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1992);
    }
    if (null == this.Y1993) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1993);
    }
    if (null == this.Y1994) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1994);
    }
    if (null == this.Y1995) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1995);
    }
    if (null == this.Y1996) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1996);
    }
    if (null == this.Y1997) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1997);
    }
    if (null == this.Y1998) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1998);
    }
    if (null == this.Y1999) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y1999);
    }
    if (null == this.Y2000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2000);
    }
    if (null == this.Y2001) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2001);
    }
    if (null == this.Y2002) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2002);
    }
    if (null == this.Y2003) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2003);
    }
    if (null == this.Y2004) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2004);
    }
    if (null == this.Y2005) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2005);
    }
    if (null == this.Y2006) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2006);
    }
    if (null == this.Y2007) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2007);
    }
    if (null == this.Y2008) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2008);
    }
    if (null == this.Y2009) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2009);
    }
    if (null == this.Y2010) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2010);
    }
    if (null == this.Y2011) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2011);
    }
    if (null == this.Y2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2012);
    }
    if (null == this.Y2013) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2013);
    }
    if (null == this.Y2014) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2014);
    }
    if (null == this.Y2015) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2015);
    }
    if (null == this.Y2016) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Y2016);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_NAME==null?"null":COUNTRY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_CODE==null?"null":COUNTRY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDICATOR_NAME==null?"null":INDICATOR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDICATOR_CODE==null?"null":INDICATOR_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1960==null?"null":"" + Y1960, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1961==null?"null":"" + Y1961, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1962==null?"null":"" + Y1962, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1963==null?"null":"" + Y1963, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1964==null?"null":"" + Y1964, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1965==null?"null":"" + Y1965, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1966==null?"null":"" + Y1966, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1967==null?"null":"" + Y1967, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1968==null?"null":"" + Y1968, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1969==null?"null":"" + Y1969, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1970==null?"null":"" + Y1970, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1971==null?"null":"" + Y1971, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1972==null?"null":"" + Y1972, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1973==null?"null":"" + Y1973, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1974==null?"null":"" + Y1974, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1975==null?"null":"" + Y1975, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1976==null?"null":"" + Y1976, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1977==null?"null":"" + Y1977, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1978==null?"null":"" + Y1978, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1979==null?"null":"" + Y1979, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1980==null?"null":"" + Y1980, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1981==null?"null":"" + Y1981, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1982==null?"null":"" + Y1982, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1983==null?"null":"" + Y1983, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1984==null?"null":"" + Y1984, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1985==null?"null":"" + Y1985, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1986==null?"null":"" + Y1986, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1987==null?"null":"" + Y1987, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1988==null?"null":"" + Y1988, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1989==null?"null":"" + Y1989, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1990==null?"null":"" + Y1990, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1991==null?"null":"" + Y1991, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1992==null?"null":"" + Y1992, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1993==null?"null":"" + Y1993, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1994==null?"null":"" + Y1994, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1995==null?"null":"" + Y1995, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1996==null?"null":"" + Y1996, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1997==null?"null":"" + Y1997, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1998==null?"null":"" + Y1998, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1999==null?"null":"" + Y1999, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2000==null?"null":"" + Y2000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2001==null?"null":"" + Y2001, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2002==null?"null":"" + Y2002, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2003==null?"null":"" + Y2003, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2004==null?"null":"" + Y2004, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2005==null?"null":"" + Y2005, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2006==null?"null":"" + Y2006, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2007==null?"null":"" + Y2007, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2008==null?"null":"" + Y2008, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2009==null?"null":"" + Y2009, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2010==null?"null":"" + Y2010, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2011==null?"null":"" + Y2011, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2012==null?"null":"" + Y2012, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2013==null?"null":"" + Y2013, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2014==null?"null":"" + Y2014, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2015==null?"null":"" + Y2015, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2016==null?"null":"" + Y2016, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_NAME==null?"null":COUNTRY_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_CODE==null?"null":COUNTRY_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDICATOR_NAME==null?"null":INDICATOR_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INDICATOR_CODE==null?"null":INDICATOR_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1960==null?"null":"" + Y1960, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1961==null?"null":"" + Y1961, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1962==null?"null":"" + Y1962, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1963==null?"null":"" + Y1963, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1964==null?"null":"" + Y1964, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1965==null?"null":"" + Y1965, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1966==null?"null":"" + Y1966, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1967==null?"null":"" + Y1967, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1968==null?"null":"" + Y1968, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1969==null?"null":"" + Y1969, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1970==null?"null":"" + Y1970, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1971==null?"null":"" + Y1971, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1972==null?"null":"" + Y1972, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1973==null?"null":"" + Y1973, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1974==null?"null":"" + Y1974, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1975==null?"null":"" + Y1975, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1976==null?"null":"" + Y1976, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1977==null?"null":"" + Y1977, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1978==null?"null":"" + Y1978, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1979==null?"null":"" + Y1979, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1980==null?"null":"" + Y1980, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1981==null?"null":"" + Y1981, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1982==null?"null":"" + Y1982, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1983==null?"null":"" + Y1983, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1984==null?"null":"" + Y1984, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1985==null?"null":"" + Y1985, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1986==null?"null":"" + Y1986, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1987==null?"null":"" + Y1987, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1988==null?"null":"" + Y1988, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1989==null?"null":"" + Y1989, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1990==null?"null":"" + Y1990, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1991==null?"null":"" + Y1991, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1992==null?"null":"" + Y1992, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1993==null?"null":"" + Y1993, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1994==null?"null":"" + Y1994, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1995==null?"null":"" + Y1995, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1996==null?"null":"" + Y1996, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1997==null?"null":"" + Y1997, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1998==null?"null":"" + Y1998, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y1999==null?"null":"" + Y1999, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2000==null?"null":"" + Y2000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2001==null?"null":"" + Y2001, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2002==null?"null":"" + Y2002, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2003==null?"null":"" + Y2003, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2004==null?"null":"" + Y2004, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2005==null?"null":"" + Y2005, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2006==null?"null":"" + Y2006, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2007==null?"null":"" + Y2007, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2008==null?"null":"" + Y2008, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2009==null?"null":"" + Y2009, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2010==null?"null":"" + Y2010, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2011==null?"null":"" + Y2011, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2012==null?"null":"" + Y2012, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2013==null?"null":"" + Y2013, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2014==null?"null":"" + Y2014, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2015==null?"null":"" + Y2015, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y2016==null?"null":"" + Y2016, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY_NAME = null; } else {
      this.COUNTRY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY_CODE = null; } else {
      this.COUNTRY_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INDICATOR_NAME = null; } else {
      this.INDICATOR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INDICATOR_CODE = null; } else {
      this.INDICATOR_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1960 = null; } else {
      this.Y1960 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1961 = null; } else {
      this.Y1961 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1962 = null; } else {
      this.Y1962 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1963 = null; } else {
      this.Y1963 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1964 = null; } else {
      this.Y1964 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1965 = null; } else {
      this.Y1965 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1966 = null; } else {
      this.Y1966 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1967 = null; } else {
      this.Y1967 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1968 = null; } else {
      this.Y1968 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1969 = null; } else {
      this.Y1969 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1970 = null; } else {
      this.Y1970 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1971 = null; } else {
      this.Y1971 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1972 = null; } else {
      this.Y1972 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1973 = null; } else {
      this.Y1973 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1974 = null; } else {
      this.Y1974 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1975 = null; } else {
      this.Y1975 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1976 = null; } else {
      this.Y1976 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1977 = null; } else {
      this.Y1977 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1978 = null; } else {
      this.Y1978 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1979 = null; } else {
      this.Y1979 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1980 = null; } else {
      this.Y1980 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1981 = null; } else {
      this.Y1981 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1982 = null; } else {
      this.Y1982 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1983 = null; } else {
      this.Y1983 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1984 = null; } else {
      this.Y1984 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1985 = null; } else {
      this.Y1985 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1986 = null; } else {
      this.Y1986 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1987 = null; } else {
      this.Y1987 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1988 = null; } else {
      this.Y1988 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1989 = null; } else {
      this.Y1989 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1990 = null; } else {
      this.Y1990 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1991 = null; } else {
      this.Y1991 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1992 = null; } else {
      this.Y1992 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1993 = null; } else {
      this.Y1993 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1994 = null; } else {
      this.Y1994 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1995 = null; } else {
      this.Y1995 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1996 = null; } else {
      this.Y1996 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1997 = null; } else {
      this.Y1997 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1998 = null; } else {
      this.Y1998 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1999 = null; } else {
      this.Y1999 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2000 = null; } else {
      this.Y2000 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2001 = null; } else {
      this.Y2001 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2002 = null; } else {
      this.Y2002 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2003 = null; } else {
      this.Y2003 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2004 = null; } else {
      this.Y2004 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2005 = null; } else {
      this.Y2005 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2006 = null; } else {
      this.Y2006 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2007 = null; } else {
      this.Y2007 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2008 = null; } else {
      this.Y2008 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2009 = null; } else {
      this.Y2009 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2010 = null; } else {
      this.Y2010 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2011 = null; } else {
      this.Y2011 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2012 = null; } else {
      this.Y2012 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2013 = null; } else {
      this.Y2013 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2014 = null; } else {
      this.Y2014 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2015 = null; } else {
      this.Y2015 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2016 = null; } else {
      this.Y2016 = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY_NAME = null; } else {
      this.COUNTRY_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY_CODE = null; } else {
      this.COUNTRY_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INDICATOR_NAME = null; } else {
      this.INDICATOR_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INDICATOR_CODE = null; } else {
      this.INDICATOR_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1960 = null; } else {
      this.Y1960 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1961 = null; } else {
      this.Y1961 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1962 = null; } else {
      this.Y1962 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1963 = null; } else {
      this.Y1963 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1964 = null; } else {
      this.Y1964 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1965 = null; } else {
      this.Y1965 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1966 = null; } else {
      this.Y1966 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1967 = null; } else {
      this.Y1967 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1968 = null; } else {
      this.Y1968 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1969 = null; } else {
      this.Y1969 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1970 = null; } else {
      this.Y1970 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1971 = null; } else {
      this.Y1971 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1972 = null; } else {
      this.Y1972 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1973 = null; } else {
      this.Y1973 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1974 = null; } else {
      this.Y1974 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1975 = null; } else {
      this.Y1975 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1976 = null; } else {
      this.Y1976 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1977 = null; } else {
      this.Y1977 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1978 = null; } else {
      this.Y1978 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1979 = null; } else {
      this.Y1979 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1980 = null; } else {
      this.Y1980 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1981 = null; } else {
      this.Y1981 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1982 = null; } else {
      this.Y1982 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1983 = null; } else {
      this.Y1983 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1984 = null; } else {
      this.Y1984 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1985 = null; } else {
      this.Y1985 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1986 = null; } else {
      this.Y1986 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1987 = null; } else {
      this.Y1987 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1988 = null; } else {
      this.Y1988 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1989 = null; } else {
      this.Y1989 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1990 = null; } else {
      this.Y1990 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1991 = null; } else {
      this.Y1991 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1992 = null; } else {
      this.Y1992 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1993 = null; } else {
      this.Y1993 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1994 = null; } else {
      this.Y1994 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1995 = null; } else {
      this.Y1995 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1996 = null; } else {
      this.Y1996 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1997 = null; } else {
      this.Y1997 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1998 = null; } else {
      this.Y1998 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y1999 = null; } else {
      this.Y1999 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2000 = null; } else {
      this.Y2000 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2001 = null; } else {
      this.Y2001 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2002 = null; } else {
      this.Y2002 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2003 = null; } else {
      this.Y2003 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2004 = null; } else {
      this.Y2004 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2005 = null; } else {
      this.Y2005 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2006 = null; } else {
      this.Y2006 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2007 = null; } else {
      this.Y2007 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2008 = null; } else {
      this.Y2008 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2009 = null; } else {
      this.Y2009 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2010 = null; } else {
      this.Y2010 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2011 = null; } else {
      this.Y2011 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2012 = null; } else {
      this.Y2012 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2013 = null; } else {
      this.Y2013 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2014 = null; } else {
      this.Y2014 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2015 = null; } else {
      this.Y2015 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y2016 = null; } else {
      this.Y2016 = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    GENDER_STATS o = (GENDER_STATS) super.clone();
    return o;
  }

  public void clone0(GENDER_STATS o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("COUNTRY_NAME", this.COUNTRY_NAME);
    __sqoop$field_map.put("COUNTRY_CODE", this.COUNTRY_CODE);
    __sqoop$field_map.put("INDICATOR_NAME", this.INDICATOR_NAME);
    __sqoop$field_map.put("INDICATOR_CODE", this.INDICATOR_CODE);
    __sqoop$field_map.put("Y1960", this.Y1960);
    __sqoop$field_map.put("Y1961", this.Y1961);
    __sqoop$field_map.put("Y1962", this.Y1962);
    __sqoop$field_map.put("Y1963", this.Y1963);
    __sqoop$field_map.put("Y1964", this.Y1964);
    __sqoop$field_map.put("Y1965", this.Y1965);
    __sqoop$field_map.put("Y1966", this.Y1966);
    __sqoop$field_map.put("Y1967", this.Y1967);
    __sqoop$field_map.put("Y1968", this.Y1968);
    __sqoop$field_map.put("Y1969", this.Y1969);
    __sqoop$field_map.put("Y1970", this.Y1970);
    __sqoop$field_map.put("Y1971", this.Y1971);
    __sqoop$field_map.put("Y1972", this.Y1972);
    __sqoop$field_map.put("Y1973", this.Y1973);
    __sqoop$field_map.put("Y1974", this.Y1974);
    __sqoop$field_map.put("Y1975", this.Y1975);
    __sqoop$field_map.put("Y1976", this.Y1976);
    __sqoop$field_map.put("Y1977", this.Y1977);
    __sqoop$field_map.put("Y1978", this.Y1978);
    __sqoop$field_map.put("Y1979", this.Y1979);
    __sqoop$field_map.put("Y1980", this.Y1980);
    __sqoop$field_map.put("Y1981", this.Y1981);
    __sqoop$field_map.put("Y1982", this.Y1982);
    __sqoop$field_map.put("Y1983", this.Y1983);
    __sqoop$field_map.put("Y1984", this.Y1984);
    __sqoop$field_map.put("Y1985", this.Y1985);
    __sqoop$field_map.put("Y1986", this.Y1986);
    __sqoop$field_map.put("Y1987", this.Y1987);
    __sqoop$field_map.put("Y1988", this.Y1988);
    __sqoop$field_map.put("Y1989", this.Y1989);
    __sqoop$field_map.put("Y1990", this.Y1990);
    __sqoop$field_map.put("Y1991", this.Y1991);
    __sqoop$field_map.put("Y1992", this.Y1992);
    __sqoop$field_map.put("Y1993", this.Y1993);
    __sqoop$field_map.put("Y1994", this.Y1994);
    __sqoop$field_map.put("Y1995", this.Y1995);
    __sqoop$field_map.put("Y1996", this.Y1996);
    __sqoop$field_map.put("Y1997", this.Y1997);
    __sqoop$field_map.put("Y1998", this.Y1998);
    __sqoop$field_map.put("Y1999", this.Y1999);
    __sqoop$field_map.put("Y2000", this.Y2000);
    __sqoop$field_map.put("Y2001", this.Y2001);
    __sqoop$field_map.put("Y2002", this.Y2002);
    __sqoop$field_map.put("Y2003", this.Y2003);
    __sqoop$field_map.put("Y2004", this.Y2004);
    __sqoop$field_map.put("Y2005", this.Y2005);
    __sqoop$field_map.put("Y2006", this.Y2006);
    __sqoop$field_map.put("Y2007", this.Y2007);
    __sqoop$field_map.put("Y2008", this.Y2008);
    __sqoop$field_map.put("Y2009", this.Y2009);
    __sqoop$field_map.put("Y2010", this.Y2010);
    __sqoop$field_map.put("Y2011", this.Y2011);
    __sqoop$field_map.put("Y2012", this.Y2012);
    __sqoop$field_map.put("Y2013", this.Y2013);
    __sqoop$field_map.put("Y2014", this.Y2014);
    __sqoop$field_map.put("Y2015", this.Y2015);
    __sqoop$field_map.put("Y2016", this.Y2016);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("COUNTRY_NAME", this.COUNTRY_NAME);
    __sqoop$field_map.put("COUNTRY_CODE", this.COUNTRY_CODE);
    __sqoop$field_map.put("INDICATOR_NAME", this.INDICATOR_NAME);
    __sqoop$field_map.put("INDICATOR_CODE", this.INDICATOR_CODE);
    __sqoop$field_map.put("Y1960", this.Y1960);
    __sqoop$field_map.put("Y1961", this.Y1961);
    __sqoop$field_map.put("Y1962", this.Y1962);
    __sqoop$field_map.put("Y1963", this.Y1963);
    __sqoop$field_map.put("Y1964", this.Y1964);
    __sqoop$field_map.put("Y1965", this.Y1965);
    __sqoop$field_map.put("Y1966", this.Y1966);
    __sqoop$field_map.put("Y1967", this.Y1967);
    __sqoop$field_map.put("Y1968", this.Y1968);
    __sqoop$field_map.put("Y1969", this.Y1969);
    __sqoop$field_map.put("Y1970", this.Y1970);
    __sqoop$field_map.put("Y1971", this.Y1971);
    __sqoop$field_map.put("Y1972", this.Y1972);
    __sqoop$field_map.put("Y1973", this.Y1973);
    __sqoop$field_map.put("Y1974", this.Y1974);
    __sqoop$field_map.put("Y1975", this.Y1975);
    __sqoop$field_map.put("Y1976", this.Y1976);
    __sqoop$field_map.put("Y1977", this.Y1977);
    __sqoop$field_map.put("Y1978", this.Y1978);
    __sqoop$field_map.put("Y1979", this.Y1979);
    __sqoop$field_map.put("Y1980", this.Y1980);
    __sqoop$field_map.put("Y1981", this.Y1981);
    __sqoop$field_map.put("Y1982", this.Y1982);
    __sqoop$field_map.put("Y1983", this.Y1983);
    __sqoop$field_map.put("Y1984", this.Y1984);
    __sqoop$field_map.put("Y1985", this.Y1985);
    __sqoop$field_map.put("Y1986", this.Y1986);
    __sqoop$field_map.put("Y1987", this.Y1987);
    __sqoop$field_map.put("Y1988", this.Y1988);
    __sqoop$field_map.put("Y1989", this.Y1989);
    __sqoop$field_map.put("Y1990", this.Y1990);
    __sqoop$field_map.put("Y1991", this.Y1991);
    __sqoop$field_map.put("Y1992", this.Y1992);
    __sqoop$field_map.put("Y1993", this.Y1993);
    __sqoop$field_map.put("Y1994", this.Y1994);
    __sqoop$field_map.put("Y1995", this.Y1995);
    __sqoop$field_map.put("Y1996", this.Y1996);
    __sqoop$field_map.put("Y1997", this.Y1997);
    __sqoop$field_map.put("Y1998", this.Y1998);
    __sqoop$field_map.put("Y1999", this.Y1999);
    __sqoop$field_map.put("Y2000", this.Y2000);
    __sqoop$field_map.put("Y2001", this.Y2001);
    __sqoop$field_map.put("Y2002", this.Y2002);
    __sqoop$field_map.put("Y2003", this.Y2003);
    __sqoop$field_map.put("Y2004", this.Y2004);
    __sqoop$field_map.put("Y2005", this.Y2005);
    __sqoop$field_map.put("Y2006", this.Y2006);
    __sqoop$field_map.put("Y2007", this.Y2007);
    __sqoop$field_map.put("Y2008", this.Y2008);
    __sqoop$field_map.put("Y2009", this.Y2009);
    __sqoop$field_map.put("Y2010", this.Y2010);
    __sqoop$field_map.put("Y2011", this.Y2011);
    __sqoop$field_map.put("Y2012", this.Y2012);
    __sqoop$field_map.put("Y2013", this.Y2013);
    __sqoop$field_map.put("Y2014", this.Y2014);
    __sqoop$field_map.put("Y2015", this.Y2015);
    __sqoop$field_map.put("Y2016", this.Y2016);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
