package com.techbank.cqrs.queries;

import com.techbank.cqrs.domain.BaseEntity;

import java.util.List;

@FunctionalInterface
public interface QueryHandlerMethod <T extends BaseQuery>{
    List<BaseEntity> handler(T query);
}
