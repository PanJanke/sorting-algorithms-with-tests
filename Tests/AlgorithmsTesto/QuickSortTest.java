package pl.Tests.AlgorithmsTesto;


import org.junit.Before;
import org.junit.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import pl.Algorithms.QuickSort;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {
    private QuickSort object;

    @Before
    public void setUp() {
        this.object=new QuickSort();
    }

    @Test
    public void timeoutOptimistic()
    {
        object.optimisticFill();
        assertTimeout(ofMillis(10000),()->{
            object.sort();
        });

    }

    @Test
    public void timeoutPesimistic()
    {
        object.pesimisticFill();
        assertTimeout(ofMillis(10000),()->{
            object.sort();
        });

    }
    @Test
    public void timeoutRandom()
    {
        object.randomFill();
        assertTimeout(ofMillis(10000),()->{
            object.sort();
        });

    }

}