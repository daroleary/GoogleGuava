package bbejeck.guava.chapter3.predicate;

import bbejeck.guava.common.model.Region;
import bbejeck.guava.common.model.State;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;

/**
 * User: Bill Bejeck
 * Date: 4/3/13
 * Time: 11:39 PM
 */
public class MidwestOrSouthwestRegionPredicate implements Predicate<State> {

    @Override
    public boolean apply(State input) {
        ImmutableList<Region> midwestAndSouthwest =
                ImmutableList.of(Region.MIDWEST, Region.SOUTHWEST);
        return midwestAndSouthwest.contains(input.getRegion());
    }
}
