package by.yermalovich.filtrationbenchmarks;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 3, warmups = 2)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class BenchmarkSuit {

    @Benchmark
    public void measureCustomPredicate(Blackhole blackhole, BenchmarkState state) {
        blackhole.consume(state.getCases().customPredicate());
    }

    @Benchmark
    public void measureFilterCain(Blackhole blackhole, BenchmarkState state) {
        blackhole.consume(state.getCases().filterCain());
    }

    @Benchmark
    public void measureSimpleIteration(Blackhole blackhole, BenchmarkState state) {
        blackhole.consume(state.getCases().customPredicate());
    }
}
