package com.revature;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.IntWritable;
public class LatestYear extends UDF {
    public IntWritable evaluate(DoubleWritable Y2010 , DoubleWritable Y2011 , 
    	DoubleWritable Y2012 , DoubleWritable Y2013 , DoubleWritable Y2014 , 
    	DoubleWritable Y2015 , DoubleWritable Y2016){
    
    	if (Y2016!=null){
        	return new IntWritable(2016);
        }
        else if (Y2015!=null){
        	return new IntWritable(2015);
        }
        else if (Y2014!=null){
        	return new IntWritable(2014);
        }
        else if (Y2013!=null){
        	return new IntWritable(2013);
        }
        else if (Y2012!=null){
        	return new IntWritable(2012);
        }
        else if (Y2011!=null){
        	return new IntWritable(2011);
        }
        
        return null;
    }
}