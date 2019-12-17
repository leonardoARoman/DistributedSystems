import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map extends Mapper<LongWritable , Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context)
    throws IOException, InterruptedException {
        String line = value.toString();
        StringTokenizer strTokenizer = new StringTokenizer(line);
        int counter = 0;
        int sum = 0;
        String w = "";
        while (strTokenizer.hasMoreTokens()) {
          counter++;
          String word = strTokenizer.nextToken().toLowerCase();
          if (counter == 2) {
            w += word;
          }
          if (counter > 2 && counter < 6) {
              sum += Integer.parseInt(word);
          }
        }
        context.write(new Text(w),new IntWritable(sum));
    }
}
