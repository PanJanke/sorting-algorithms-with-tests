package pl.Tests.AlgorithmsTesto;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;
import pl.Algorithms.InsertionSort;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {
    private InsertionSort object;

    @Before
    public void setUp() {
        this.object=new InsertionSort();
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