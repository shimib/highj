package org.highj.data.collection.list;

import org.highj._;
import org.highj.data.collection.List;
import org.highj.typeclass1.comonad.Extend;

public interface  ListExtend extends ListFunctor, Extend<List.µ> {
    @Override
    public default <A> List<_<List.µ, A>> duplicate(_<List.µ, A> nestedA) {
        //init . tails
        List<A> listA = List.narrow(nestedA);
        List<List<A>> result = listA.tailsLazy().initLazy();
        return List.<_<List.µ, A>,List<A>>contravariant(result);
    }
}
