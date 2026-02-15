package com.example.utils;

import java.util.List;
import java.util.Objects;

public class BaseTransformer<E,M> {

    private final Class<E> entityClass;
    private final Class<M> modelClass;

    public BaseTransformer(Class<E> entityClass, Class<M> modelClass) {
        this.entityClass = entityClass;
        this.modelClass = modelClass;
    }

    public M toModel(E entity) {
        if(Objects.isNull(entity)){
            return null;
        }
        try{
            M model = modelClass.getDeclaredConstructor().newInstance();
            return model;
        }catch (Exception e){
            throw new RuntimeException("Error converting entity to model", e);
        }
    }

    public E toEntity(M model) {
        if(Objects.isNull(model)){
            return null;
        }
        try{
            E entity = entityClass.getDeclaredConstructor().newInstance();
            return entity;
        }catch (Exception e){
            throw new RuntimeException("Error converting model to entity", e);
        }
    }

    public List<E> toEntityList(List<M> modelList) {
        return modelList.stream().map(this::toEntity).toList();
    }

    public List<M> toModelList(List<E> entityList) {
        return entityList.stream().map(this::toModel).toList();
    }
}