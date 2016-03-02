import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class DictionaryReducer extends Reducer<Text,Text,Text,Text> {
   public void reduce(Text word, Iterable<Text> values, Context context ) throws IOException, InterruptedException {
      // TODO iterate through values, parse, transform, and write to context
   }
}
