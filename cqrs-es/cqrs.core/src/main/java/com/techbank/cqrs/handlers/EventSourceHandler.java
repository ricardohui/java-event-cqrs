package com.techbank.cqrs.handlers;

import com.techbank.cqrs.domain.AggregateRoot;

public interface EventSourceHandler<T> {
    void save(AggregateRoot aggregate);

    T getById(String id);

    void republishEvents();
}
