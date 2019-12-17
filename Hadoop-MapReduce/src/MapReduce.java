import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class MapReduce extends Configured implements Tool {

    public static void main(String[] args) throws Exception {
        int exitcode = ToolRunner.run(new MapReduce(), args);
        System.exit(exitcode);
    }
    @Override
    public int run(String[] args) throws Exception {
        if(args.length < 2){
            System.err.printf("Invalid arg!\n", getClass().getName());
            ToolRunner.printGenericCommandUsage(System.err);
            return 1;
        }
        Configuration conf = new Configuration();
        Job job = new Job(conf, "Word_Count");
        job.setJarByClass(MapReduce.class);
        job.setMapperClass(Map.class);
        job.setReducerClass(Reduce.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat .setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        boolean success = job.waitForCompletion(true);
        if(!success){
            throw new IllegalStateException("Job Failed!");
        }
        return 0;
    }
}
