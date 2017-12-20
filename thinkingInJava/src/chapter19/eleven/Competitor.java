package chapter19.eleven;

public interface Competitor<T extends Competitor<T>> {

	Outcome compete(T competitor);
}
