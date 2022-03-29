package pl.Tests.AlgorithmsTesto;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import org.junit.Test;
import pl.Algorithms.CocktailSort;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class CocktailSortTest {
    private CocktailSort object;

    @Before
    public void setUp() {
        this.object=new CocktailSort();
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