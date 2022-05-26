package com.techbank.cqrs.infrastructure;

import com.techbank.cqrs.domain.BaseEntity;
import com.techbank.cqrs.queries.BaseQuery;
import com.techbank.cqrs.queries.QueryHandlerMethod;

import java.util.List;

public interface QuertDispatcher {
    <T extends BaseQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> handler);

    <U extends BaseEntity> List<U> send(BaseQuery query);
}
