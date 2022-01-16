package com.capitolio.hiremeskills.services.commons;

import java.util.Optional;

public interface RetrievingByIdService<E, I> {

    Optional<E> retrieveBy(I id);

}
