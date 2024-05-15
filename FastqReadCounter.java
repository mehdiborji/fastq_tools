import htsjdk.samtools.fastq.FastqReader;
import htsjdk.samtools.fastq.FastqRecord;

import java.io.File;

public class FastqReadCounter {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FastqReader reader = new FastqReader(new File(args[0]));
        int count = 0;
        for (FastqRecord record : reader) {
            count++;
        }
        reader.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Number of reads: " + count);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}