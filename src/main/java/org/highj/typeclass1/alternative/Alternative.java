package org.highj.typeclass1.alternative;

import org.highj._;
import org.highj.data.collection.Maybe;
import org.highj.typeclass1.monad.Applicative;

public interface Alternative<F> extends Applicative<F>, Plus<F> {

     //optional (Control.Applicative)
    public default <A> _<F, Maybe<A>> optional(_<F, A> nestedA) {
        _<F,Maybe<A>> ma = this.<A,Maybe<A>>map(Maybe::Just, nestedA);
        return mplus(ma, pure(Maybe.<A>Nothing()));
    }

}