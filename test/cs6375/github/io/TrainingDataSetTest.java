package cs6375.github.io;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrainingDataSetTest {
    @Test
    public void getEntropy() throws Exception {
        TrainingDataSet ds = new TrainingDataSet("resources/data_sets1/training_set.csv");
        assertEquals(1.0, ds.getEntropy(), 0);
    }

}