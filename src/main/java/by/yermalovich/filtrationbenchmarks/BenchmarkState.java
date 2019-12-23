package by.yermalovich.filtrationbenchmarks;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class BenchmarkState {
    private TestCases cases = new TestCases();

    public TestCases getCases() {
        return cases;
    }
}
