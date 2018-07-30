package com.datafibers.flink.table_api;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableEnvironment;
import org.apache.flink.table.api.java.BatchTableEnvironment;

/**
 * @author Richer_man
 * @date 2018-07-28 11:25
 * @descrip com.datafibers.flink.table_api
 */
public class WordCountSQL_Test_NPB {
    public static void main(String[] args) throws Exception{
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        BatchTableEnvironment tEnv = TableEnvironment.getTableEnvironment(env);


        DataSet<WC> input = env.fromElements(
                new WC("zhangsan",100),
                new WC("tianqi",200),
                new WC("lisi",300),
                new WC("wangwu",400));
        tEnv.registerDataSet("Person",input,"word,frequency");
        Table table = tEnv.sqlQuery("select * from Person");

        System.out.println("table.printSchema():\n----------------------------\n");
        table.printSchema();

        DataSet<WC> dataSet = tEnv.toDataSet(table,WC.class);
        dataSet.print();


    }
    public static class WC{
        public String word;
        public long frequency;

        public WC(String word, long frequency) {
            this.word = word;
            this.frequency = frequency;
        }
        @Override
        public String toString() {
            return "WC " + word + " " + frequency;
        }
        public WC() {
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public long getFrequency() {
            return frequency;
        }

        public void setFrequency(long frequency) {
            this.frequency = frequency;
        }
    }
}
