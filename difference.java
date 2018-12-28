package com.revature;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.DoubleWritable;
public class Difference extends UDF {
    public DoubleWritable evaluate(DoubleWritable Y2010 , DoubleWritable Y2011 , 
    	DoubleWritable Y2012 , DoubleWritable Y2013 , DoubleWritable Y2014 , 
    	DoubleWritable Y2015 , DoubleWritable Y2016){
    	
    	int firstYear = 0;
    	double firstValue = 0.0;
    	int lastYear = 0;
    	double lastValue = 0.0;
    
    	if (Y2010!=null){
        	firstValue = Y2010.get();
        }
        else if (Y2011!=null){
        	firstYear = 2011;
        	firstValue = Y2011.get();
        }
        else if (Y2012!=null){
        	firstYear = 2012;
        	firstValue = Y2012.get();
        }
        else if (Y2013!=null){
        	firstYear = 2013;
        	firstValue = Y2013.get()
        }
        else if (Y2014!=null){
        	firstYear = 2014;
        	firstValue = Y2014.get();
        }
        else if (Y2015!=null){
        	firstYear = 2015;
        	firstValue = Y2015.get();
        }
        
        if (Y2016!=null){
        	lastYear = 2016;
        	lastValue = Y2016.get();
        }
        else if (Y2015!=null){
        	lastYear = 2015;
        	lastValue = Y2015.get();
        }
        else if (Y2014!=null){
        	lastYear = 2014;
        	lastValue = Y2014.get();
        }
        else if (Y2013!=null){
        	lastYear = 2013;
        	lastValue = Y2013.get();
        }
        else if (Y2012!=null){
        	lastYear = 2012;
        	lastValue = Y2012.get();
        }
        else if (Y2011!=null){
        	lastYear = 2011;
        	lastValue = Y2011.get();
        }
        
        if((firstValue!=0.0)&&(lastValue!=0.0)&&(firstYear!=lastYear)
        	&&(firstValue<1.0)&&(lastValue>firstValue)){
        	return new DoubleWritable(lastValue-firstValue);
        }
            
        return null;
    }
}