package pl.Tests.AlgorithmsTesto;



import org.junit.Before;
import pl.Algorithms.HeapSort;
import org.junit.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class HeapSortTest {
    private HeapSort object;

    @Before
    public void setUp() {
        this.object=new HeapSort();
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